package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Dashboard;
import starter.pages.ManageUserPage;
import starter.pages.MembershipPage;
import starter.pages.SettingPage;

public class SettingScenarioSteps {
    @Steps
    Dashboard Dashboard;
    SettingPage settingPage;

    @Given("I am in dshboard page")
    public void onTheDashboard(){
        Dashboard.openPage();
        Dashboard.ClickDashboard();

    }

    @When("I click setting manage page button")
    public void clickMembershipBtn(){
       settingPage.clickSettingBtn();
    }


    @Then("i am on setting page")
    public void seeMembershipInformation(){
       settingPage.validateSettingTitle();
    }
}
