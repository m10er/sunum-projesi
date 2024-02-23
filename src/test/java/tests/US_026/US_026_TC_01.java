package tests.US_026;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_026_TC_01 extends BaseClass {
    @Test(groups = {"e2e","regression"})
    public void tc_01(){
        test = extent.createTest("US_026_TC_01",
                "Gecerli sifre  ve mail ile admin login olur");;

        AdminJobsPage adminJobsPage= new AdminJobsPage(driver);

        AdminJobsPage.getAdminOrkunLogin();
        test.info("Admin Kullanici Gecerli Email ve Password ile Login Olur");

        String expectedUrl = "https://qa.jobexplorerpro.com/admin";
        String actualUrl = driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl, "Admin giris oldugu dogrulanir.");
        test.pass("Acilan sayfa da" + expectedUrl + "oldugu dogrulanir.");
        softAssert.assertAll();



    }

}
