package HomeWork;

import Utils.ChromRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;


public class HomeWork6 extends ChromRunner {
    @Test
    public void Test() {
        
        $(byClassName("btn-register")).click();
        $(byClassName("registration-titles")).shouldBe(Condition.enabled, Duration.ofMillis(3000));
        SelenideElement FirstName = $(byId("firstName")).setValue("achi");
        Assert.assertFalse(FirstName.is(Condition.empty), "FirstName");

        String str_lastName = "changashvili";
        SelenideElement LastName = $(byId("lastName"));
        LastName.setValue(str_lastName);
        Assert.assertEquals(LastName.getValue(),str_lastName,"message lastName");

        $(byName("email")).setValue("achi@gmail.com");
        SelenideElement Password = $(byId("password")).setValue("123456789");
        SelenideElement ConPassword = $(byId("confirmPassword")).setValue("123456789");
        $(byId("singup")).shouldBe(Condition.enabled);


        SoftAssert soft = new SoftAssert();
        Assert.assertEquals(Password.getValue(),ConPassword.getValue(),"Password");
        soft.assertAll();
        sleep(3000);

    }
}
