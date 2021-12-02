
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class CalculatorTest {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
DesiredCapabilities dc = new DesiredCapabilities();
dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");//Version is number here
dc.setCapability(MobileCapabilityType.DEVICE_NAME, "OPPO A7");
dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\heman\\Downloads\\APKPure_v3.17.29_apkpure.com.apk");
URL url = new URL("http://127.0.0.1:4723/wd/hub");
AndroidDriver<WebElement> driver = new AndroidDriver<WebElement> (url, dc);
Thread.sleep(5000);
}
}
