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

public class Test6 extends TestBase {

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

        wait.until(ExpectedConditions.visibilityOfElementLocated(getLocatorByText("OK")));
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Accessibility");



    }




}
