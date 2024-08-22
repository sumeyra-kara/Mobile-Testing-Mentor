package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.Driver.*;

public class MobileUtils {

    public static AppiumDriver<MobileElement> openApp(Device device,App app){
        runAppiumService();
        return Driver.getDriver(device,app);
    }

    public static  void closeApp(){
        getDriver().closeApp();
        stopAppiumService();
    }

    public static WebElement getElementByText(String text){
        return getDriver().findElement(By.xpath("//*[@text='"+text+"']"));
    }

    public static By getLocatorByText(String text){
        return By.xpath("//*[@text='"+text+"']");
    }

    public static void clickWithText(String text){ // custom method ile
        getDriver().findElement(By.xpath("//*[@text='"+text+"']")).click();
    }



}
