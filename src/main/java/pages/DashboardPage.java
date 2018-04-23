package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id = 'setting']")
    private WebElement settingDropdownBtn;

    @FindBy(xpath = "//*[contains(@class, 'dropdown-menu')]//*[contains(@class,'text-primary')]")
    private WebElement accountName;


    public WebElement getSettingDropdownBtn() {
        return settingDropdownBtn;
    }

    public WebElement getAccountName() {
        return accountName;
    }
}


