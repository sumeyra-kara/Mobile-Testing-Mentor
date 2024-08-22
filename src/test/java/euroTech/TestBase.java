package euroTech;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utils.App;
import utils.Device;
import utils.MobileUtils;

import java.util.concurrent.TimeUnit;

public class TestBase {

    AppiumDriver<MobileElement> driver;

    WebDriverWait wait;

    @BeforeTest
    public void setUp() {
        driver = MobileUtils.openApp(Device.PIXEL_2, App.API_Demos);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,10);
    }

    @AfterTest
    public void tearDown() {
        MobileUtils.closeApp();

    }
}
