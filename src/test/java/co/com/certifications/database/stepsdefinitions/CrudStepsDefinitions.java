package co.com.certifications.database.stepsdefinitions;

import co.com.certification.database.models.Formulario;
import co.com.certification.database.questions.ValidateMessage;
import co.com.certification.database.tasks.LlenarFormulario;
import co.com.certification.database.userinterface.EditPage;
import co.com.certification.database.userinterface.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class CrudStepsDefinitions {
    @Managed
    private WebDriver driver;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("Usuario");
    }
    @Given("^el usuario esta en la pagina principal$")
    public void elUsuarioEstaEnLaPaginaPrincipal() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("http://computer-database.herokuapp.com/computers"));
    }

    @Given("^el usuario selecciona Add a new computer$")
    public void elUsuarioSeleccionaAddANewComputer() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_ADD_NEW_COMPUTER));
    }

    @When("^Llena toda la informacion del formulario$")
    public void llenaTodaLaInformacionDelFormulario(List<Formulario> formulario) {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormulario.llenar(formulario));
    }

    @Then("^el usuario da click en create this computer$")
    public void elUsuarioDaClickEnCreateThisComputer() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(EditPage.BTN_CREATE));
    }

    @Then("^se vizualiza el mensaje Done! Computer asd has been created$")
    public void seVizualizaElMensajeDoneComputerAsdHasBeenCreated() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMessage.validate(),Matchers.equalTo("Done! Computer asd has been created")));
    }

    @Given("^el usuario selecciona el computador con nombre (.*)$")
    public void elUsuarioSeleccionaElComputadorConNombre(String arg1) {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(HomePage.EDIT_COMPUTER_NAME.of(arg1)));
    }

    @When("^el usuario da click en el boton Delete$")
    public void elUsuarioDaClickEnElBotonDelete() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(EditPage.BTN_DELETE));

    }

    @Then("^se vizualiza el mensaje Done! Computer has been deleted$")
    public void seVizualizaElMensajeDoneComputerHasBeenDeleted() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMessage.validate(),Matchers.equalTo("Done! Computer has been deleted")));
    }

}
