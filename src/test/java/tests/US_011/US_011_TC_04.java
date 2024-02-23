package tests.US_011;


import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.HomePage;
import pages.LoginPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_011_TC_04 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_04(){
        test = extent.createTest("US_011_TC_04","4-Öne çıkan kategorileri, bu kategorideki" +
                " ilan sayısını ve view all butonu ile kategorideki diğer ilanlara ulaşabilmeliyim");

        HomePage homePage = new HomePage(driver);
        LoginPage.getLogin();
        test.info("Kullanici gecerli mail ve sifre ile login olur");
        softAssert.assertTrue(HomePage.verifyDisplayedCategoriesTitle());
        test.info("Kullanici Categori basliklarini gorur.");
        softAssert.assertTrue(HomePage.verifyEnabledPOstaJobfor10Button());
        test.info("Kullanici body deki View All Button lari gorur");



        softAssert.assertAll();
    }



}
