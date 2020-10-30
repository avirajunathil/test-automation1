package Pages;

        import java.awt.*;
        import java.awt.datatransfer.StringSelection;
        import java.awt.event.KeyEvent;

        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.ui.Select;


        import commons.BasePage;
        import org.testng.Assert;

public class OptionalDetails extends BasePage {

    public OptionalDetails(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    @FindBy(xpath = "//SELECT[@id='impact-field']")
    WebElement effectOfIssue;

    @FindBy(xpath = "//INPUT[@name='other-impact']")
    WebElement SpecifyIssue;

    @FindBy(css = "#outcome-field1")
    WebElement resolution;

    @FindBy(xpath = "//SELECT[@id='contactattempts-field']")
    WebElement contactAttempts;

    @FindBy(xpath = "//SELECT[@id='experience-field2']")
    WebElement experience;

    @FindBy(xpath = "//INPUT[@name='other-experience']")
    WebElement specifyExperience;

    @FindBy(xpath = "//IMG[@src='/assets/img/icons/55px-Icon_Flyout-menu.png']")
    WebElement clickOnOption;
    @FindBy(xpath = "//A[@href='https://staging.twohootsapp.com/logout'][text()='Logout']")
    WebElement logout;

    @FindBy(xpath = "//BUTTON[@id='btn-next']")
    WebElement doneButton;

    private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

    public void resolutionNeed() {
        wait.forElementToBeVisible(effectOfIssue);
        Select ab = new Select(effectOfIssue);
        ab.selectByValue("8");

    }

    public void specifyTheIssue() {
        wait.forElementToBeVisible(SpecifyIssue);
        sendKeys(SpecifyIssue, "Credit Score");
    }

    public void effectofTheIssue() {
        wait.forElementToBeVisible(resolution);
        Select ab = new Select(resolution);
        ab.selectByValue("1");

    }

    public void numberOfAttempts() {
        wait.forElementToBeVisible(contactAttempts);
        Select ab = new Select(contactAttempts);
        ab.selectByValue("3");

    }

    public void userExperience() {
        wait.forElementToBeVisible(experience);
        Select ab = new Select(experience);
        ab.selectByValue("16");

    }

    public void specifyUsr() {
        wait.forElementToBeVisible(specifyExperience);
        sendKeys(specifyExperience, "Bank declined the didpute twice");
    }

    public void draftTheComplaint() {
        wait.forElementToBeVisible(doneButton);
        click(doneButton);
    }

    /*public void optionsLogout() {
        wait.forElementToBeVisible(clickOnOption);
        click(clickOnOption);

    }
    public void logoutFromApp() {
        wait.forElementToBeVisible(logout);
        click(logout);

    }*/

}