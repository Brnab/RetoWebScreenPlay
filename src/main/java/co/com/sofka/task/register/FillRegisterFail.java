package co.com.sofka.task.register;

import co.com.sofka.userInterface.register.registerForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.sofka.userInterface.register.registerForm.*;
import static co.com.sofka.userInterface.register.registerForm.Register;

public class FillRegisterFail implements Task {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String Address;
    private String City;
    private String state;
    private String Zip;
    private String Mobile;
    private String alias;


    public FillRegisterFail usingEmail(String email){
        this.email = email;
        return this;
    }

    public FillRegisterFail usingFirstName(String firstname){
        this.firstName = firstname;
        return this;
    }

    public FillRegisterFail usingLastName(String lastName){
        this.lastName = lastName;
        return this;
    }


    public FillRegisterFail usingPassword(String password){
        this.password = password;
        return this;
    }

    public FillRegisterFail usingAddress(String address){
        this.Address = address;
        return this;
    }

    public FillRegisterFail usingCity(String city){
        this.City = city;
        return this;
    }

    public FillRegisterFail usingState(String state){
        this.state = state;
        return this;
    }


    public FillRegisterFail usingZip(String Zip){
        this.Zip = Zip;
        return this;
    }

    public FillRegisterFail usingMobile(String mobile){
        this.Mobile = mobile;
        return this;
    }
    public FillRegisterFail usingAlias(String Alias){
        this.alias = Alias;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(Email),

                Enter.theValue(email).into(Email),

                Scroll.to(CreateAccount),
                Click.on(CreateAccount),




                Scroll.to(First_Name),
                Click.on(First_Name),
                Enter.theValue(firstName).into(First_Name),

                Scroll.to(Last_Name),
                Click.on(Last_Name),
                Enter.theValue(lastName).into(Last_Name),


                Scroll.to(PassWord),
                Click.on(PassWord),
                Enter.theValue(password).into(PassWord),



                Scroll.to(registerForm.firstName),


                Scroll.to(registerForm.lastName),


                Scroll.to(registerForm.Address),
                Click.on(registerForm.Address),
                Enter.theValue(Address).into(registerForm.Address),

                Scroll.to(registerForm.City),
                Click.on(registerForm.City),
                Enter.theValue(City).into(registerForm.City),

                Scroll.to(State),
                Click.on(State),
                SelectFromOptions.byVisibleText("Florida").from(State),


                Scroll.to(ZipCode),
                Click.on(ZipCode),
                Enter.theValue(Zip).into(ZipCode),



                Scroll.to(Alias),
                Click.on(Alias),
                Enter.theValue(alias).into(Alias),


                Scroll.to(Register),
                Click.on(Register)












        );

    }

    public static FillRegisterFail fillRegisterFail(){
        return new FillRegisterFail();
    }

    }

