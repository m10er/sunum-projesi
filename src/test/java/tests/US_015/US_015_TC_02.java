package tests.US_015;


import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_015_TC_02 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_02(){
        test = extent.createTest("US_015_TC_02","2-Kullanıcının adına tıklayarak kullanıcı menüsünü " +
                "görüntüleyebildiğimi doğruayabilmeliyim");


        HomePage homePage = new HomePage(driver);
        test.info("Kullanici gecerli mail ve sifre ile login olur");
        LoginPage.getLogin();
        test.info("Kullanici profile tiklar ve profil menusunu gorur.");
        softAssert.assertTrue(HomePage.verifyDisplayedProfileDropdownMenu());



        softAssert.assertAll();
    }



}
