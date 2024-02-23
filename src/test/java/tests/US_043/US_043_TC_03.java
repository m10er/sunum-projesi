package tests.US_043;


import org.testng.annotations.Test;
import pages.AdminFeaturedClients;
import testBase.BaseClass;
import utilities.TestData;

import static pages.AdminFeaturedClients.*;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;


public class US_043_TC_03 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_03(){
        test = extent.createTest("US_043_TC_03","3-Featured Clients sayfasına ulaştığımda add new butonu ile " +
                "ulaştığım sayfadaki formu doldurup bir müşteriyi öne çıkarabildiğimi dğrulayabilmeliyim");

        AdminFeaturedClients adminFeaturedClients = new AdminFeaturedClients(driver);
        test.info("Kullanici admin olarak login olur");
        validAdminLogin();
        test.info("KUllanici hamburger butonuna tiklar");
        clickHamburgerButton();
        test.info("Kullanici Featured Clients butonuna tiklar");
        clickFeatruedLink();
        test.info("Kullanici AddNewFeatured butonuna tiklar");
        clickaddNewFeatured();
        test.info("KUllanici Compant Dropdowna tiklar ve ilk company secer");
        clickCompanyDropdown();
        clickfirstCompanyOption();
        test.info("Kullanici name kismina isim gonderir");
        sendNameText(TestData.fakeName);
        test.info("Kullanici order kismina sayisal olmayan degerler girer");
        sendOrder("24");
        test.info("Kullanici save butonuna tiklar");
        clickSaveButton();
        test.info("Kullanici Succseful yazsini gorur");
        softAssert.assertTrue(AdminFeaturedClients.verifyDisplayedSuccesfulText());

        softAssert.assertAll();

    }



}
