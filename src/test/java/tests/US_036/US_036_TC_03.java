package tests.US_036;


import org.testng.annotations.Test;
import pages.AdminMoneyPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_036_TC_03 extends BaseClass {

    @Test(groups = {"smoke"})
    public void tc_03() {
        AdminMoneyPage adminMoneyPage = new AdminMoneyPage(driver);
        test=extent.createTest("Admin Login Testi", "Gecerli sifre  ve mail ile admin login olur");

        AdminMoneyPage.getAdminAbdurrahimLogin();

        AdminMoneyPage.clickHamburgerButton();

        test.info("Admin sayfasinda acilir menu butonuna tiklanilir");
        AdminMoneyPage.clickMOneyMenuButton();
        test.info("Acilan menude MONEY acilir menusune tiklanir");
        AdminMoneyPage.clickTransactionMenuLink();
        AdminMoneyPage.clickTransactionViewLInk();
        test.info("Acilan menude ilk satirdaki View linkine tiklanir");
        softAssert.assertTrue(AdminMoneyPage.verifyDisplayedtaxReturnLink());
        test.pass("Acilan sayfadaki islemlerin ayrintilari View linkine tiklanarak goruntulenir");
        softAssert.assertAll();

    }


}
