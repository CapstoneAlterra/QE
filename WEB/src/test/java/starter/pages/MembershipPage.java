package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class MembershipPage extends PageObject {
    private By Membership_Btn(){
        return By.xpath("/html/body/div/div/div/div[1]/div/ul/li[3]/a/span");
    }

    private By MemberTable(){
        return By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/table");
    }
    private By Membership_Title(){
        return By.xpath("//div[@id='__layout']/div/div[2]/div/div/p");
    }

    public void clickMembershipBtn(){
        $(Membership_Btn()).click();
    }

    public boolean validateTitlePage(){
        return $(Membership_Title()).isDisplayed();
    }

    public boolean seeMemberTable(){
        return $(MemberTable()).isDisplayed();
    }
}
