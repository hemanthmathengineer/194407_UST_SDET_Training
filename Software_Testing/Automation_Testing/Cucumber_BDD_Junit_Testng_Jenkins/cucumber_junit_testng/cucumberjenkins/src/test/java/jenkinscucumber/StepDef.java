package jenkinscucumber;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;

public class StepDef {
public WebDriver driver;



@Then("Navigate to Browser")
public void navigate_to_Browser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb420\\Desktop\\chromedriver_win32\\chromedriver.exe");	
    driver=new ChromeDriver();
    driver.get("http://demo.guru99.com/test/newtours/register.php");
    
}



}