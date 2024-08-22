package euroTech.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import utils.App;
import utils.Device;
import utils.Driver;

public class Test4 {

    AppiumDriver<MobileElement> driver;
    AppiumDriverLocalService service;
    App app = App.API_Demos;
    Device device = Device.PIXEL_2;

    @Test
    public void test1() throws InterruptedException {

        Driver.runAppiumService();
        driver = Driver.getDriver(Device.PIXEL_2,App.API_Demos);

        clickWithText("Continue"); // custom method ile de yapilabilir
        Thread.sleep(2000);
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Accessibility");

        driver.closeApp();

    }

    public void clickWithText(String text){ // custom method ile
        driver.findElement(By.xpath("//*[@text='"+text+"']")).click();
    }




}
