package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Dashboard;
import starter.pages.ManageUserPage;
import starter.pages.MembershipPage;

public class MembershipScenarioSteps {
    @Steps
    Dashboard Dashboard;
    MembershipPage membershipPage;

    @Given("I am on dashboard page")
    public void onTheDashboard(){
        Dashboard.openPage();
        Dashboard.ClickDashboard();

    }

    @When("I click membership user button")
    public void clickMembershipBtn(){
        membershipPage.clickMembershipBtn();
    }


    @Then("i see membership user information")
    public void seeMembershipInformation(){
        membershipPage.validateTitlePage();
        membershipPage.seeMemberTable();
    }
}
