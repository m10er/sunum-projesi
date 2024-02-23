package tests.US_007;

import org.testng.annotations.Test;
import pages.HomePage;
import testBase.BaseClass;

import static pages.LoginPage.getLogin;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_007_TC_02 extends BaseClass {

    @Test(groups = {"e2e","regresion"})
    public void tc02(){
        test = extent.createTest("US_001_TC_02","Header'da Login buton testi\", \"Login sayfasina gecis yapilir");
        HomePage homePage = new HomePage(driver);
       // getRegisterPage();

        softAssert.assertAll();
    }
}




