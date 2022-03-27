package co.com.sofka.question.logIn;

import co.com.sofka.dashboard.WelcomeOverview;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class logInSucessfull implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(WelcomeOverview.WelcomeMessage).getText();
    }
}
