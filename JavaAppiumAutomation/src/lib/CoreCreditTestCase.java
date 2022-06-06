package lib;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class CoreCreditTestCase extends TestCase {

    protected AppiumDriver driver;
    private static String AppiumURL = "http://127.0.0.1:4723/wd/hub";
    @Override
    protected void setUp() throws Exception
    {
        super.setUp();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("platformVersion","10");
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("appPackage","ru.sravni.android.bankproduct.debug");
        capabilities.setCapability("appActivity","ru.sravni.android.bankproduct.presentation.main.view.MainActivity");
        capabilities.setCapability("app","/Users/konstantin.nikolaev/Desktop/JavaAppiumAutomation/JavaAppiumAutomation/apks/sravni-banks-2.10.0(526)-stand-debug.apk");
        capabilities.setCapability("noReset","true");

        driver = new AndroidDriver(new URL(AppiumURL), capabilities);
    }

    @Override
    protected void tearDown() throws Exception
    {
        driver.quit();

        super.tearDown();
    }
}
