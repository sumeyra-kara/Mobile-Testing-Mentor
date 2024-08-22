package euroTech.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.URL;

public class Test2 {

    AppiumDriver<MobileElement> driver;
    AppiumDriverLocalService service;

    @Test
    public void test1() throws InterruptedException {
        service= new AppiumServiceBuilder().withIPAddress("127.0.0.1")
                .usingPort(4723)
                .build();
        service.start();

        // appium Inspector'a baglanmak icin
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:udid","emulator-5554");
        capabilities.setCapability("appium:version","11.0");
        capabilities.setCapability("appium:deviceName","Pixel_2");
        capabilities.setCapability("platformName", "Android");

        capabilities.setCapability("appPackage", "com.touchboarder.android.api.demos");
        capabilities.setCapability("appActivity", "com.touchboarder.androidapidemos.MainActivity");

        driver =new AndroidDriver<>(service.getUrl(),capabilities);
       // AppiumDriver<MobileElement> driver  =new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        //driver.findElement(By.xpath("//*[@text='Continue']")).click();
        clickWithText("Continue"); // custom method ile de yapilabilir

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='API Demos']")).click();
        Thread.sleep(2000);

        //driver.findElement(By.xpath("//*[@text='Accessibility']")).click();
        clickWithText("Accessibility");

        driver.closeApp();


    }

    public void clickWithText(String text){ // custom method ile
        driver.findElement(By.xpath("//*[@text='"+text+"']")).click();
    }




}
