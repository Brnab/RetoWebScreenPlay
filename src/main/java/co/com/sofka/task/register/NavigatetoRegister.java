package co.com.sofka.task.register;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

import static co.com.sofka.userInterface.register.registerForm.SignInButton;

public class NavigatetoRegister implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Scroll.to(SignInButton),
            Click.on(SignInButton)
    );

    }

    public static NavigatetoRegister navigatetoRegister(){
        return new NavigatetoRegister();
    }
}
