package tests.US_030;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_030_TC_01 extends BaseClass {
    @Test(groups = {"smoke"})
    public void tc_01() {
        AdminJobsPage adminJobsPage = new AdminJobsPage(driver);
        test = extent.createTest
                ("US_030_TC_01",
                        "Gecerli sifre  ve mail ile admin login olur");
        AdminJobsPage.getAdminOrkunLogin();

        String expectedUrl = "https://qa.jobexplorerpro.com/admin";
        String actualUrl = driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin giris oldugu dogrulanir.");
        test.pass("Acilan sayfa da" + expectedUrl + "oldugu dogrulanir.");
        softAssert.assertAll();
    }
}
