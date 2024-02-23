package tests.US_035;

import org.testng.annotations.Test;
import pages.AdminJobsPage;
import pages.AdminMoneyPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_035_TC_05 extends BaseClass {
    @Test(groups = {"smoke"})
    public void tc_03() {
       AdminMoneyPage adminMoneyPage = new AdminMoneyPage(driver);
        test = extent.createTest
                ("admin olarak sayfaya giris yapabilmeliyim", "Gecerli sifre  ve mail ile admin login olur");

        AdminJobsPage.getAdminDeryaLogin();

        test.info("Money menusu tiklandi");
        AdminMoneyPage.clickSubscriptionsButton();
        test.info("Subscription menusu tiklandi");

        AdminMoneyPage.clickSubscriptionsDeletButton();
        test.info("Delete butonuna tiklandi");

        AdminMoneyPage.clickSubscriptionsYesDeletButton();
        test.info("silme islemini onaylamak icin Yes, delete it butonuna tiklandi");

        softAssert.assertTrue(AdminMoneyPage.verifySubscriptionsSuccessDeletMessage(), "Eklenen abonelik kaydi silindi");
        test.info("abonelik kaydi silindigi dogrulandi");
        softAssert.assertAll();
    }


}