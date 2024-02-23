package tests.US_036;


import org.testng.annotations.Test;
import pages.AdminMoneyPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_036_TC_02 extends BaseClass {

    @Test(groups = {"smoke"})
    public void tc_02() {
        AdminMoneyPage adminMoneyPage = new AdminMoneyPage(driver);
        test=extent.createTest("Admin Login Testi", "Gecerli sifre  ve mail ile admin login olur");

        AdminMoneyPage.getAdminAbdurrahimLogin();

        AdminMoneyPage.clickHamburgerButton();

        test.info("Admin sayfasinda acilir menu butonuna tiklanilir");
        AdminMoneyPage.clickMOneyMenuButton();
        test.info("Acilan menude MONEY acilir menusune tiklanir");
        AdminMoneyPage.clickTransactionMenuLink();
        test.info("Acilan menude Transactions linkine tiklanir");

        softAssert.assertTrue(AdminMoneyPage.verifyDisplayedIsimSaysiMetin());
        test.pass("Acilan sayfada tablonun altindaki isim sayilarini gosteren textin gorunur oldugu dogrulanir.");
        softAssert.assertAll();

    }


}
