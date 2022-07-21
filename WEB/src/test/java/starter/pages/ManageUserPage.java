package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ManageUserPage extends PageObject {

    private By MngUsPage_Btn(){
        return By.xpath("//div[@id='__layout']/div/div/div/ul/li[2]/a/span");
    }

    private By TableUser(){
        return By.xpath("/html/body/div[1]/div/div/div[2]/div/div[3]/table");
    }
    private By RegisteredUserInfo(){
        return By.xpath("//div[@id='__layout']/div/div[2]/div/div/div/p");
    }


    public void cickUserManagerPage(){
        $(MngUsPage_Btn()).click();
    }

    public boolean registeredUserInfo(){
        return $(RegisteredUserInfo()).isDisplayed();
    }

    public boolean TableUserInfo(){
        return $(TableUser()).isDisplayed();
    }

}

