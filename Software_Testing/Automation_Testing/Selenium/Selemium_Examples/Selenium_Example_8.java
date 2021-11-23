package selenium;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.By;

	public class Selenium_Example_8 {
	 public static void main(String[] args) { 
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ustjavasdetb420\\Desktop\\chromedriver_win32\\chromedriver.exe");								
		    String baseURL = "http://demo.guru99.com/test/newtours/register.php";
		    WebDriver driver = new ChromeDriver();
			driver.get(baseURL);

			Select drpCountry = new Select(driver.findElement(By.name("country")));
			drpCountry.selectByVisibleText("ANTARCTICA");

			//Selecting Items in a Multiple SELECT elements
			driver.get("http://jsbin.com/osebed/2");
			Select fruits = new Select(driver.findElement(By.id("fruits")));
			fruits.selectByVisibleText("Banana");
			fruits.selectByIndex(1);
			fruits.selectByIndex(2);
			fruits.selectByIndex(3);
	 }
	}


