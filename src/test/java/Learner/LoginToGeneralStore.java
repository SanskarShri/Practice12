package Learner;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import objectrepo.GeneralStoreLoginPage;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginToGeneralStore
{
    @Test
    public void generalStoreLogin() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy C9 Pro");
        dc.setCapability(MobileCapabilityType.UDID, "914859ae");
        dc.setCapability("appPackage", "com.androidsample.generalstore");
        dc.setCapability("appActivity", ".SplashActivity");

        URL url=new URL("https://localhost:4723/wd/hub");
        AppiumDriver driver=new AppiumDriver(url,dc);

        GeneralStoreLoginPage login=new GeneralStoreLoginPage(driver);
        login.generalStoreLogin("Vishnu");
        System.out.println("hi");

    }
}
