package co.com.certification.database.tasks;

import co.com.certification.database.models.Formulario;
import co.com.certification.database.userinterface.EditPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class LlenarFormulario implements Task {
    private String nombre;
    private String introduccion;
    private String descontinuacion;
    public LlenarFormulario(List<Formulario> formulario){
        this.nombre = formulario.get(0).getNombre();
        this.introduccion = formulario.get(0).getIntroduccion();
        this.descontinuacion = formulario.get(0).getDescontinuacion();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(nombre).into(EditPage.INPUT_NAME),
                Enter.theValue(introduccion).into(EditPage.INPUT_INTRODUCED_DATE),
                Enter.theValue(descontinuacion).into(EditPage.INPUT_DISCONTINUED_DATE));
    }
    public static LlenarFormulario llenar(List<Formulario> formulario){
        return Tasks.instrumented(LlenarFormulario.class, formulario);
    }
}
