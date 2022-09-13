package co.com.certifications.database.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/CRUD.feature",
        glue = "co.com.certifications.database.stepsdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@borrar")
public class Crud {
}
