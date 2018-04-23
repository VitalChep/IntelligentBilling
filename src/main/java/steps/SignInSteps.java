package steps;

import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.SignInPage;

public class SignInSteps extends BasePage{

    SignInPage signInPage = new SignInPage(driver);

    public void clearAndFillLoginEmailInput(long seconds, String value) {
        WebElement element = signInPage.getLoginEmailInput();
        waitUntilElementVisible(seconds, element);
        element.clear();
        element.sendKeys(value);
    }

    public void clearAndFillPasswordInput(String value) {
        WebElement element = signInPage.getLoginPasswordInput();
        element.clear();
        element.sendKeys(value);
    }

    public void clickOnSignInButton() {
        signInPage.getSignInButton().click();
    }

    public String getErrorMessageText( long seconds){
        WebElement element = signInPage.getErrorMessage();
        waitUntilElementVisible(seconds, element);
        return element.getText();
    }
}



