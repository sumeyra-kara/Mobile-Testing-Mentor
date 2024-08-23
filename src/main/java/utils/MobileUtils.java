package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.appmanagement.ApplicationState;
import io.appium.java_client.touch.offset.PointOption;
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


    public static void swipeV(double startPoint,double endPoint){   // 0,8     0,2
        int width = getDriver().manage().window().getSize().width;
        int height = getDriver().manage().window().getSize().height;

        new TouchAction<>(getDriver()).press(PointOption.point(width/2, (int) (height*startPoint)))
                .moveTo(PointOption.point(width/2, (int) (height*endPoint)))
                .release()
                .perform();

    }

    public static void swipeUntil(double startPoint,double endPoint,By locator){

        while(getDriver().findElements(locator).size() == 0){
            swipeV(startPoint,endPoint);
        }
        getDriver().findElement(locator).click();


    }


    public static void clickNumber(int number){
       getDriver().findElementByAccessibilityId(String.valueOf(number)).click();
    }


    public static void operator(String operator){
        getDriver().findElementByAccessibilityId(operator).click();
    }


    public static void activateBackgroundApp (String appPackage){
        ApplicationState applicationState = getDriver().queryAppState(appPackage);

        if (applicationState.equals(ApplicationState.RUNNING_IN_BACKGROUND)){
            getDriver().activateApp(appPackage);
        }


    }








}
