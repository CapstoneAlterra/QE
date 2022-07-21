package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Dashboard extends PageObject {
    private By Dashboard_Btn() {
        return By.xpath("/html/body/div/div/div/div[1]/div/ul/li[1]/a/span");
    }

    private By Active_info(){
        return By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/p[1]");
    }

    private By trainer_info(){
        return By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/h5");
    }

    @Step
    public void ClickDashboard(){
    $(Dashboard_Btn()).click();
    }

    @Step
    public void validateActiveMembershipInfo(){
        $(Active_info()).isDisplayed();
    }

    @Step
    public void validateTrainersInfo(){
        $(trainer_info()).isDisplayed();
    }
    @Step
    public void openPage(){
        openUrl("https://zippy-bublanina-6be659.netlify.app/admin");
    }

}
