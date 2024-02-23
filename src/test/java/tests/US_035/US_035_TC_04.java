package tests.US_035;

import org.testng.annotations.Test;
import pages.AdminJobsPage;
import pages.AdminMoneyPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_035_TC_04 extends BaseClass {
    @Test(groups = {"smoke"})
    public void tc_04() {
       AdminMoneyPage adminMoneyPage = new AdminMoneyPage(driver);
        test = extent.createTest
                ("admin olarak sayfaya giris yapabilmeliyim", "Gecerli sifre  ve mail ile admin login olur");

        AdminJobsPage.getAdminDeryaLogin();

        test.info("Money menusu tiklandi");
        AdminMoneyPage.clickSubscriptionsButton();
        test.info("Subscription menusu tiklandi");

        AdminMoneyPage.clickSubscriptionEdit();
        test.info("Edit butonuna tiklandi");

        AdminMoneyPage.sendKSubscriptionUserIdTExt();
        test.info("Id texti duzenlendi");

        AdminMoneyPage.clickSubscriptionSaveButton();
        test.info("Save butonuna tiklandi");

        softAssert.assertTrue(AdminMoneyPage.verifySuccessSubsciptionMessages(), "Abonelik bilgileri duzenlendi");
        test.pass("Abonelik bilgileri duzenlendigi dogrulandi");
        softAssert.assertAll();
    }


}