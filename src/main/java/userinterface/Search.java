package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Search {
    public static final Target WORD = Target.the("text")
            .located(By.xpath("//*[@id='content']/div/div/div/div/div/section[12]/div/div/div/div/div/div[2]/div/div/div/ul/li/a/div[1]/h3"));
}
