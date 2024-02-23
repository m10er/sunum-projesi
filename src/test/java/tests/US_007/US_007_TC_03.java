package tests.US_007;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_007_TC_03 extends BaseClass {

    @Test(groups = {"e2e","regresion"})
    public void tc03(){
        test = extent.createTest("US_001_TC_03","Header'da Login buton testi\", \"Login sayfasina gecis yapilir");
        RegisterPage registerPage = new RegisterPage(driver);

        RegisterPage.getLoginPage();
        test.info("Kullanici login sayfasina gider");

        RegisterPage.clickSignupButton();
        test.info("SignUp butonuna tiklanir");

        String expectedUrl = TestData.qaRegisterUrl;
        String actualUrl = driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"Register sayfasina erisim saglandigi dogrulanir");

        softAssert.assertTrue(RegisterPage.verifyDisplayedRegisterPageLogo(),"Register sayfasinda logonun gorunur oldugu dogrulanir");
        test.info("Register sayfasinda logonun gorunur oldugu dogrulanir");

        softAssert.assertTrue(RegisterPage.verifyREgisterPageEmailTextBox(),"Register sayfasinda e-mail textBox'in gorunur oldugu dogrulanir");
        test.info("Register sayfasinda e-mail textBox'in gorunur oldugu dogrulanir");

        softAssert.assertTrue(RegisterPage.verifyREgisterPagePasswordTextBox(),"Register sayfasinda password textBox'in gorunur oldugu dogrulanir");
        test.info("Register sayfasinda password textBox'in gorunur oldugu dogrulanir");

        softAssert.assertTrue(RegisterPage.verifyREgisterPageConfirmPasswordTextBox(),"Register sayfasinda confirm password textBox'in gorunur oldugu dogrulanir");
        test.info("Register sayfasinda confirm password textBox'in gorunur oldugu dogrulanir");

        softAssert.assertTrue(RegisterPage.verifyREgisterPageCheckBox(),"Register sayfasinda checkBox'in gorunur oldugu dogrulanir");
       test.info("Register sayfasinda checkBox'in gorunur oldugu dogrulanir");

        softAssert.assertTrue(RegisterPage.verifyREgisterPageREgisterButton(),"Register sayfasinda register butonun gorunur oldugu dogrulanir");
        test.info("Register sayfasinda register butonun gorunur oldugu dogrulanir");

        softAssert.assertTrue(RegisterPage.verifyDisplayedRegisterPageSigninButton(),"Register sayfasinda signIn butonun gorunur oldugu dogrulanir");
        test.info("Register sayfasinda signIn butonun gorunur oldugu dogrulanir");

        softAssert.assertAll();
    }
}




