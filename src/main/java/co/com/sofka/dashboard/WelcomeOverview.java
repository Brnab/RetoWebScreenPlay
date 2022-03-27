package co.com.sofka.dashboard;

import org.openqa.selenium.By;

public class WelcomeOverview {

    public static By WelcomeMessage = By.xpath("//h1[contains(text(),'My account')]");

    public static By FailMessage = By.xpath("//p[contains(text(),'You must register at least one phone number.')]");

    public static By FailMessageLogIn = By.xpath("//li[contains(text(),'Authentication failed.')]");

}
