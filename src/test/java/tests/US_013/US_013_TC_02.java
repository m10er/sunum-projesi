package tests.US_013;


import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.HomePage;
import pages.LoginPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_013_TC_02 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_01(){
        test = extent.createTest("US_013_TC_02","2-Kullanıcının adına tıklayarak kullanıcı menüsünü " +
                "görüntüleyebildiğimi doğruayabilmeliyim");


        HomePage homePage = new HomePage(driver);
        HomePage.getLogin();
        test.info("Kullanici gecerli mail ve sifre ile login olur");

        test.info("Kullanici profile tiklar ve profil menusunu gorur.");
        softAssert.assertTrue(HomePage.verifyDisplayedProfileDropdownMenu());



        softAssert.assertAll();
    }



}
