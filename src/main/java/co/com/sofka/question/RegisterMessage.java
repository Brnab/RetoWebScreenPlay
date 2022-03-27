package co.com.sofka.question;

import co.com.sofka.dashboard.WelcomeOverview;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class RegisterMessage implements Question<String> {

    public static Question<String> value(){
        return new RegisterMessage();
    }
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(WelcomeOverview.WelcomeMessage).getText();
    }
}
