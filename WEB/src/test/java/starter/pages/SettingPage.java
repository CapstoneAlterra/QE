package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SettingPage extends PageObject {

    private By SettingBtn(){
        return By.xpath("//div[@id='__layout']/div/div/div/ul/li[7]/a/span");
    }

    private By SettingTitle(){
        return By.xpath("//div[@id='__layout']/div/div[2]/h1");
    }

    public void clickSettingBtn(){
        $(SettingBtn()).click();
    }

    public boolean validateSettingTitle(){
        return $(SettingTitle()).isDisplayed();
    }
}
