package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Dashboard;
import starter.pages.ManageOfflineClassPage;
import starter.pages.ManageOnlineClassPage;

public class ClassOnlineManageScenarioSteps {
    @Steps
    Dashboard Dashboard;
    ManageOnlineClassPage manageOnlineClassPage;

    @Given("I am in dashbord page")
    public void onTheDashboard(){
        Dashboard.openPage();

    }

    @When("I click class online manage page button")
    public void clickOnlineClassBtn(){
       manageOnlineClassPage.clickOnlineClassPage();
    }


    @Then("i see the list of online class")
    public void seeOnlineClassInformation(){
        manageOnlineClassPage.viewListClassTable();
    }
}
