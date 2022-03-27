package co.com.sofka.stepdefinition.contacUs;

import co.com.sofka.dashboard.OverviewRegister;
import co.com.sofka.setUp.setUp;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import static co.com.sofka.task.contactUs.NavigateToContactUs.navigateToContactUs;
import static co.com.sofka.task.contactUs.contactUs.ContactUs;
import static co.com.sofka.task.contactUs.contactUsFail.ContactUsFail;
import static co.com.sofka.task.ladingpage.openLandingPage.OpenLandingPage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class contactUsStepDefinition extends setUp {

    Actor Bernabe = Actor.named("Bernabe");
    Faker faker = new Faker();

    @Given("me encuentro en la pagina web para contactarme")
    public void me_encuentro_en_la_pagina_web_para_contactarme() {
        actorSetupTheBrowser("Bernabe");
        theActorInTheSpotlight().wasAbleTo(OpenLandingPage());

    }



    @When("voy a la opcion de contactarme con la pagina")
    public void voy_a_la_opcion_de_contactarme_con_la_pagina() {
        theActorInTheSpotlight().attemptsTo(
                navigateToContactUs()
        );


    }



    @When("ingreso la informacion necesaria")
    public void ingreso_la_informacion_necesaria() {
        theActorInTheSpotlight().attemptsTo(

                ContactUs()
                        .usingEmail(faker.internet().emailAddress())
                        .usingReference(faker.phoneNumber().cellPhone())
                        .usingMessage(faker.ancient().titan())
        );



    }



    @Then("el sistema debe enviar el mensaje")
    public void el_sistema_debe_enviar_el_mensaje() {
        theActorInTheSpotlight().should(
                seeThat("El mensaje exitoso es el siguiente", OverviewRegister.MessageContactUs(), equalTo("Your message has been successfully sent to our team."))
        );


    }


    @Given("estoy en la pagina para enviar la info")
    public void estoy_en_la_pagina_para_enviar_la_info() {
        actorSetupTheBrowser("Bernabe");
        theActorInTheSpotlight().wasAbleTo(OpenLandingPage());

    }



    @When("voy a la opcion de contactar con la empresa")
    public void voy_a_la_opcion_de_contactar_con_la_empresa() {
        theActorInTheSpotlight().attemptsTo(
                navigateToContactUs()
        );
    }



    @When("no lleno el campo de mensaje")
    public void no_lleno_el_campo_de_mensaje() {
        theActorInTheSpotlight().attemptsTo(

                ContactUsFail()
                        .usingEmail(faker.internet().emailAddress())
                        .usingReference(faker.phoneNumber().cellPhone())

        );

    }



    @Then("el sistema debe mostrar un error")
    public void el_sistema_debe_mostrar_un_error() {
        theActorInTheSpotlight().should(

                seeThat("el mensaje de error es ", OverviewRegister.MessageContactUsFail(), equalTo("The message cannot be blank."))
        );


    }


}
