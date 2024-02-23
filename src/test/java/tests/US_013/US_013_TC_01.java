package tests.US_013;


import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.HomePage;
import pages.LoginPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_013_TC_01 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_01(){
        test = extent.createTest("US_013_TC_01","1-Kayıtlı kullanıcı olarak siteye giriş yaptığımda" +
                " header bölümünde kullanıcını adını görüntüleyebilmeliyim");

        HomePage homePage = new HomePage(driver);
        LoginPage.getLogin();
        test.info("Kullanici gecerli mail ve sifre ile login olur");

        softAssert.assertTrue(HomePage.verifyDisplayedProfileName());
        test.info("Kullanici header da logunun yaninda profil ismini gorur.");


        softAssert.assertAll();
    }



}
