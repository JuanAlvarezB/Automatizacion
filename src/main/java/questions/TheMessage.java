package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.Confirmation;

public class TheMessage implements Question<String> {

    public static TheMessage is() {
        return new TheMessage();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(Confirmation.CONFIRM).viewedBy(actor).asString();
    }
}
