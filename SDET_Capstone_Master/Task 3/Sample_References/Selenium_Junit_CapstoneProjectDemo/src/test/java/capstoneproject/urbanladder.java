package capstoneproject;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class urbanladder {
	WebDriver driver =null;

	  @Test public void test() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\heman\\Desktop\\UST_Workspace\\chromedriver.exe" ); driver
	  = new ChromeDriver(); driver.manage().window().maximize();
	  driver.get("https://www.urbanladder.com/");
	  driver.findElement(By.id("search")).getTagName();
	  driver.manage().window().maximize();
	  
	  driver.navigate().to(
	  "https://www.urbanladder.com/living-room-furniture?src=g_breadcrumb");
	  Thread.sleep(6000); driver.findElement(By.xpath(
	  "//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")).click();
	  System.out.println("Pop-up Closed"); Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[2]/span")).
	  click(); System.out.println("Clicking on living"); Thread.sleep(2000);
	  
	  
	  driver.findElement(By.xpath(
	  "//*[@id=\"topnav_wrapper\"]/ul/li[2]/div/div/ul/li[3]/ul/li[6]/a/span")).
	  click(); Thread.sleep(2000); System.out.println("Clicking on gaming chairs");
	  
	  driver.findElement(By.xpath("//*[@id=\"filters_availability_In_Stock_Only\"]"
	  )).click(); System.out.println("Checkboxing now"); Thread.sleep(2000);
	  
	  Thread.sleep(2000); driver.findElement(By.xpath(
	  "//*[@id=\"filters-form\"]/div[1]/div/div/ul/li/div[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"price_limit_8717-9373\"]")).click();
	  Thread.sleep(2000); System.out.println("Clicking radio button");
	  
	  driver.findElement(By.xpath(
	  "//*[@id=\"filters-form\"]/div[1]/div/div/ul/li/div[2]/div/div/ul/li[1]/div/div[1]/span[2]"
	  )).click(); Thread.sleep(2000); System.out.println("Clearing filter");
	  
	  driver.findElement(By.xpath("//*[@id=\"price_limit_9374-10029\"]")).click();
	  Thread.sleep(2000); System.out.println("Changed the price limit filter");
	  
	  Actions actions = new Actions(driver);
	  actions.moveToElement(driver.findElement(By.xpath(
	  "//*[@id=\"content\"]/div[4]/ul/li"))).perform();
	  System.out.println("Cursor hovered over to price"); Thread.sleep(2000);
	  
	  System.out.println("Window closed"); driver.close(); }
	  
	  @Test public void test2() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\heman\\Desktop\\UST_Workspace\\chromedriver.exe" ); driver
	  = new ChromeDriver(); driver.manage().window().maximize();
	  driver.get("https://www.urbanladder.com/");
	  driver.findElement(By.id("search")).getTagName();
	  driver.manage().window().maximize();
	  
	  
	  System.out.println("selecting the product"); driver.navigate().to(
	  "https://www.urbanladder.com/products/gerika-gaming-chair?sku=FVSTCH51OB30320&src=subcat"
	  );
	  
	  Thread.sleep(6000); driver.findElement(By.xpath(
	  "//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")).click();
	  System.out.println("Pop-up Closed");
	  driver.findElement(By.xpath("//*[@id=\"product-thumbnails\"]/li[3]/a/img")).
	  click(); Thread.sleep(2000); System.out.println("change the view");
	  
	  driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	  Thread.sleep(2000); System.out.println("add to cart");
	  
	  driver.findElement(By.xpath("//*[@id=\"checkout-link\"]")).click();
	  Thread.sleep(2000); System.out.println("checkout");
	  
	  driver.findElement(By.id("order_email")).sendKeys("abc@gmail.com");
	  driver.findElement(By.id("order_ship_address_attributes_zipcode")).sendKeys(
	  "683580");
	  driver.findElement(By.id("order_ship_address_attributes_address1")).sendKeys(
	  "abcdefg");
	  driver.findElement(By.id("order_ship_address_attributes_firstname")).sendKeys
	  ("xxxxxx");
	  driver.findElement(By.id("order_ship_address_attributes_lastname")).sendKeys(
	  "yyyyyy");
	  driver.findElement(By.id("order_ship_address_attributes_phone")).sendKeys(
	  "xxxxxx"); driver.findElement(By.id("gstin")).sendKeys("gst123");
	  driver.findElement(By.id("address-form-submit")).click();
	  
	  Thread.sleep(2000); System.out.println("filling up the details");
	  
	  
	  
	  
	  
	  
	  
	  System.out.println("Window closed"); driver.close(); }
	  
	  @Test public void test3() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\heman\\Desktop\\UST_Workspace\\chromedriver.exe" );
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.urbanladder.com/");
			driver.findElement(By.id("search")).getTagName();
		    driver.manage().window().maximize();
		    System.out.println("navigating to wooden sofa sets page");
			driver.navigate().to("https://www.urbanladder.com/wooden-sofas?src=g_topnav_living_sofa-set_wooden-sofa-sets");
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")).click();
			System.out.println("Pop-up Closed");
			System.out.println("checking product functions");
	
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div/ul/li[1]/div/div[2]/a/div[2]/img")).click();
			Thread.sleep(6000);
			System.out.println("product page navigation checking");
			String winHandleBefore = driver.getWindowHandle();
	        for(String winHandle : driver.getWindowHandles()){
	            driver.switchTo().window(winHandle);
	        }
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, "https://www.urbanladder.com/products/malabar-wooden-sofa-macadamia-brown?src=listing-wooden-sofas" );
			System.out.println("product page verified");
			Thread.sleep(6000);
			String winHandleBefore1 = driver.getWindowHandle();
	        for(String winHandle : driver.getWindowHandles()){
	            driver.switchTo().window(winHandle);
	        }
			driver.findElement(By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")).click();
			System.out.println("Pop-up Closed");
			String winHandleBefore2 = driver.getWindowHandle();
	        for(String winHandle : driver.getWindowHandles()){
	            driver.switchTo().window(winHandle);
	        }
	    	Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id=\"sofaoverviewlist\"]/ul/li[2]/button")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"sofaoverviewlist\"]/ul/li[7]/button")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"sofaoverviewlist\"]/ul/li[12]/button")).click();
				System.out.println("random radio buttons checked");
			driver.close();
		
	  }
	  
	  @Test public void test4() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\heman\\Desktop\\UST_Workspace\\chromedriver.exe" ); 
	  driver= new ChromeDriver(); driver.manage().window().maximize();
	  driver.get("https://www.urbanladder.com/");
	  driver.findElement(By.id("search")).getTagName();
	  driver.manage().window().maximize();
	  
	  
	  System.out.println("selecting the product4"); driver.navigate().to(
	  "https://www.urbanladder.com/products/altura-coffee-table-with-nested-stools?sku=FNTBCF12TT10053&src=room"
	  );
	  
	  
	  Thread.sleep(6000); driver.findElement(By.xpath(
	  "//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")).click();
	  System.out.println("Pop-up Closed");
	  
	  
	  
	  
	  driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	  Thread.sleep(2000); System.out.println("add to cart");
	  
	  driver.findElement(By.xpath("//*[@id=\"checkout-link\"]")).click();
	  Thread.sleep(2000); System.out.println("checkout");
	  
	  driver.findElement(By.id("order_email")).sendKeys("abc@gmail.com");
	  driver.findElement(By.id("order_ship_address_attributes_zipcode")).sendKeys(
	  "683580");
	  driver.findElement(By.id("order_ship_address_attributes_address1")).sendKeys(
	  "abcdefg");
	  driver.findElement(By.id("order_ship_address_attributes_firstname")).sendKeys
	  ("xxxxxx");
	  driver.findElement(By.id("order_ship_address_attributes_lastname")).sendKeys(
	  "yyyyyy");
	  driver.findElement(By.id("order_ship_address_attributes_phone")).sendKeys(
	  "xxxxxx"); driver.findElement(By.id("gstin")).sendKeys("gst123");
	  driver.findElement(By.id("address-form-submit")).click();
	  
	  
	  
	  
	  
	  
	  System.out.println("Window closed"); driver.close(); }
	  
	  
	  @Test public void test5() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\heman\\Desktop\\UST_Workspace\\chromedriver.exe" ); driver
	  = new ChromeDriver(); driver.manage().window().maximize();
	  driver.get("https://www.urbanladder.com/");
	  driver.findElement(By.id("search")).getTagName();
	  driver.manage().window().maximize();
	  System.out.println("Navigating to nested tables page"); driver.navigate().to(
	  "https://www.urbanladder.com/nested-tables-and-stools?src=g_topnav_living_tables_nested-tables"
	  ); Thread.sleep(6000); driver.findElement(By.xpath(
	  "//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")).click();
	  System.out.println("Pop-up Closed"); Thread.sleep(3000);
	  driver.findElement(By.xpath(
	  "//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[2]/div[1]")).click();
	  Thread.sleep(3000); System.out.println("testing checkbox");
	  driver.findElement(By.xpath(
	  "//*[@id=\"filters_brand_name_By_Solanki_Handicrafts\"]")).click();
	  Thread.sleep(3000); System.out.println("removing the filter");
	  driver.findElement(By.xpath(
	  "//*[@id=\"content\"]/div[2]/div[2]/div/ul/li/span[2]")).click();
	  Thread.sleep(3000); driver.close(); }
	 
	
	
	  @Test public void test6() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\heman\\Desktop\\UST_Workspace\\chromedriver.exe" ); driver
	  = new ChromeDriver(); driver.manage().window().maximize();
	  driver.get("https://www.urbanladder.com/");
	  driver.findElement(By.id("search")).getTagName();
	  driver.manage().window().maximize();
	  System.out.println("navigating to console table page"); driver.navigate().to(
	  "https://www.urbanladder.com/console-table?src=g_topnav_living_tables_console-table"
	  ); Thread.sleep(6000); driver.findElement(By.xpath(
	  "//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")).click();
	  System.out.println("Pop-up Closed"); Thread.sleep(3000);
	  
	  System.out.println("testing dropdown filter"); driver.findElement(By.xpath(
	  "//*[@id=\"content\"]/div[2]/div[1]/div/div/div/div/div[2]/div[1]/span")).
	  click(); Thread.sleep(3000);
	  System.out.println("navigate to discount filtered page");
	  driver.findElement(By.xpath(
	  "//*[@id=\"content\"]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/ul/li[5]"
	  )).click(); Thread.sleep(3000);
	  System.out.println("verifying discounts page");
	  String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.urbanladder.com/console-table?src=g_topnav_living_tables_console-table&sort=discount_perc_desc" );
		System.out.println("discounts page url verified");
	  driver.close();
	  
	  }
	 

	
	  @Test public void test7() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\heman\\Desktop\\UST_Workspace\\chromedriver.exe" ); driver
	  = new ChromeDriver(); driver.manage().window().maximize();
	  driver.get("https://www.urbanladder.com/");
	  driver.findElement(By.id("search")).getTagName();
	  driver.manage().window().maximize();
	  System.out.println("navigating to leather sofa sets pages");
	  driver.navigate().to(
	  "https://www.urbanladder.com/leather-sofas?src=g_topnav_living_sofa-set_leather-sofa-sets"
	  ); Thread.sleep(6000); driver.findElement(By.xpath(
	  "//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")).click();
	  System.out.println("Pop-up Closed"); Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"filters_availability_In_Stock_Only\"]"
	  )).click();
	  System.out.println("checking weather checkbox is enabled or not"); boolean
	  status =
	  driver.findElement(By.xpath("//*[@id=\"filters_availability_In_Stock_Only\"]"
	  )).isEnabled();
	  
	  if(status){ System.out.println("Checkbox is checked"); } else {
	  System.out.println("Checkbox is unchecked"); }
	  
	  
	  driver.close(); }
	 
	@Test
	public void test8() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\heman\\Desktop\\UST_Workspace\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		driver.findElement(By.id("search")).getTagName();
	    driver.manage().window().maximize();
	    System.out.println("navigating to leather sofa sets pages");
		driver.navigate().to("https://www.urbanladder.com/leather-sofas?src=g_topnav_living_sofa-set_leather-sofa-sets");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")).click();
		System.out.println("Pop-up Closed");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div/ul/li[1]/div/div[2]/div/a[3]/div/button")).click();
		Thread.sleep(3000);
		String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.urbanladder.com/products/weston-half-leather-sofa-chocolate-italian-leather?src=listing-leather-sofas" );
		System.out.println("url verified");
		driver.close();
		
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
            driver.close();
		
	}
}
