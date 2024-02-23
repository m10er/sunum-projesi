package tests.US_010;

import org.testng.annotations.Test;
import pages.UserHomePage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_010_TC_08 extends BaseClass {

    @Test(groups = {"e2e","regresion"})
    public void tc08(){
        test = extent.createTest("Kullanici ana sayfada header bolumunde kullanici menu testi","Kullanici ana sayfada header bolumunde kullanici menusunde logout gorunur ve aktif olmali");
        UserHomePage userHomePage = new UserHomePage(driver);

        UserHomePage.getLogin();
        test.info("Gecerli mail ve sifre ile login olur");

        softAssert.assertTrue(UserHomePage.verifyDisplayeduserMenu());
        UserHomePage.clickUserMenu();
        UserHomePage.clickuserPageLogoutButton();


        String expectedUrl = TestData.qaWebUrl;
        String actualUrl = driver.getCurrentUrl();

        test.info("Logout butonu ile cikis yapildigi dogrulanir");
        softAssert.assertEquals(actualUrl,expectedUrl,"Logout butonu ile cikis yapildigi dogrulanir");
        softAssert.assertAll();


    }

}
