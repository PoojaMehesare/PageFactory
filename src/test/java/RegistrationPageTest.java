import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegistrationPageTest {
    @Test
    public void loginPageTest() {
        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        RegistrationPage2 page = new RegistrationPage2(driver);
        driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&prevRID=YCZ19CF6C8YN38PJQ6KY&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        page.setName("Puma");

    }
}

