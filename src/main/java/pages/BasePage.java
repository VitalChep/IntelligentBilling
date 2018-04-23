package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

    public class BasePage {

        protected static WebDriver driver = new ChromeDriver();


        @BeforeMethod
        public void openSignInPage() {
            driver.get("https://my-sandbox.maxpay.com/#/signin");
            driver.manage().window().maximize();
        }


        public void waitUntilElementVisible(long timeOutInSeconds,WebElement element) {
            (new WebDriverWait(driver, timeOutInSeconds))
                    .until(ExpectedConditions.visibilityOf(element));
        }

        public void waitUntilElementClickable(long timeOutInSeconds, WebElement element) {
            (new WebDriverWait(driver, timeOutInSeconds))
                    .until(ExpectedConditions.elementToBeClickable(element));
        }

        @AfterMethod
        public void closeBrowser() {
            driver.quit();
        }
    }




