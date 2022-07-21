package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Dashboard;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    Dashboard Dashboard;

    @Given("I am on login page")
    public void onTheLoginPage(){
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }

    @When("I input valid email")
    public void inputValidEmail(){
        loginPage.inputEmail("admin@mail.com");
    }

    @And("i input valid password")
    public void inputValidPassword(){
        loginPage.inputPassword("admin");
    }

    @And("I click login button")
    public void clickLoginBtn(){
        loginPage.clickLoginButton();
    }

    @Then("I am on the dashboard")
    public void onTheDashboard(){

    }

    @When("I input invalid email")
    public void inputLockedUsername(){
        loginPage.inputEmail("123");
    }

    @Then("I can see error message")
    public void iCanSeeErrorMessage() {
        loginPage.validateErrorMessageDisplayed();
    }

}
