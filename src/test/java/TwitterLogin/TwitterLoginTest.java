package TwitterLogin;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * Created by Çelik on 8.6.2016.
 */
public class TwitterLoginTest  {

    @Test
    @When("^Username Password Yazılır$")
    public void usernamePasswordYazılır() throws Throwable {
        TwitterLogin NewPage = new TwitterLogin(driver);
        NewPage.loginingPage();
    }
}
