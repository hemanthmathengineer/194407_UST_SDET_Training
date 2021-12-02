package cucumber1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinations { 
   WebDriver driver; 


@Given("^I have open the browser$")
public void i_have_open_the_browser()  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb420\\Desktop\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver(); 

}

@When("^I open Facebook website$")
public void i_open_Facebook_website() {
	driver.get("https://www.facebook.com/");
}
}