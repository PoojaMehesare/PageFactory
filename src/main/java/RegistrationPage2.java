import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegistrationPage2 {

    WebDriver driver;

    @FindBy(name = "customerName")
    WebElement Name;

    RegistrationPage2(WebDriver d) {
        this.driver = d;
        PageFactory.initElements(d,this);
    }
    public void setName(String s) {

        Name.sendKeys("Puma");
    }
}


