package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.LogicSessionPage;
import page.SessionPage;

public class UserSteps{

    SessionPage session = new SessionPage();
    LogicSessionPage genericFunctionsPage = new LogicSessionPage();

    @Given("^Open the browser sterling$")
    public void navigateToWebSiteBusinessCenter(){
        genericFunctionsPage.navigateToBusinessCenter();
    }

    @Given("^Login with valid credentials$")
    public void login(){
        session.insertUserName();
        session.insertPassword();
        session.selectButton();
    }

    @Then("^Close the session$")
    public void logout(){
        session.selectCloseButton();
    }
}