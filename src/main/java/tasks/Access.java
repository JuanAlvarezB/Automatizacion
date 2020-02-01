package tasks;

import userinterface.Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Access implements Task {
    private Page thePage;

    public static Access page() {

        return Tasks.instrumented(Access.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(thePage));
    }
}
