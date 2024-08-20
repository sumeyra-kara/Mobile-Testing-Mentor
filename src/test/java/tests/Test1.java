package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Test1 {

    @Test
    public void test1() throws MalformedURLException, InterruptedException {

        /**
         * {
         *   "appium:udid": "emulator-5554",   // adb devices yazinca cmd'Den, gelir
         *   "appium:version": "11",
         *   "appium:deviceName": "Pixel_2",
         *   "platformName": "Android",
         *   "appium:realDevice": "false",
         *   "appium:automationName": "uiautomator2"
         * }
         */

        // appium Inspector'a baglanmak icin
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:udid","emulator-5554");
        capabilities.setCapability("appium:version","11.0");
        capabilities.setCapability("appium:deviceName","Pixel_2");
        capabilities.setCapability("platformName", "Android");

        capabilities.setCapability("appPackage", "com.touchboarder.android.api.demos");
        capabilities.setCapability("appActivity", "com.touchboarder.androidapidemos.MainActivity");

        AppiumDriver<MobileElement> driver  =new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        driver.findElement(By.xpath("//*[@text='Continue']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='API Demos']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Accessibility']")).click();

        driver.closeApp();





    }
}
