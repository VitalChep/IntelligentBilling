package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage  {

    public SignInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id = 'login-email']")
    private WebElement loginEmailInput;

    @FindBy(xpath = "//*[@id = 'login-password']")
    private WebElement loginPasswordInput;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElement signInButton;

    @FindBy(xpath = " //*[contains(@class, 'alert-danger')]")
    private WebElement errorMessage;

    public WebElement getLoginEmailInput() {
        return loginEmailInput;
    }

    public WebElement getLoginPasswordInput() {
        return loginPasswordInput;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }
}


