package tests.US_035;

import org.testng.annotations.Test;
import pages.AdminJobsPage;
import pages.AdminMoneyPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_035_TC_02 extends BaseClass {
    @Test(groups = {"smoke"})
    public void tc_02() {
       AdminMoneyPage adminMoneyPage = new AdminMoneyPage(driver);
        test = extent.createTest
                ("admin olarak sayfaya giris yapabilmeliyim", "Gecerli sifre  ve mail ile admin login olur");

        AdminJobsPage.getAdminDeryaLogin();

        test.info("Money menusu tiklandi");
        AdminMoneyPage.clickSubscriptionsButton();
        test.info("Subscription menusu tiklandi");

        softAssert.assertTrue(AdminMoneyPage.verifySubscriptionTitle(), "Subscription menusunde abonelikleri goruntuleme");
        test.pass("Subscription menusunde aboneliklerin goruntulendigi dogrulandi");


        softAssert.assertAll();
    }


}