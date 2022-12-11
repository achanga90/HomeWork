package HomeWork5;


import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class HomeWork5 extends ChromeRunner {
    @Test
    public void Test1(){


        $(byClassName("btn-register")).click();
        $(byClassName("registration-titles")).shouldBe(Condition.enabled, Duration.ofMillis(3000));
        $(byId("firstName")).setValue("achi");
        $(byId("firstName")).shouldNot(Condition.empty);
        $(byId("lastName")).setValue("changashvili");
        $(byId("lastName")).shouldNot(Condition.empty);
        $(byName("email")).setValue("achi@gmail.com");
        $(byId("password")).setValue("123456789");
        $(byId("confirmPassword")).setValue("123456789");
        $(byId("singup")).shouldBe(Condition.enabled);

        sleep(100000);
    }


}
