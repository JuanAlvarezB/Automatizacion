package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.Confirmation;
import userinterface.Search;

public class TheText implements Question<String> {

    public static TheText is() {
        return new TheText();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(Search.WORD).viewedBy(actor).asString();
    }
}
