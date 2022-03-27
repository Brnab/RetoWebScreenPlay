package co.com.sofka.userInterface.contactUs;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class contactUsForm extends PageObject {

    public static final Target ContactUs = Target
            .the("Contact Us")
            .located(By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]"));

    public static final Target reason = Target
            .the("Subject")
            .located(By.id("id_contact"));

    public static final Target EmailContact = Target
            .the("Email")
            .located(By.id("email"));

    public static final Target Reference = Target
            .the("Order Reference")
            .located(By.id("id_order"));

    public static final Target Message = Target
            .the("Mensaje")
            .located(By.id("message"));

    public static final Target Send = Target
            .the("Send")
            .located(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/fieldset[1]/div[2]/button[1]/span[1]"));



}
