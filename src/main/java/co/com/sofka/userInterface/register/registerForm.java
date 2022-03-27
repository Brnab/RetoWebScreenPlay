package co.com.sofka.userInterface.register;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class registerForm extends PageObject {
    public static final Target SignInButton = Target
            .the("SignIn")
            .located(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]"));
    public static final Target Email = Target
            .the("Email")
            .located(By.id("email_create"));
    public static final Target CreateAccount = Target
            .the("Create Account")
            .located(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]"));
    public static final Target First_Name = Target
            .the("First Name")
            .located(By.xpath("//input[@id='customer_firstname']"));

    public static final Target Last_Name = Target
            .the("Last Name")
            .located(By.id("customer_lastname"));
    public static final Target PassWord = Target
            .the("Password")
            .located(By.id("passwd"));
    public static final Target firstName = Target
            .the("First Name")
            .located(By.id("firstname"));

    public static final Target lastName = Target
            .the("Last Name")
            .located(By.id("lastname"));
    public static final Target Address = Target
            .the("Address")
            .located(By.id("address1"));
    public static final Target City = Target
            .the("City")
            .located(By.id("city"));
    public static final Target State = Target
            .the("State")
            .located(By.id("id_state"));
    public static final Target ZipCode = Target
            .the("Zip/Postal Code")
            .located(By.id("postcode"));

    public static final Target MobilePhone = Target
            .the("Mobile phone")
            .located(By.id("phone_mobile"));
    public static final Target Alias = Target
            .the("Alias address")
            .located(By.id("alias"));
    public static final Target Register = Target
            .the("Register")
            .located(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]"));



}
