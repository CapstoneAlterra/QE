package starter.pages;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject{
    private  By goToLogin() { return By.xpath("/html/body/div/div/div/div[2]/a");}
    private By loginPageImg(){
     return By.xpath("/html/body/div/div/div/div/div[1]/img");
    }

    private  By emailField(){
        return By.xpath("/html/body/div/div/div/div/div[2]/input");
    }
    private By passwordField(){
        return By.xpath("/html/body/div/div/div/div/div[3]/input");
    }

    private By loginButton(){
        return By.xpath("/html/body/div/div/div/div/button");
    }

    private By errorMessage(){
        return By.xpath("//h2[@id='swal2-title']");
    }

    @Step
    public void openPage() {
        openUrl("https://zippy-bublanina-6be659.netlify.app/");
        $(goToLogin()).click();
    }

    @Step
    public boolean validateOnLoginPage(){
        return $(loginPageImg()).isDisplayed();
    }


    @Step
    public void inputEmail(String email){
    $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }

    @Step
    public boolean validateErrorMessageDisplayed(){
        return $(errorMessage()).isDisplayed();
    }


}
