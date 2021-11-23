package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Example_Iframes {
	public static void main(String[] args) throws Exception {
		// set the geckodriver.exe property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ustjavasdetb420\\Desktop\\chromedriver_win32\\chromedriver.exe");								
		// open firefox
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// open webpage
		driver.get("https://chercher.tech/practice/frames");
		// store the text value
		String textValue = driver.findElement(By.xpath("//label/span")).getText();
		// switch to frame1
		driver.switchTo().frame("frame1");
		// set the value of the textbar to the value stored
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(textValue);
  }
}




public class NestedFrame {
	public static void main(String[] args) throws Exception {
		// set the geckodriver.exe property
		System.setProperty("webdriver.gecko.driver", "C:/PATH/geckodriver.exe");
		// open firefox
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// open webpage
		driver.get("https://chercher.tech/practice/frames");
		//find the frame1 and store it in webelement
		WebElement frame1 = driver.findElement(By.id("frame1"));
		// switch to frame1
		driver.switchTo().frame(frame1);
		// find the frame 3
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		// switch to frame 3
		driver.switchTo().frame(frame3);
		// find the checkbox
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		// if checkbox is not selected then click the checkbox
		if(! checkbox.isSelected()){
			checkbox.click();
		}
	}
}


