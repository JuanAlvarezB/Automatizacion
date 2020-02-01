package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Option {

        public static final Target JOBS = Target.the("option jobs").
                located(By.id("menu-item-550"));
}
