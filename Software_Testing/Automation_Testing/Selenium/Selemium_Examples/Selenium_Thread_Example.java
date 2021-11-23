package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Selenium_Thread_Example {
 
    public static void main(String s[]) throws InterruptedException  {
         
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ustjavasdetb420\\Desktop\\chromedriver_win32\\chromedriver.exe");								
        WebDriver driver = new ChromeDriver();
         
        driver.get("http://google.com");
         
        driver.findElement(By.name("q")).sendKeys("Selenium");
         
        Thread.sleep(1000);
                 
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul/li[9]/div/div[2]/div[1]/span/b")).click();
            }
 
}