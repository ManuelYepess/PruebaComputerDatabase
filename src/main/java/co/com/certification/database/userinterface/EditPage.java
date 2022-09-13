package co.com.certification.database.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EditPage {
    public static final Target INPUT_NAME = Target.the("COMPUTER NAME").
            located(By.id("name"));
    public static final Target INPUT_INTRODUCED_DATE = Target.the("INTRODUCES_DATE").
            located(By.id("introduced"));
    public static final Target INPUT_DISCONTINUED_DATE = Target.the("DISCONTINUED_DATE").
            located(By.id("discontinued"));
    public static final Target SELECT_COMPANY = Target.the("SELECT_COMPANY").
            located(By.id("company"));
    public static final  Target BTN_SAVE_THIS_COMPUTER = Target.the("BUTTON FILTER BY NAME").
            located(By.xpath("//input[@value='Save this computer']"));
    public static final  Target BTN_CANCEL = Target.the("BUTTON CANCEL").
            located(By.xpath("//*[@id='main']/form[1]/div/a"));
    public static final  Target BTN_DELETE = Target.the("BUTTON DELETE").
            located(By.xpath("//*[@id='main']/form[2]/input"));
    public static final  Target BTN_CREATE = Target.the("BUTTON DELETE").
            located(By.xpath("//*[@id='main']/form/div/input"));
}//input[@value='Create this computer'
