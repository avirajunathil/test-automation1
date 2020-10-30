
package Pages;

        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;

        import commons.BasePage;

        import java.util.List;

public class Company extends BasePage {

    @FindBy(xpath = "(//INPUT[@type='text'])[1]")
    WebElement search;

    /*@FindBy(xpath = "//li[@class='ui-menu-item listing']//a")
    List<WebElement> companyList;*/
    @FindBy(xpath = "//BUTTON[@class='btn btn-pagenav btn-block organisation-button']")
    WebElement doneChoosingCompany;

    @FindBy(xpath = "//A[@class='ui-all'][text()='ANZ']")
    WebElement clickOnCompany;

    private static final Logger lOGGER = LogManager.getLogger(HomePage.class.getName());

    public Company(WebDriver driver) {
        super(driver);
    }

    public void searchOrganization() {
        wait.forElementToBeVisible(search);
        sendKeys(search, "ANZ ");
    }

    /*public void bankingComplaint() {
        for(WebElement currentCompanyName :companyList )
        {
            if(currentCompanyName.getText().equalsIgnoreCase("ANZ")){
                currentCompanyName.click();
                break;

            }
        }
    }*/

    public void clickOnTheCompany() {
        wait.forElementToBeVisible(clickOnCompany);
        click(clickOnCompany);
    }

    public void doneChoosingTheCompany() {
        wait.forElementToBeVisible(doneChoosingCompany);
        click(doneChoosingCompany);
    }

}
