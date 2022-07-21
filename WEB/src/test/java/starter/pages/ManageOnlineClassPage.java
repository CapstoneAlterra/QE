package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v85.page.Page;

public class ManageOnlineClassPage extends PageObject {

    private By ManageOnClass_Btn(){
        return By.xpath("/html/body/div/div/div/div[1]/div/ul/li[5]/a/span");
    }

    private By TableOnlineClass(){
        return By.xpath("//div[@id='__layout']/div/div[2]/div/div[4]/table/thead/tr/th");
    }

    public void clickOnlineClassPage(){
        $(ManageOnClass_Btn()).click();
    }

    public boolean viewListClassTable(){
        return $(TableOnlineClass()).isDisplayed();
    }


}
