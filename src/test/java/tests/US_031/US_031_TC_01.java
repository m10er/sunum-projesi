package tests.US_031;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import pages.AdminLoginPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_031_TC_01 extends BaseClass {

    @Test(groups = {"smoke"})
    public void tc_01() {
        AdminLoginPage adminLoginPage =new AdminLoginPage(driver);
        test = extent.createTest
                ("admin olarak sayfaya giris yapabilmeliyim", "Gecerli sifre  ve mail ile admin login olur");

        AdminJobsPage.getAdminDeryaLogin();

        String expectedUrl="https://qa.jobexplorerpro.com/admin";
        String actualUrl= driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl," admin olarak giris oldugu dogrulanir.");
        test.pass("Acilan sayfa url'nin" + expectedUrl+"oldugu dogrulanir.");
        softAssert.assertAll();
    }



}
