package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Dashboard;

public class DahsboardScenarioSteps {

    @Steps
    Dashboard Dashboard;

    @Given("I am open the web")
    public void onTheWeb(){
        Dashboard.openPage();

    }

    @When("I click dashboard button")
    public void clickDashboardBtn(){
        Dashboard.ClickDashboard();
    }


    @Then("i see analytics information")
    public void onTheDashboard(){
        Dashboard.validateActiveMembershipInfo();
        Dashboard.validateTrainersInfo();
    }

}
