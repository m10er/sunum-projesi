package tests.US_033;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import pages.AdminLoginPage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_033_TC_01 extends BaseClass {


    @Test(groups = {"smoke"})
    public void tc_01() {
        test = extent.createTest
                ("admin olarak sayfaya giris yapabilmeliyim", "Gecerli sifre  ve mail ile admin login olur");
        AdminLoginPage adminLoginPage =new AdminLoginPage(driver);
        AdminJobsPage.getAdminDeryaLogin();

        String expectedUrl = TestData.qaAdminUrl;
        String actualUrl = driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl, " admin olarak giris oldugu dogrulanir.");
        test.pass("Acilan sayfa url'nin" + expectedUrl + "oldugu dogrulanir.");
        softAssert.assertAll();
    }

}
