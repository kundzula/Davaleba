import Utils.ChromeStarter;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class Proeqti extends ChromeStarter {
    @Test
    public void proeqti (){
        $("#search_list").setValue("მობილური").pressEnter();
        sleep(2000);
        $("#sort").selectOption("ფასი ზრდადობით");


        }

}
 