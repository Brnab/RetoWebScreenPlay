package co.com.sofka.task.contactUs;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.sofka.userInterface.contactUs.contactUsForm.*;


public class contactUs implements Task {
    private String email;
    private String reference;
    private String message;


    public contactUs usingEmail(String email){
        this.email = email;
        return this;
    }

    public contactUs usingReference(String reference){
        this.reference= reference;
        return this;
    }

    public contactUs usingMessage(String message){
        this.message= message;
        return this;
    }




    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(reason),
                Click.on(reason),
                SelectFromOptions.byVisibleText("Customer service").from(reason),



                Scroll.to(EmailContact),
                Click.on(EmailContact),
                Enter.theValue(email).into(EmailContact),

                Scroll.to(Reference),
                Click.on(Reference),
                Enter.theValue(reference).into(Reference),

                Scroll.to(Message),
                Click.on(Message),
                Enter.theValue(message).into(Message),

                Scroll.to(Send),
                Click.on(Send)
        );

    }
    public static contactUs ContactUs(){
        return new contactUs();
    }
}
