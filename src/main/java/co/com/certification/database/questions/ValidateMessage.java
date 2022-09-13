package co.com.certification.database.questions;

import co.com.certification.database.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateMessage implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return HomePage.MSG_DONE.resolveFor(actor).getText();
    }
    public static ValidateMessage validate(){
        return new ValidateMessage();
    }
}
