
package Pages;

        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.ui.Select;

        import commons.BasePage;

public class GoogleLogin extends BasePage {

    public GoogleLogin(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    @FindBy(xpath = "//A[@href='https://staging.twohootsapp.com/login/google']")
    WebElement loginGoogle;

    @FindBy(xpath = "(//DIV[@class='lCoei YZVTmd SmR8'])[2]")
    WebElement useAnotherAccount;

    @FindBy(xpath = "//INPUT[@id='identifierId']")
    WebElement EmailPhone;

    @FindBy(xpath = "(//DIV[@class='VfPpkd-RLmnJb'])[1]")
    WebElement nextClick;

    @FindBy(xpath = "//INPUT[@type='password']")
    WebElement password;

    @FindBy(xpath = "(//DIV[@class='VfPpkd-RLmnJb'])[1]")
    WebElement nextClick2;

    private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

    public void loginGoogle() {
        wait.forElementToBeVisible(loginGoogle);
        click(loginGoogle);
    }

    public void EmailPhone(String username1) {
        wait.forElementToBeVisible(EmailPhone);
        sendKeys(EmailPhone, username1);
    }

    public void nextClick() {
        wait.forElementToBeVisible(nextClick);
        click(nextClick);
        }

    public void password(String password1) {
        wait.forElementToBeVisible(password);
        sendKeys(password, password1);
    }
    public void nextClick2() {
        wait.forElementToBeVisible(nextClick2);
        click(nextClick2);
    }

}
