package Pages;

        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;

        import commons.BasePage;

public class ComplaintHandling extends BasePage {


    @FindBy(xpath = "//A[@class='btn btn-primary btn-block new_complaint'][text()='Submit new complaint']")
    WebElement submitComplaint;

    @FindBy(xpath = "//I[@class='fa fa-usd']")
    WebElement bankingComplaint;

    @FindBy(xpath = "//LABEL[@for='Credit Card'][text()='Credit Card']")
    WebElement creditCardIssue;

    @FindBy(xpath = "//button[@class='btn btn-pagenav btn-block']")
    WebElement doneChoosing;

    @FindBy(xpath = "//LABEL[@for='Payments'][text()='Payments']")
    WebElement payment;

    @FindBy(xpath = "//BUTTON[@class='btn btn-pagenav btn-block']")
    WebElement doneChoosingPayment;

    @FindBy(xpath = "//LABEL[@for='Unauthorised transaction'][text()='Unauthorised transaction']")
    WebElement transaction;

    @FindBy(xpath = "//BUTTON[@class='btn btn-pagenav btn-block']")
    WebElement doneChoosingIssue;

    @FindBy(xpath = "//LABEL[@for='I&rsquo;m hopping mad'][text()='I’m hopping mad']")
    WebElement emotion;

    @FindBy(xpath = "//BUTTON[@class='btn btn-pagenav btn-block']")
    WebElement doneChoosingEmotion;

    private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

    public ComplaintHandling(WebDriver driver) {
        super(driver);
    }

    public void submitComplaint() {
        wait.forElementToBeVisible(submitComplaint);
        click(submitComplaint);
    }

    public void bankingComplaint() {
        wait.forElementToBeVisible(bankingComplaint);
        click(bankingComplaint);
    }

    public void creditCardIssue() {
        wait.forElementToBeVisible(creditCardIssue);
        click(creditCardIssue);
    }

    public void doneChoosingCardIssue() {
        wait.forElementToBeVisible(doneChoosing);
        click(doneChoosing);
    }
    public void paymentIssue() {
        wait.forElementToBeVisible(payment);
        click(payment);
    }

    public void doneChoosingThePay() {
        wait.forElementToBeVisible(doneChoosingPayment);
        click(doneChoosingPayment);
    }

    public void unauthorizedTransaction() {
        wait.forElementToBeVisible(transaction);
        click(transaction);
    }
    public void doneChoosingTheIssue() {
        wait.forElementToBeVisible(doneChoosingIssue);
        click(doneChoosingIssue);
    }
    public void MyEmotion() {
        wait.forElementToBeVisible(emotion);
        click(emotion);
    }
    public void doneChoosingTheEmotion() {
        wait.forElementToBeVisible(doneChoosingEmotion);
        click(doneChoosingEmotion);
    }

}
