package tests.US_021;


import org.testng.annotations.Test;
import pages.AdminJobsPage;
import pages.HomePage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_021_TC_01 extends BaseClass {
    @Test(groups = {"e2e","regression"})
    public void tc_01(){
        test = extent.createTest("US_021_TC_01","Admin Olarak Basarili Bir Sekilde Login Olunabilmesi Testi, " +
                "Gecerli sifre  ve mail ile admin login olur");

        AdminJobsPage adminJobsPage= new AdminJobsPage(driver);

        AdminJobsPage.getAdminUgurLogin();
        test.info("Admin Kullanici Gecerli Email ve Password ile Login Olur");

        String expectedUrl = "https://qa.jobexplorerpro.com/admin";
        String actualUrl = driver.getCurrentUrl();

        softAssert.assertEquals(actualUrl,expectedUrl, "Admin Kullanici Giris Bilgileri Kullanarak Login Olabildigi Gorunur");

        softAssert.assertAll();
    }

}






