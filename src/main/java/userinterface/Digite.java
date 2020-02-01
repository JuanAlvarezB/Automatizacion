package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Digite {
    public static final Target KEYWORD = Target.the("KEYWORD")
            .located(By.id("search_keywords"));
    public static final Target SEARCH = Target.the("KEYWORD")
            .located(By.xpath("//*[@id='content']/div/div/div/div/div/section[12]/div/div/div/div/div/div[2]/div/div/div/form/div[1]/div[4]/input"));
}
