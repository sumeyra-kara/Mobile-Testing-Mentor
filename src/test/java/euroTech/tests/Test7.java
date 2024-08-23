package euroTech.tests;


import euroTech.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.App;
import utils.Device;

import static utils.MobileUtils.*;

public class Test7 extends TestBase {
    WebDriverWait wait;
    AppiumDriver<MobileElement> driver;



    @Test
    public void test1() throws InterruptedException {


        driver = openApp(Device.PIXEL_2,App.API_Demos);
        wait  = new WebDriverWait(driver,10);

        clickWithText("Continue"); // custom method ile de yapilabilir

        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocatorByText("OK")));
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Accessibility");

        driver.navigate().back();
        clickWithText("Views");
        swipeV(0.9,0.2);
        swipeV(0.7,0.1); // asagiya dohru
        swipeV(0.6,0.3);


    }

    @Test
    public void test2() {

        driver = openApp(Device.PIXEL_2,App.API_Demos);
        wait  = new WebDriverWait(driver,10);

        clickWithText("Continue"); // custom method ile de yapilabilir

        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocatorByText("OK")));
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Accessibility");

        driver.navigate().back();
        clickWithText("Views");
        swipeUntil(0.8,0.2,getLocatorByText("WebView"));

    }
}
