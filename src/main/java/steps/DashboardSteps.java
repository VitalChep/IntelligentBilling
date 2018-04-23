package steps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.DashboardPage;
import pages.SignInPage;

public class DashboardSteps extends  BasePage{


    DashboardPage dashboardPage = new DashboardPage(driver);


    public void clickOnSettingDropdownBtn(long seconds) {
        WebElement element = dashboardPage.getSettingDropdownBtn();
        waitUntilElementClickable(seconds, element);
        element.click();
    }

    public String getAccountNameText(){
        clickOnSettingDropdownBtn(10);
        return dashboardPage.getAccountName().getText();
    }
}

