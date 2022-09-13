package co.com.certification.database.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage
{
    public static final Target BTN_ADD_NEW_COMPUTER = Target.the("ADD A NEW COMPUTER").
            located(By.id("add"));
    public static final  Target BTN_FILTER = Target.the("BUTTON FILTER BY NAME").
            located(By.id("searchsubmit"));
    public static final  Target INPUT_FILTER = Target.the("INPUT FILTER BY NAME").
            located(By.id("searchbox"));
    public static final Target EDIT_COMPUTER_NAME = Target.the("NAME OF COMPUTER").
            locatedBy(" //*[contains(text(),'{0}')]");
    public static final Target MSG_DONE = Target.the("NAME OF COMPUTER").
            locatedBy(" //*[@id='main']/div[1]");

}
