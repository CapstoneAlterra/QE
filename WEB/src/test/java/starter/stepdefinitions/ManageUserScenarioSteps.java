package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Dashboard;
import starter.pages.ManageUserPage;

public class ManageUserScenarioSteps {
    @Steps
    Dashboard Dashboard;
    ManageUserPage manageUserPage;

    @Given("I am open the website")
    public void onTheWebsite(){
        Dashboard.openPage();

    }

    @When("I click manage user button")
    public void clickMngUserBtn(){
        manageUserPage.cickUserManagerPage();
    }


    @Then("i see user information")
    public void seeUserInformation(){
        manageUserPage.registeredUserInfo();
        manageUserPage.TableUserInfo();
    }
}
