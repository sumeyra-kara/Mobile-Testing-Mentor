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

public class Test3 {

    AppiumDriver<MobileElement> driver;
    AppiumDriverLocalService service;
    App app = App.API_Demos;
    Device device = Device.PIXEL_2;

    @Test
    public void test1() throws InterruptedException {
        service= new AppiumServiceBuilder().withIPAddress("127.0.0.1")
                .usingPort(4723)
                .build();
        service.start();

        // appium Inspector'a baglanmak icin
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:udid",device.udid);
        capabilities.setCapability("appium:version",device.version);
        capabilities.setCapability("appium:deviceName",device.deviceName);
        capabilities.setCapability("platformName", device.platformName);

        capabilities.setCapability("appPackage", app.appPackage);
        capabilities.setCapability("appActivity", app.appActivity);

        driver =new AndroidDriver<>(service.getUrl(),capabilities);
       // AppiumDriver<MobileElement> driver  =new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        //driver.findElement(By.xpath("//*[@text='Continue']")).click();
        clickWithText("Continue"); // custom method ile de yapilabilir
        Thread.sleep(2000);
       // driver.findElement(By.xpath("//*[@text='OK']")).click();
        clickWithText("OK");
        Thread.sleep(2000);
       // driver.findElement(By.xpath("//*[@text='OK']")).click();
        clickWithText("OK");
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[@text='API Demos']")).click();
        clickWithText("API Demos");
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[@text='Accessibility']")).click();
        clickWithText("Accessibility");

        driver.closeApp();


    }

    public void clickWithText(String text){ // custom method ile
        driver.findElement(By.xpath("//*[@text='"+text+"']")).click();
    }




}
