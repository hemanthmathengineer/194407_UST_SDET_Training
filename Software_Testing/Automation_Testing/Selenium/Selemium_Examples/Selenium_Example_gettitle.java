package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Selenium_Example_gettitle  {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ustjavasdetb420\\Desktop\\chromedriver_win32\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			d.navigate().to("http://www.google.com/");
			
			String s = d.getTitle();
			System.out.println(s);
			s.equals("Google");			
		}

	}
