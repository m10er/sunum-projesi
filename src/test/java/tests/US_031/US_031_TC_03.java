package tests.US_031;


import org.testng.annotations.Test;
import pages.AdminCompaniesPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_031_TC_03 extends BaseClass {

    @Test(groups = {"e2e","regresion", "smoke"})
    public void tc_03(){
        AdminCompaniesPage adminCompaniesPage = new AdminCompaniesPage(driver);
        test=extent.createTest("Admin olarak Companies menusunde\n" +
                "yeni sirket eklenmesi", "Companies menusunde yeni sirket ekleme");

        AdminCompaniesPage.getAdminDeryaLogin();
        AdminCompaniesPage.clickHamburgerButton();

        test.info("Hamburger butonuna tiklandi");
        AdminCompaniesPage.clickCompaniesTitle();

       test.info("Companies butonuna tiklandi");
       AdminCompaniesPage.clickCompaniesAddNewButton();

       test.info("Add New butonuna tiklandi");
       AdminCompaniesPage.sendCompaniesUserId();

       test.info("User Id degeri girildi");
       AdminCompaniesPage.sendCompaniesName();
       test.info("Name degeri girildi");

       AdminCompaniesPage.sendCompaniesSlug();

       test.info("Slug degeri tiklandi");
       AdminCompaniesPage.sendAddCompaniesHg();

        test.info("Hg degeri girildi");
        AdminCompaniesPage.sendCompaniesWebSiteUrl();

        test.info("Website Url girildi");
        AdminCompaniesPage.sendCompaniesEmail();

        test.info("Email degeri girildi");
        AdminCompaniesPage.sendCompaniesDescription();

        test.info("Description degeri girildi");
        AdminCompaniesPage.clickCompaniesSaveButton();

        softAssert.assertTrue(AdminCompaniesPage.verifyAddCompaniesSuccesfullMesage(), "Yeni sirket eklendigi dogrulandi");
        softAssert.assertAll();


    }

}
