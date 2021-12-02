import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FirstApp {
public static void main(String[] args) throws MalformedURLException, InterruptedException{
DesiredCapabilities dc= new DesiredCapabilities();
dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");//Version is number here
dc.setCapability(MobileCapabilityType.DEVICE_NAME, "OPPO A7");

//dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\heman\\Downloads\\selendroid-test-app-0.17.0.apk");
URL url=new URL("http://127.0.0.1:4723/wd/hub");
AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);

driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]").click();
Thread.sleep(2000);
driver.findElementByXPath("//android.widget.EditText[@content-desc=\"my_text_fieldCD\"]").click();
driver.findElementByXPath("//android.widget.EditText[@content-desc=\"my_text_fieldCD\"]").sendKeys("search");
driver.findElementByAccessibilityId("startUserRegistrationCD").click();
Thread.sleep(2000);
driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText[1]").sendKeys("Hemanth kumar");


//driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText[1]").;
//driver.findElementByXPath("//android.widget.EditText[@content-desc=\"email of the customer\"]").sendKeys("hemanthkumar3461@gmail.com");
/*driver.findElementById("io.selendroid.testapp:id/input_preferedProgrammingLanguage").click();
driver.findElementById("io.selendroid.testapp:id/inputUsername").sendKeys("Hemanth kumar");*/
}
}
