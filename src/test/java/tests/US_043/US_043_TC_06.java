package tests.US_043;


import org.testng.annotations.Test;
import pages.AdminFeaturedClients;
import testBase.BaseClass;

import static pages.AdminFeaturedClients.*;
import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;


public class US_043_TC_06 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_06(){
        test = extent.createTest("US_043_TC_06","6-Öne çıkardığım müşterinin öne çıkarılma bilgilierini" +
                " düzenleyip öne çıkarılan müşteriyi öne çıkarıanlardan silebildiğimi ve başarıyla sildiğimi doğrulyabilmeliyim");

        AdminFeaturedClients adminFeaturedClients = new AdminFeaturedClients(driver);
        test.info("Kullanici admin olarak login olur");
        validAdminLogin();
        test.info("Kullanici hamburger butonuna tiklar");
        clickHamburgerButton();
        test.info("Kullanici Featured Clients butonuna tiklar");
        clickFeatruedLink();
        test.info("Kullanici Edit butonuna tiklar");
        clickEditButton();
        test.info("Kullanici order kutusuna yeni bir deger yazar");
        sendOrder("25");
        test.info("Kullanici save butonuna tiklar");
        clickSaveButton();
        test.info("Kullanici Succseful yazsini gorur");
        softAssert.assertTrue(AdminFeaturedClients.verifyDisplayedUpdate(),"Kayit guncelleme islemi basaryila sonuclanir");
        test.info("Kullanici Delete butonuna tiklar");
        clickDeleteButton();
        test.info("Kulllanici ailan alertte 'YES Delete it' secer");
        test.info("Sucssesful yazisini gorur.");
       clickYesDeletItButton();
        softAssert.assertTrue(AdminFeaturedClients.verifysuccessDeleteText(),"Silme islemi basariyla sonuclanmsitr.");

        softAssert.assertAll();
    }



}
