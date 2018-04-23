import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import steps.DashboardSteps;
import steps.SignInSteps;


public class SignInUiTests extends BasePage {


    SignInSteps signInSteps = new SignInSteps();

    @Test
    @Description("negative test that check that 'Sign in' was failed")
    public void checkSignInRrorMessage(){
        signInSteps.clearAndFillLoginEmailInput(7, "Vital@bigmir.net");
        signInSteps.clearAndFillPasswordInput("Qwerty12");
        signInSteps.clickOnSignInButton();
        String errorMessage = signInSteps.getErrorMessageText( 7);
        Assert.assertEquals("Некорректны пароль или email", errorMessage);
    }
}

