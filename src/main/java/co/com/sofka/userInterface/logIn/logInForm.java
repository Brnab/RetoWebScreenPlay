package co.com.sofka.userInterface.logIn;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class logInForm extends PageObject {
    public static final Target SignInButton = Target
            .the("SignIn")
            .located(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]"));

    public static final Target Email = Target
            .the("Email")
            .located(By.id("email"));

    public static final Target Password = Target
            .the("Password")
            .located(By.id("passwd"));

    public static final Target ButtonSignIn = Target
            .the("Sign In")
            .located(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]"));


}
