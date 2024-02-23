package tests.US_001;

import org.testng.annotations.Test;
import pages.AdminLoginPage;
import pages.HomePage;
import pages.LoginPage;
import testBase.BaseClass;
import utilities.ReusableMethods;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_001_TC_01  extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_01(){
        test = extent.createTest("US_001_TC_01","Ziyaretçi olarak ana sayfaya erişebilmeliyim.");

        AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
        AdminLoginPage.getAdminLoginPage();
        AdminLoginPage.sendEmail("TEAM5 iyi seyirler");
        ReusableMethods.bekle(2);
        AdminLoginPage.sendPassword("123");
        AdminLoginPage.sendEmail("Team Lead:MUAMMER, Scrum Master:Ugur");
        ReusableMethods.bekle(2);
        AdminLoginPage.sendPassword("123");
        AdminLoginPage.sendEmail("QA:DERYA, MELTEM, ORKUN");
        ReusableMethods.bekle(2);
        AdminLoginPage.sendPassword("!@34");
        AdminLoginPage.sendEmail("QA:ABDURRAHIM, CIHAD, MEHMET");
        ReusableMethods.bekle(2);
        AdminLoginPage.sendEmail(TestData.gecerliAdminMuammerEmail);
        AdminLoginPage.sendPassword();
        AdminLoginPage.clickLoginButton();

        softAssert.assertAll();
    }



}
