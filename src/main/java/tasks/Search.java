package tasks;

import model.Word;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.Digite;



public class Search implements Task {

    private Word data;

    public Search (Word data){
        this.data = data;
    }

    public static Search keyword(Word data) {
        return Tasks.instrumented(Search.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.getKeyword()).into(Digite.KEYWORD),
                Click.on(Digite.SEARCH));
    }
}
