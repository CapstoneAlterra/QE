package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ManageOfflineClassPage extends PageObject {

    private By ManageOffClass_Btn(){
        return By.xpath("//div[@id='__layout']/div/div/div/ul/li[4]/a/span");
    }

    private By TableClassOffline(){
        return By.xpath("/html/body/div[1]/div/div/div[2]/div/div[3]/table");
    }

    public void clickManageOffClassBtn(){
        $(ManageOffClass_Btn()).click();
    }

    public boolean viewTableClass(){
        return $(TableClassOffline()).isDisplayed();
    }
}
