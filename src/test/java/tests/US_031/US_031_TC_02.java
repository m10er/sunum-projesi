package tests.US_031;


import org.testng.annotations.Test;
import pages.AdminCompaniesPage;
import pages.AdminJobsPage;
import pages.AdminLoginPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_031_TC_02 extends BaseClass {

    @Test(groups = {"e2e","regresion", "smoke"})
    public void tc_02(){
        AdminCompaniesPage adminCompaniesPage = new AdminCompaniesPage(driver);
        test=extent.createTest("Admin olarak giris yapilan sayfada\n" +
                " Companies menusunde siteye uye olan sirketlerin goruntulenebilmesi", "Companies menusunden kayitli sirketleri goruntuleme");

        AdminCompaniesPage.getAdminDeryaLogin();
        AdminCompaniesPage.clickHamburgerButton();
        AdminCompaniesPage.clickCompaniesTitle();


        softAssert.assertTrue(AdminCompaniesPage.verifyDisplayedCompaniesText(), "Companies menusunde uye olan sirketleri goruntuleme");

        System.out.println();
        softAssert.assertAll();


    }

}
