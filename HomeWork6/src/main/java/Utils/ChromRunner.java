package Utils;

import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class ChromRunner {
    @BeforeTest
    public static void setup(){

        open("https://ee.ge/");


    }
}
