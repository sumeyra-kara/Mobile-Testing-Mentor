package euroTech.tests;


import euroTech.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.App;
import utils.Device;
import utils.Locators;

import static utils.MobileUtils.*;

public class Test8 extends TestBase {
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
       clickWithText("Auto Complete");

        int actualSize = driver.findElements(Locators.completeList).size(); // from api demos
        
        driver = openApp(Device.PIXEL_2,App.CALCULATOR);
        clickNumber(9);
        operator("minus");
        clickNumber(2);
        operator("equals");
        String expectedSıze = driver.findElement(Locators.result).getText();
        int expected = Integer.parseInt(expectedSıze);

        Assert.assertEquals(actualSize,expected);

        activateBackgroundApp(App.API_Demos.appPackage);


    }


}
