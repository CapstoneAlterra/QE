package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Dashboard;
import starter.pages.ManageOfflineClassPage;

public class ClassOfflineManagerScenariosSteps {
    @Steps
    Dashboard Dashboard;
    ManageOfflineClassPage manageOfflineClassPage;

    @Given("I am in dashboard page")
    public void onTheDashboard(){
        Dashboard.openPage();

    }

    @When("I click class offline manage page button")
    public void clickMembershipBtn(){
       manageOfflineClassPage.clickManageOffClassBtn();
    }


    @Then("i see the list of offline class")
    public void seeMembershipInformation(){
       manageOfflineClassPage.viewTableClass();
    }

}
