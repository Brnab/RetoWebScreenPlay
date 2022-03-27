package co.com.sofka.task.ladingpage;

import co.com.sofka.userInterface.landingPage.LandingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class openLandingPage implements Task {

    private LandingPage landingPage;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Open.browserOn(landingPage)
        );

    }

public static openLandingPage OpenLandingPage(){
        return new openLandingPage();
}
}
