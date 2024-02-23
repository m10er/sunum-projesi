package tests.US_029;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import testBase.BaseClass;
import utilities.TestData;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_029_TC_01 extends BaseClass {
    @Test(groups = {"smoke"})
    public void tc_01() {
        test = extent.createTest
                ("US_029_TC_01",
                        "Gecerli sifre  ve mail ile admin login olur");
        AdminJobsPage adminJobsPage =new AdminJobsPage(driver);
        AdminJobsPage.getAdminOrkunLogin();

        String expectedUrl = TestData.qaAdminUrl;
        String actualUrl = driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin giris oldugu dogrulanir.");
        test.pass("Acilan sayfa da" + expectedUrl + "oldugu dogrulanir.");
        softAssert.assertAll();
    }



}
