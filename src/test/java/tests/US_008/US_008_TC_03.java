package tests.US_008;

import org.testng.annotations.Test;
import pages.LoginPage;
import testBase.BaseClass;

import static pages.LoginPage.getLoginPage;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_008_TC_03 extends BaseClass {


    @Test(groups = {"e2e","regresion"})
    public void tc01(){
        test = extent.createTest("US_001_TC_01","Header'da Login buton testi\", \"Login sayfasina gecis yapilir");
        LoginPage loginPage= new LoginPage(driver);
        getLoginPage();
        softAssert.assertTrue(LoginPage.verifyDisplayedEmailTExtBox());
        test.info("Login sayfasinda email textBox gorunur oldugu dogrulanir");

        softAssert.assertTrue(LoginPage.verifyDisplayedPasswordTextBox());
        test.info("Login sayfasinda password textBox gorunur oldugu dogrulanir");

        softAssert.assertTrue(LoginPage.verifyDisplayedForgotYourPasswordButton());
        test.info("Forgot your password butonun gorunur oldugu dogrulanir");

        softAssert.assertTrue(LoginPage.verifyDisplayedLOginPageLoginButton());
        test.info("Login sayfasindaki login butonun gorunur oldugu dogrulanir");

        softAssert.assertAll();
    }

}
