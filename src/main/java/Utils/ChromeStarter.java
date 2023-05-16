package Utils;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class ChromeStarter {

    @BeforeMethod
    public static void setUp(){
        System.setProperty("selenide.browserSize", "1920x1080");
        open("https://ee.ge/");
    }


    @AfterMethod
    public void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }

}
