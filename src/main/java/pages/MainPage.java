package pages;

import driver.Driver;
import org.openqa.selenium.By;

public class MainPage {
    By profile= By.id("user_profile_icon");
    public static MainPage start(){
        //driver.start;
        Driver.start();
        return new MainPage();
    }
    public ProfilePage gotoProfile(){
        //find(profile).click();伪代码
        Driver.getCurrentDriver().findElement(profile).click();
        return new ProfilePage();
    }
}
