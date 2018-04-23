import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SignInPage;
import steps.DashboardSteps;
import steps.SignInSteps;

public class DashboardTests extends BasePage {

    DashboardSteps dashboardSteps = new DashboardSteps();
    SignInSteps signInSteps = new SignInSteps();

    @Test
    @Description("positive test that check that 'Sign in' was successfully passed")
    public void checkSignInProcedure(){
        signInSteps.clearAndFillLoginEmailInput(7, "VitalChep@bigmir.net");
        signInSteps.clearAndFillPasswordInput("Qwerty123");
        signInSteps.clickOnSignInButton();
        String accountName = dashboardSteps.getAccountNameText();
        Assert.assertEquals("vitalchep@bigmir.net", accountName);
    }
}


