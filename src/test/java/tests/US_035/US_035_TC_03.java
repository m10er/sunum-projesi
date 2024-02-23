package tests.US_035;

import org.testng.annotations.Test;
import pages.AdminJobsPage;
import pages.AdminMoneyPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_035_TC_03 extends BaseClass {
    @Test(groups = {"smoke"})
    public void tc_03() {
       AdminMoneyPage adminMoneyPage = new AdminMoneyPage(driver);
        test = extent.createTest
                ("admin olarak sayfaya giris yapabilmeliyim", "Gecerli sifre  ve mail ile admin login olur");

        AdminJobsPage.getAdminDeryaLogin();

        test.info("Money menusu tiklandi");
        AdminMoneyPage.clickSubscriptionsButton();
        test.info("Subscription menusu tiklandi");

        AdminMoneyPage.clickAddNewButton();
        test.info("Add New Butonuna tiklandi");
        AdminMoneyPage.sendSInfoText();
        AdminMoneyPage.clickSubscriptionSaveButton();
        test.info("Save butonuna tiklandi");

        softAssert.assertTrue(AdminMoneyPage.verifySuccessSubsciptionMessages(), "Yeni abonelik eklendigi dogrulandi");
        softAssert.assertAll();
    }


}