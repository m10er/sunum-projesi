package tests.US_008;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.UserHomePage;
import testBase.BaseClass;

import static pages.LoginPage.getLogin;
import static pages.LoginPage.getLoginPage;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_008_TC_02 extends BaseClass {


    @Test(groups = {"e2e","regresion"})
    public void tc01(){
        test = extent.createTest("US_001_TC_01","Login sayfasinda dogru bilgilerle giris testi\",\"Login sayfasinda dogru bilgilerle giris yapabilmeliyim");
        UserHomePage userHomePage = new UserHomePage(driver);
        getLogin();
        softAssert.assertTrue(UserHomePage.verifyDisplayedUserHomePageUserMenu());
        test.info("User home page teki user menusunu gorur.");



        softAssert.assertAll();
    }

}
