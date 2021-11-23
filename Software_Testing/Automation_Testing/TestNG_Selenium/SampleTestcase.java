package TestNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestcase {
	WebDriver d;
	
	@BeforeTest
	public void checkWebsite() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb420\\Desktop\\chromedriver_win32\\chromedriver.exe"); 
		d = new ChromeDriver();
		d.navigate().to("https://www.google.com/");
	}
	
  @Test
  public void f() {
	  d.findElement(By.name("q")).sendKeys("Tirupati");
  }
}
