package co.com.sofka.dashboard;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class OverviewRegister {

    public static Question<String> Message(){
        return actor -> TextContent.of(WelcomeOverview.WelcomeMessage).viewedBy(actor).asString().trim();
    }

    public static Question<String> MessageFail(){
        return actor -> TextContent.of(WelcomeOverview.FailMessage).viewedBy(actor).asString().trim();
    }
    public static Question<String> MessageFailLogIn(){
        return actor -> TextContent.of(WelcomeOverview.FailMessageLogIn).viewedBy(actor).asString().trim();
    }


    public static Question<String> MessageContactUs(){
        return actor -> TextContent.of(WelcomeOverview.MessageContact).viewedBy(actor).asString().trim();
    }


    public static Question<String> MessageContactUsFail(){
        return actor -> TextContent.of(WelcomeOverview.MessageContactFail).viewedBy(actor).asString().trim();
    }



}
