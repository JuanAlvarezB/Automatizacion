package stepdefinitions;

import model.Word;
import questions.TheMessage;
import questions.TheText;
import tasks.Access;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.EnterTo;
import tasks.Search;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class TestStepDefinition {

    @Before
    public void InitialSetup(){
        setTheStage(new OnlineCast());
    }

   @Given("^that juan want access to page of choucair$")
    public void thatJuanWantAccessToPageOfChoucair()  {
        theActorCalled("karen").wasAbleTo(Access.page());
    }

    @When("^he enters the jobs option$")
    public void heEntersTheJobsOption() {
        theActorInTheSpotlight().attemptsTo(EnterTo.theOption());
    }

    @Then("^he verify message (.*)$")
    public void heVerifyMessageConvocatorias(String message) {
    theActorInTheSpotlight().should(seeThat(TheMessage.is(), equalTo(message)));
    }

    @When("^perform a search for keyword$")
    public void performASearchForKeyword(List<Word> data)  {
        theActorInTheSpotlight().attemptsTo(Search.keyword(data.get(0)));

    }

    @Then("^he verify the text (.*)$")
    public void heVerifyTheTextServiceManager(String text)  {
        theActorInTheSpotlight().should(seeThat(TheText.is(), equalTo(text)));
    }


}
