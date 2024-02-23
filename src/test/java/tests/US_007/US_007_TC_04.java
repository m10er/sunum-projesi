package tests.US_007;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_007_TC_04 extends BaseClass {

    @Test(groups = {"e2e","regresion"})
    public void tc04(){
        test = extent.createTest("Register sayfasinda geçerli bilgilerle kayit testi","Basarili bir sekilde kayıt olundugu dogrulanir");
        RegisterPage registerPage = new RegisterPage(driver);

        RegisterPage.getLoginPage();
        test.info("Kullanici login sayfasina gider");

        RegisterPage.clickSignupButton();
        test.info("SignUp butonuna tiklanir");

        RegisterPage.sendRegisterPageNameTextBox();
        test.info("Name kutusuna isim girilir");

        RegisterPage.sendEmailTextBox();
        test.info("E-mail kutusuna e-mail girilir");

        RegisterPage.sendPassword();
        test.info("Password kutusuna password girilir");

        RegisterPage.sendConfirmPassword();
        test.info("Password kutusuna password girilir");

        RegisterPage.clickRegisterPageCheckBox();
        test.info("Check Boxa tiklanir");


        String expectedUrl = TestData.qaTermsAndConditionsWebUrl;
        String actualUrl= driver.getCurrentUrl();

        softAssert.assertEquals(actualUrl,expectedUrl,"Kaiyt gerceklesir ve Home page a gidilir");

        softAssert.assertAll();
    }
}




