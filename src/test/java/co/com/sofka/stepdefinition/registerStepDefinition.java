package co.com.sofka.stepdefinition;

import co.com.sofka.dashboard.OverviewRegister;
import co.com.sofka.setUp.setUp;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import static co.com.sofka.task.register.FillRegister.fillRegister;
import static co.com.sofka.task.register.NavigatetoRegister.navigatetoRegister;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import static co.com.sofka.task.ladingpage.openLandingPage.OpenLandingPage;
import static org.hamcrest.core.IsEqual.equalTo;

public class registerStepDefinition extends setUp {
    Actor Bernabe = Actor.named("Bernabe");
    Faker faker = new Faker();

    @Given("me encuentro en la pagina web")
    public void me_encuentro_en_la_pagina_web() {
        actorSetupTheBrowser("Bernabe");
        theActorInTheSpotlight().wasAbleTo(OpenLandingPage());

    }
    @When("navego a la opcion de inicion de sesion")
    public void navego_a_la_opcion_de_inicion_de_sesion() {
        theActorInTheSpotlight().attemptsTo(
                navigatetoRegister()
        );

    }
    @When("ingreso los datos solicitados de manera correcta")
    public void ingreso_los_datos_solicitados_de_manera_correcta() {
        theActorInTheSpotlight().attemptsTo(
            fillRegister()
                    .usingEmail(faker.internet().emailAddress())
                    .usingFirstName(faker.name().firstName())
                    .usingLastName(faker.name().lastName())
                    .usingPassword("1356648")
                    .usingAddress(faker.address().fullAddress())
                    .usingCity(faker.country().capital())
                    .usingZip("25635")
                    .usingMobile(faker.phoneNumber().cellPhone())
                    .usingAlias(faker.funnyName().name())

    );


    }
    @Then("el sistema debe crearme una cuenta")
    public void el_sistema_debe_crearme_una_cuenta() {

        theActorInTheSpotlight().should(

                seeThat( "el mensaje de bienvenida es ", OverviewRegister.Message() , equalTo("My account"))

        );




    }

    @Given("me encuentro en la pagina web en la cual me deseo registrar")
    public void me_encuentro_en_la_pagina_web_en_la_cual_me_deseo_registrar() {

        actorSetupTheBrowser("Bernabe");
        theActorInTheSpotlight().wasAbleTo(OpenLandingPage());

    }



    @When("navego a la opcion de registro de usuario")
    public void navego_a_la_opcion_de_registro_de_usuario() {
        theActorInTheSpotlight().attemptsTo(
                navigatetoRegister()
        );

    }



    @When("no ingreso el numero de telefono")
    public void no_ingreso_el_numero_de_telefono() {
        theActorInTheSpotlight().attemptsTo(
                fillRegister()
                        .usingEmail(faker.internet().emailAddress())
                        .usingFirstName(faker.name().firstName())
                        .usingLastName(faker.name().lastName())
                        .usingPassword("1356648")
                        .usingAddress(faker.address().fullAddress())
                        .usingCity(faker.country().capital())
                        .usingZip("25635")
                        .usingAlias(faker.funnyName().name())

        );

    }



    @Then("el sistema debe informar que hace falta el numero de telefono")
    public void el_sistema_debe_informar_que_hace_falta_el_numero_de_telefono() {

    }




}
