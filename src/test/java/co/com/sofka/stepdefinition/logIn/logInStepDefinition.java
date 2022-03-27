package co.com.sofka.stepdefinition.logIn;

import co.com.sofka.dashboard.OverviewRegister;
import co.com.sofka.setUp.setUp;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import static co.com.sofka.task.ladingpage.openLandingPage.OpenLandingPage;
import static co.com.sofka.task.logIn.fillLogIn.FillLogin;
import static co.com.sofka.task.register.NavigatetoRegister.navigatetoRegister;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class logInStepDefinition extends setUp {
    Actor Bernabe = Actor.named("Bernabe");
    Faker faker = new Faker();


    @Given("me encuentro en la pagina")
    public void me_encuentro_en_la_pagina() {
        actorSetupTheBrowser("Bernabe");
        theActorInTheSpotlight().wasAbleTo(OpenLandingPage());


    }



    @When("voy a iniciar sesion")
    public void voy_a_iniciar_sesion() {
        theActorInTheSpotlight().attemptsTo(
                navigatetoRegister()
        );

    }



    @When("ingreso mis datos")
    public void ingreso_mis_datos() {

        theActorInTheSpotlight().attemptsTo(
                FillLogin()
                        .usingEmail("pepitoperez5@gmail.com")
                        .usingPassword("123456")

        );


    }



    @Then("el sistema deberia dejarme ingresar a la cuenta")
    public void el_sistema_deberia_dejarme_ingresar_a_la_cuenta() {
        theActorInTheSpotlight().should(

                seeThat("el mensaje de bienvenida es", OverviewRegister.Message(), equalTo("My account"))
        );


    }

    @Given("estoy en la pagina web")
    public void estoy_en_la_pagina_web() {
        actorSetupTheBrowser("Bernabe");
        theActorInTheSpotlight().wasAbleTo(OpenLandingPage());
    }



    @When("me dispongo a iniciar sesion")
    public void me_dispongo_a_iniciar_sesion() {
        theActorInTheSpotlight().attemptsTo(
                navigatetoRegister()
        );


    }



    @When("ingreso los datos de un usuario no registrado")
    public void ingreso_los_datos_de_un_usuario_no_registrado() {

        theActorInTheSpotlight().attemptsTo(
        FillLogin()
                .usingEmail(faker.internet().emailAddress())
                .usingPassword(faker.internet().password())

        );

    }



    @Then("el sistema debe mostrar error al iniciar")
    public void el_sistema_debe_mostrar_error_al_iniciar() {

        theActorInTheSpotlight().should(

                seeThat("el mensaje de error es el siguiente ", OverviewRegister.MessageFailLogIn(), equalTo("Authentication failed."))
        );


    }

}
