import Utils.ChromeStarter;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Proeqti2 extends ChromeStarter {
    @Test
    public void proeqti2(){
        $(by("src","/images/cart.png")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byId("search_list")).setValue("კომპიუტერი").pressEnter();
        $(byText("დაამატე კალათში"),0).click();
        $(by("src","/images/cart.png")).click();
        $(byText("სრული ღირებულება")).shouldBe(Condition.visible);
        $(byText("წაშლა")).click();
        $(by("src","/images/cart.png")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);

    }
}
