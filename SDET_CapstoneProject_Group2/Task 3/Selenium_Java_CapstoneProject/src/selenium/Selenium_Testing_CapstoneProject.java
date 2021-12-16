package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium_Testing_CapstoneProject{
public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\heman\\Desktop\\UST_Workspace\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.urbanladder.com/";
        driver.get(baseUrl);
        
		String s = driver.getTitle();
		System.out.println(s);
		s.equals(" Furniture Online: @Upto 40% Off on Wooden Furniture Online in India at Best Price - Urban Ladder");
        
        driver.findElement(By.id("search")).getTagName();
        driver.manage().window().maximize();

        System.out.println("Click on Help");
        driver.findElement(By.xpath("//*[@id=\"header\"]/section/div/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"4192\"]/div[2]/div")).click();
        System.out.println("Clicking on track order");
        driver.findElement(By.xpath("//*[@id=\"header\"]/section/div/ul[1]/li[2]/a")).click();
        System.out.println("Passing values to access orders");
        driver.findElement(By.id("ip_379403698")).sendKeys("mchooper50");
        driver.findElement(By.id("ip_394711104")).sendKeys("7530091966");
        driver.findElement(By.xpath("//*[@id=\"app-container\"]/div/main/section/form[1]/button/span[1]")).click();
        System.out.println("Going to some other webpage");
        driver.navigate().to("https://www.urbanladder.com/sofa-set?src=g_topnav_sofa-set");
        driver.navigate().back();
        System.out.println("Correction done in track order details");
        driver.findElement(By.id("ip_394711104")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("ip_379403698")).sendKeys("myid789");
        Thread.sleep(2000);
        driver.findElement(By.id("ip_394711104")).sendKeys("7530091978");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app-container\"]/div/main/section/form[1]/button/span[1]")).click();
        System.out.println("Clicking on sofa bed");
        driver.findElement(By.xpath("//*[@id=\"app-container\"]/div/header/div[2]/nav/ul/li[2]/h4")).click();
        System.out.println("Navigating to other page to access items");
        driver.navigate().to("https://www.urbanladder.com/fabric-sofa-beds?src=cat_2");
        driver.findElement(By.xpath("//*[@id=\"default\"]")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")).click();
        System.out.println("Pop-up Closed");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"filters_availability_In_Stock_Only\"]")).click();
        System.out.println("Checkboxing now");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li/div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"price_limit_14727-26444\"]")).click();
        System.out.println("Clicing radio button");
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li/div[2]/div/div/ul/li[1]/div/div[1]/span[2]")).click();
        //Thread.sleep(2000);
        System.out.println("Clearing filter");
        driver.findElement(By.xpath("//*[@id=\"price_limit_38163-49880\"]")).click();
        Thread.sleep(2000);
        System.out.println("Changed the price limit filter");   
        System.out.println("Window closed");
        driver.close();
        


}

}