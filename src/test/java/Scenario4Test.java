import Pages.*;
import commons.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static commons.Configuration.url;

public class Scenario4Test extends TestBase {

    @BeforeMethod
    public void openPage() {
        driver.get(url.asString());
    }

    @Test
    public void testHomePage() throws IOException {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnLoginButton();
        Properties property = new Properties();
        String pathToTestData = System.getProperty("user.dir") + "\\env\\stagging.properties";
        property.load(new FileInputStream(pathToTestData));

        GoogleLogin googleLogin = new GoogleLogin(driver);
        googleLogin.loginGoogle();
        //googleLogin.useAnotherAccount();
        googleLogin.EmailPhone(property.getProperty("username1"));
        googleLogin.nextClick();
        googleLogin.password(property.getProperty("password1"));
        googleLogin.nextClick2();
        ComplaintHandling compaintHandling = new ComplaintHandling(driver);
        compaintHandling.submitComplaint();
        compaintHandling.bankingComplaint();
        compaintHandling.creditCardIssue();
        compaintHandling.doneChoosingCardIssue();
        compaintHandling.paymentIssue();
        compaintHandling.doneChoosingThePay();
        compaintHandling.unauthorizedTransaction();
        compaintHandling.doneChoosingTheIssue();
        compaintHandling.MyEmotion();
        compaintHandling.doneChoosingTheEmotion();

        Address address = new Address(driver);
        address.address1();
        address.address2();
        address.city();
        address.state();
        address.postcode();
        address.country();
        address.submit();

        Company company = new Company(driver);
        company.searchOrganization();
       // company.bankingComplaint();
        company.clickOnTheCompany();
        company.doneChoosingTheCompany();

        OptionalDetails optionalDetails = new OptionalDetails(driver);
        optionalDetails.resolutionNeed();
        optionalDetails.specifyTheIssue();
        optionalDetails.effectofTheIssue();
        optionalDetails.numberOfAttempts();
        optionalDetails.userExperience();
        optionalDetails.specifyUsr();
        optionalDetails.draftTheComplaint();
    
        /*optionalDetails.optionsLogout();
        optionalDetails.logoutFromApp();*/


    }
}
