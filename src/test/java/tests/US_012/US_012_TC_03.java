package tests.US_012;


import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.HomePage;
import pages.LoginPage;
import testBase.BaseClass;
import utilities.ReusableMethods;
import utilities.TestData;

import java.util.List;
import java.util.Set;

import static utilities.ExtentReportManager.extent;
import static utilities.ExtentReportManager.test;

public class US_012_TC_03 extends BaseClass {

    @Test(groups = {"e2e","regression"})
    public void tc_03_01(){
        test = extent.createTest("US_012_TC_03","3- Footer bölümündeki sosyal medya ikonlarını görüntüleyebilmeliyim ve " +
                "yönlendirmelerinin doğru çalıştıklarını doğrulayabilmeliyim.");

        HomePage homePage = new HomePage(driver);
        LoginPage.getLogin();
        test.info("Kullanici gecerli mail ve sifre ile login olur");

        test.info("Kullanici footerda FAcebook ikonuna tiklayarak Facebooka gider.");
        HomePage.clickInFooterFAcebookIcon();
        String windowHandle= driver.getWindowHandle();
        ReusableMethods.switchToNewWindow(driver,windowHandle);
        String expectedUrl = TestData.facebookUrl;
        String actualUrl = driver.getCurrentUrl();



        test.info("Kullanici footer logooya tiklayarak"+expectedUrl+"gider");
        softAssert.assertEquals(actualUrl, expectedUrl, "footer facebook ikonuna tiklandiginda"+expectedUrl+ "gidilir");

        softAssert.assertAll();
    }
    @Test(groups = {"e2e","regression"})
    public void tc_03_02(){
        test = extent.createTest("US_012_TC_03","3- Footer bölümündeki sosyal medya ikonlarını görüntüleyebilmeliyim ve " +
                "yönlendirmelerinin doğru çalıştıklarını doğrulayabilmeliyim.");

        HomePage homePage = new HomePage(driver);
        LoginPage.getLogin();
        test.info("Kullanici gecerli mail ve sifre ile login olur");

        HomePage.clickInFooterTwitterIcon();
        String windowHandle= driver.getWindowHandle();
        ReusableMethods.switchToNewWindow(driver,windowHandle);
        String expectedtwitUrl = TestData.twitterUrl;
        String actualtwitUrl = driver.getCurrentUrl();
        test.info("Kullanici footerdaki Twitter ikonuna tiklayarak  facebook sayfasina gider");
        softAssert.assertEquals(actualtwitUrl, expectedtwitUrl, "footer logosuna tiklandiginda facebook sayfasina gidilir");

        softAssert.assertAll();
    }
    @Test(groups = {"e2e","regression"})
    public void tc_03_03(){
        test = extent.createTest("US_012_TC_03","3- Footer bölümündeki sosyal medya ikonlarını görüntüleyebilmeliyim ve " +
                "yönlendirmelerinin doğru çalıştıklarını doğrulayabilmeliyim.");

        HomePage homePage = new HomePage(driver);
        LoginPage.getLogin();
        test.info("Kullanici gecerli mail ve sifre ile login olur");

        HomePage.clickInFooterInstagramIcon();
        String windowHandle= driver.getWindowHandle();
        ReusableMethods.switchToNewWindow(driver,windowHandle);
        String expectedInsta =TestData.instagramUrl;
        String actualINsta= driver.getCurrentUrl();
        test.info("Kullanici footerdaki instagram butonuna tiklayarak Twitter sayfasina gider");
        softAssert.assertEquals(actualINsta, expectedInsta);


        softAssert.assertAll();
    } @Test(groups = {"e2e","regression"})
    public void tc_03_04(){
        test = extent.createTest("US_012_TC_03","3- Footer bölümündeki sosyal medya ikonlarını görüntüleyebilmeliyim ve " +
                "yönlendirmelerinin doğru çalıştıklarını doğrulayabilmeliyim.");

        HomePage homePage = new HomePage(driver);
        LoginPage.getLogin();
        test.info("Kullanici gecerli mail ve sifre ile login olur");

        HomePage.clickInFooterYoutubeIcon();
        String windowHandle= driver.getWindowHandle();
        String expectedYouUrl =TestData.youtubeTitle;
        ReusableMethods.switchToNewWindow(driver,windowHandle);
        String actualYouUrl= driver.getTitle();
        test.info("Kullanici footerdaki instagram butonuna tiklayarak youtube sayfasina gider");
        softAssert.assertEquals(actualYouUrl, expectedYouUrl);


        softAssert.assertAll();
    }


}
