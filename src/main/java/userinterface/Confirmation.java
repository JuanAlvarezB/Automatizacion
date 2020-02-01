package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Confirmation {

    public static final Target CONFIRM = Target.the("message")
            .located(By.xpath("//*[@id='content']/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/div/div/h3"));
}
