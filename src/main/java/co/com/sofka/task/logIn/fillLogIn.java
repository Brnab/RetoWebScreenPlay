package co.com.sofka.task.logIn;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userInterface.logIn.logInForm.*;

public class fillLogIn implements Task {

    private String email;
    private String password;


    public fillLogIn usingEmail(String email){
        this.email = email;
        return this;
    }
    public fillLogIn usingPassword(String password){
        this.password = password;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(Email),
                Click.on(Email),
                Enter.theValue(email).into(Email),

                Scroll.to(Password),
                Click.on(Password),
                Enter.theValue(password).into(Password),

                Scroll.to(ButtonSignIn),
                Click.on(ButtonSignIn)


        );

    }
    public static fillLogIn FillLogin(){
        return new fillLogIn();
    }
}
