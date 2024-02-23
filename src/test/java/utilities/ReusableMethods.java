package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;


public class ReusableMethods {

    //========Switching Window=====//
    public static void switchToWindowWithTitle(WebDriver driver, String targetTitle) {
        String origin = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().equals(targetTitle)) {
                return;
            }
        }
        driver.switchTo().window(targetTitle);
    }
    public static void switchToNewWindow(WebDriver driver, String handle){
        String newHandle= "";
       Set<String> windowHandles= driver.getWindowHandles();
        for (String each : windowHandles){
            if (!each.equals(handle)){
                newHandle=each;
            }
        }
        driver.switchTo().window(newHandle);
    }


    public static void scrollToElementWithAction(WebDriver driver, WebElement element) {
        waitForVisibility(driver,element);
        WebElement bottom = element;
        Actions actions = new Actions(driver);
        actions.scrollToElement(bottom).perform();
    }

    public static void sendKeys(WebDriver driver, WebElement webElement, String textToType){
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(GlobalVars.DefaultExplicitTimeOut));
        wait.until(ExpectedConditions.elementToBeClickable(webElement)).sendKeys(textToType);
    }
    public static void click(WebDriver driver, WebElement webElement){
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(GlobalVars.DefaultExplicitTimeOut));
        wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
    }

    public static void hover(WebDriver driver, WebElement element) {
        waitForVisibility(driver, element);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public static void doubleClick(WebDriver driver, WebElement element) {
        waitForClickablility(driver, element);
        new Actions(driver).doubleClick(element).build().perform();
    }
    public static void selectByVisibleText(WebElement element, String text) {
        Select objSelect = new Select(element);
        objSelect.selectByVisibleText(text);
    }

    public static void selectByIndex(WebElement element, int index) {
        Select objSelect = new Select(element);
        objSelect.selectByIndex(index);
    }

    public static void selectByValue(WebElement element, String value) {
        Select objSelect = new Select(element);
        List<WebElement> elementCount = objSelect.getOptions();
        objSelect.selectByValue(value);
        System.out.println("number of elements: " + elementCount.size());
    }


    //Alert ACCEPT
    public static void alertAccept(WebDriver driver) {
        alertWait(driver);
        driver.switchTo().alert().accept();

    }

    //Alert DISMISS
    public static void alertDismiss(WebDriver driver) {
        alertWait(driver);
        driver.switchTo().alert().dismiss();
    }

    //Alert getText()
    public static void alertText(WebDriver driver) {
        alertWait(driver);
        driver.switchTo().alert().getText();
    }

    //Alert promptBox
    public static void alertSentText(WebDriver driver, String text) {
        alertWait(driver);
       driver.switchTo().alert().sendKeys(text);
    }

    //Click Method
    public static void clickWithJs1(WebDriver driver, WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", element);
        }
    }

    //JS Scroll
    public static void scrollWithJs(WebDriver driver, WebElement element) {
        waitForVisibility(driver,element);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    //JS SendKeys
    public static void sendKeysWithJS(WebDriver driver, WebElement element, String text) {
        waitForClickablility(driver,element);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='" + text + "'", element);
    }

    /**
     * Clicks on an element using JavaScript
     *
     * @param element
     */
    public static void clickWithJS2(WebDriver driver, WebElement element) {
        waitForClickablility(driver,element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }


    public static void cleanByJs(WebDriver driver, WebElement element) {
        waitForVisibility(driver, element);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].value = '';", element);
    }




    /**
     * JavaScript ile webelement olusturma
     *
     * @param javascriptYolu internet sitesinden sag klik ile JS yolunu kopyala ile alınan metin olacak
     */
    public static WebElement webelementJavaScript(WebDriver driver, String javascriptYolu) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement webElement = (WebElement) js.executeScript("return " + javascriptYolu + "");
        return webElement;
    }

    /**
     * bu metot ile JS yolu string olarak verilen elementi JavascriptExecutor kullanarak tiklayabilirim
     * @param //webElement click yapilacak webelement yolu string olarak verilir
     */
    public static void clickJSElementWithJavaScript(WebDriver driver, String javascriptYolu) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement webElement = (WebElement) jse.executeScript("return " + javascriptYolu + "");
        jse.executeScript("arguments[0].click();", webElement);

    }

    /**
     * Bu metot ile elementin xpath değeri string olarak verilerek o classtaki text alinir.
     *     * @param  xpath text degeri alinmak istenen elementin xpathi string olarak verilir
     * @return
     */
    public static String getTextWithJavaScriptXpath(WebDriver driver, String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));

        // JavaScriptExecutor kullanarak elementin içeriğini al
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String text = (String) jsExecutor.executeScript("return arguments[0].textContent;", element);
        return text;
    }


    public static WebElement waitForVisibility(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(GlobalVars.DefaultExplicitTimeOut));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForClickablility(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(GlobalVars.DefaultExplicitTimeOut));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    //Alert Wait
    public static void alertWait(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(GlobalVars.DefaultExplicitTimeOut));
        wait.until(ExpectedConditions.alertIsPresent());

    }

    //HARD WAIT METHOD
    public static void bekle(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //WebElement ScreenShot
    public static void webElementScreenShoot(WebElement element){
        String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        String dosyaYolu = "TestOutput/webElementScreenshot"+tarih+".png";
        try {
            FileUtils.copyFile(element.getScreenshotAs(OutputType.FILE),new File(dosyaYolu));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    //==========Return a list of string given a list of Web Element====////
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }
    public static List<String> stringListeCevir(List<WebElement> webElementList){

        List<String> stringList = new ArrayList<>();

        for (WebElement eachElement : webElementList
        ) {

            stringList.add(eachElement.getText());
        }

        return stringList;
    }

    public static String getScreenshot(WebDriver driver, String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name+ date+ ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }


    public static void titleIleWindowDegistir(WebDriver driver, String targetTitle) {
        String origin = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().equals(targetTitle)) {
                return;
            }
        }
    }
}
