package tests.US_035;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import pages.AdminUsersPage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_035_TC_01 extends BaseClass {
    @Test(groups = {"smoke"})
    public void tc_01() {
        AdminUsersPage adminUsersPage = new AdminUsersPage(driver);
        test = extent.createTest
                ("admin olarak sayfaya giris yapabilmeliyim", "Gecerli sifre  ve mail ile admin login olur");

        AdminJobsPage.getAdminDeryaLogin();

        String expectedUrl = TestData.qaAdminUrl;
        String actualUrl = driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl, " admin olarak giris oldugu dogrulanir.");
        test.pass("Acilan sayfa url'nin" + expectedUrl + "oldugu dogrulanir.");
        softAssert.assertAll();
    }




}
