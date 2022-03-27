package co.com.sofka.runners.contactUs;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/contactUs/contactUs.feature"},
        glue = {"co.com.sofka.stepdefinition.contacUs"},
        tags = {""}
)
public class contactUsTest {
}
