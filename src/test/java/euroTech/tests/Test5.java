package euroTech.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.App;
import utils.Device;
import utils.Driver;
import utils.MobileUtils;

import static utils.MobileUtils.*;

public class Test5 {

    AppiumDriver<MobileElement> driver;
    AppiumDriverLocalService service;
    App app = App.API_Demos;
    Device device = Device.PIXEL_2;
    WebDriverWait wait;

    @Test
    public void test1() throws InterruptedException {


        driver = openApp(Device.PIXEL_2,App.API_Demos);
        wait  = new WebDriverWait(driver,10);

        clickWithText("Continue"); // custom method ile de yapilabilir
        Thread.sleep(2000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocatorByText("OK")));
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Accessibility");

       closeApp();

    }




}
