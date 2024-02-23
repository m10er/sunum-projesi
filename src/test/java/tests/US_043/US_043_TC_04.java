package tests.US_043;


import org.testng.annotations.Test;
import pages.AdminFeaturedClients;
import testBase.BaseClass;
import utilities.TestData;

import static pages.AdminFeaturedClients.*;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;


public class US_043_TC_04 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_04(){
        test = extent.createTest("US_043_TC_04","4-Kendi eklediğim müşteriyi öne çıkan müşteriler listesine" +
                " başarıyla ekleyebildiğimi doğrulyabilmeliyim");

        AdminFeaturedClients adminFeaturedClients = new AdminFeaturedClients(driver);
        test.info("Kullanici admin olarak login olur");
        validAdminLogin();
        test.info("Kullanici hamburger butonuna tiklar");
        clickHamburgerButton();
        test.info("Kullanici Featured Clients butonuna tiklar");
        clickFeatruedLink();
        test.info("Kullanici AddNewFeatured butonuna tiklar");
        clickaddNewFeatured();
        test.info("Kullanici Compant Dropdowna tiklar ve ilk company secer");
        clickCompanyDropdown();
        clickfirstCompanyOption();
        test.info("Kullanici name kismina isim gonderir");
        sendNameText(TestData.fakeName);
        test.info("Kullanici logo ekler");
        sendLogo(TestData.team5LogoPath);
        test.info("Kullanici order kismina sayisal olmayan degerler girer");
        sendOrder(TestData.fakeOrderNumber);
        test.info("Kullanici save butonuna tiklar");
        clickSaveButton();
        test.info("Kullanici Succseful yazsini gorur");
        softAssert.assertTrue(AdminFeaturedClients.verifyDisplayedSuccesfulText());
        test.info("Kullanici kaydettigi ismin ilk satirda gorundugunu dogrular");
        softAssert.assertTrue(verifyNewClientName(TestData.fakeName));
        test.info("Kullanici kaydettigi logonun ilk satirda gorundugunu dogrular");
        softAssert.assertTrue(verifyDisplayedLogoPath(),"logonun dosya yolunu kontrol eder");

        softAssert.assertAll();


    }



}
