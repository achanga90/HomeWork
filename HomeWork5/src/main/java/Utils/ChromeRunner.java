package Utils;



import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class ChromeRunner {
    @BeforeTest

    public static void Runner (){
        open("https://ee.ge/");

    }
}
