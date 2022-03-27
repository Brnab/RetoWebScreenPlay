package co.com.sofka.runners.logIn;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/logIn/login.feature"},
        glue = {"co.com.sofka.stepdefinition.logIn"},
        tags = {""}
)
public class logInTest {
}
