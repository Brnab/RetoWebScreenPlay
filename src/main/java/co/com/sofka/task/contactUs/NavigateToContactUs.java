package co.com.sofka.task.contactUs;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userInterface.contactUs.contactUsForm.ContactUs;

public class NavigateToContactUs implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ContactUs),
                Click.on(ContactUs)

        );
    }

    public static NavigateToContactUs navigateToContactUs(){
        return new NavigateToContactUs();
    }
}
