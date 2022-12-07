package test;

import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class HomeWork4 {
    @Test
    public void HomeWork4(){
        open("https://www.facebook.com/");
        $(byText("Create new account")).click();
        sleep(100);
        $(byName("firstname")).click();
        $(byName("firstname")).setValue("Achi");
        sleep(100);
        $(byName("lastname")).click();
        $(byName("lastname")).setValue("Changashvili");
        $(byName("reg_email__")).click();
        $(byName("reg_email__")).setValue("577111222");
        sleep(100);
        $(byName("reg_passwd__")).click();
        $(byName("reg_passwd__")).setValue("123456789");
        sleep(100);
        $(byName("birthday_month")).click();
        $(byName("birthday_month")).selectOption("Nov");
        $(byName("birthday_day")).click();
        $(byName("birthday_day")).selectOption(13);
        $(byName("birthday_year")).click();
        $(byId("year")).selectOption(32);
        $(byName("sex"),2).click();
        $(byName("preferred_pronoun")).click();
        sleep(100);
        $(byClassName("_7-16")).selectOption(1);
        $(byName("preferred_pronoun")).click();
        sleep(100);
        $(byName("sex"),1).click();
        sleep(10000);






    }

}
