package tests.US_011;


import com.graphbuilder.math.func.MinFunction;
import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.HomePage;
import pages.LoginPage;
import testBase.BaseClass;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_011_TC_01 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_01(){
        test = extent.createTest("US_011_TC_01","1-Kayıtlı kullanıcı olarak siteye giriş yaptığımda " +
                "body bölümünü görüntüleyebilmeliyim");

        HomePage homePage = new HomePage(driver);
        HomePage.getLogin();
        test.info("Kullanici body bolumundeki client logolari gorur");
        softAssert.assertTrue(HomePage.verifyDisplayedClientLogos());
        test.info("Kullanici body bolumundeki Jobs titellerini gorur");
        softAssert.assertTrue(HomePage.verifyDisplayedTitleJobs());
        test.info("Kullanici body de email text boxun oldugnu gorur");
        softAssert.assertTrue(HomePage.verifyDisplayedEmailText());
        test.info("Kullanici body bolumundeki Suscrbie buttonun oldugunu gorur.");
        softAssert.assertTrue(HomePage.verifyDisplayedSuscribeButton());
        test.info("Kullanici bodydeki Buyuk basligi gorur");
        softAssert.assertTrue(HomePage.verifyDisplayedbodyBigTitle());
        test.info("KUllanici body deki Popular tag leri gorur");
        softAssert.assertTrue(HomePage.verifyDisplayedPopularTags());
        test.info("KUllanici Search a job butonunu bodyde gorur");
        softAssert.assertTrue(HomePage.verifyDisplayedSearchaJobButton());
        test.info("KUllanici Post a job for 10 yazisini gorur");
        softAssert.assertTrue(HomePage.verifyEnabledPOstaJobfor10Button());

        softAssert.assertAll();
    }





}
