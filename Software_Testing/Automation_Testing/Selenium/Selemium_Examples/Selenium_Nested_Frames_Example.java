package selenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;	

public class Selenium_Nested_Frames_Example {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ustjavasdetb420\\Desktop\\chromedriver_win32\\chromedriver.exe");								

WebDriver driver=new ChromeDriver();

	    driver.get("Url");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	    int size = driver.findElements(By.tagName("iframe")).size();
	    System.out.println("Total Frames --" + size);
               
		// prints the total number of frames 
		driver.switchTo().frame(0); // Switching the Outer Frame    		
	    System.out.println (driver.findElement(By.xpath("xpath of the outer element ")).getText());

		//Printing the text in outer frame
		size = driver.findElements(By.tagName("iframe")).size();
	    // prints the total number of frames inside outer frame           
                                                                                                          
	    System.out.println("Total Frames --" + size);
	    driver.switchTo().frame(0); // Switching to innerframe
	    System.out.println(driver.findElement(By.xpath("xpath of the inner element ")).getText());
		
		//Printing the text in inner frame
		driver.switchTo().defaultContent();
	}
}
