package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
WebDriver driver =null;
    

	@Given("the user opens the browser")
	public void the_user_opens_the_browser_1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\heman\\Desktop\\UST_Workspace\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	    

	@When("the user navigates to urban ladder")
	public void the_user_navigates_to_urban_ladder1 () {
		driver.get("https://www.urbanladder.com/");
	}

	@Then("search living section_1")
	public void search_living_section_1() throws InterruptedException {
		driver.findElement(By.id("search")).getTagName();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.urbanladder.com/living-room-furniture?src=g_breadcrumb");
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")).click();
        System.out.println("Pop-up Closed");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[2]/span")).click();
        System.out.println("Clicking on living");
        Thread.sleep(2000);
       
      
        driver.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[2]/div/div/ul/li[3]/ul/li[6]/a/span")).click();
        Thread.sleep(2000);
        System.out.println("Clicking on gaming chairs");
        
        driver.findElement(By.xpath("//*[@id=\"filters_availability_In_Stock_Only\"]")).click();
        System.out.println("Checkboxing now");
        Thread.sleep(2000);
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li/div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"price_limit_8717-9373\"]")).click();
        Thread.sleep(2000);
        System.out.println("Clicking radio button");
        
        driver.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li/div[2]/div/div/ul/li[1]/div/div[1]/span[2]")).click();
        Thread.sleep(2000);
        System.out.println("Clearing filter");
        
        driver.findElement(By.xpath("//*[@id=\"price_limit_9374-10029\"]")).click();
        Thread.sleep(2000);
        System.out.println("Changed the price limit filter");
        
        Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/ul/li"))).perform();
			System.out.println("Cursor hovered over to price");
        Thread.sleep(2000);
        
        System.out.println("Window closed");
        driver.close();
	}
        
        
        
    	@Given("the user opens the browser2")
    	public void opens_the_browser_2() {
    		System.setProperty("webdriver.chrome.driver","C:\\Users\\heman\\Desktop\\UST_Workspace\\chromedriver.exe" );
    		driver = new ChromeDriver();
    		driver.manage().window().maximize();
    	}
    	    

    	@When("the user navigates to urban ladder2")
    	public void the_user_navigates_to_urban_ladder2() {
    		driver.get("https://www.urbanladder.com/");
    	}

    	@Then("selecting product in section_1")
    	public void selecting_product_in_section_1() throws InterruptedException {
    		driver.findElement(By.id("search")).getTagName();
            driver.manage().window().maximize();

    
        System.out.println("selecting the product");
        driver.navigate().to("https://www.urbanladder.com/products/gerika-gaming-chair?sku=FVSTCH51OB30320&src=subcat");
     
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")).click();
        System.out.println("Pop-up Closed");
        driver.findElement(By.xpath("//*[@id=\"product-thumbnails\"]/li[3]/a/img")).click();
        Thread.sleep(2000);
        System.out.println("change the view");
        
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(2000);
        System.out.println("add to cart");
        
        driver.findElement(By.xpath("//*[@id=\"checkout-link\"]")).click();
        Thread.sleep(2000);
        System.out.println("checkout");
        
        driver.findElement(By.id("order_email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("order_ship_address_attributes_zipcode")).sendKeys("683580");
        driver.findElement(By.id("order_ship_address_attributes_address1")).sendKeys("abcdefg");
        driver.findElement(By.id("order_ship_address_attributes_firstname")).sendKeys("xxxxxx");
        driver.findElement(By.id("order_ship_address_attributes_lastname")).sendKeys("yyyyyy");
        driver.findElement(By.id("order_ship_address_attributes_phone")).sendKeys("xxxxxx");
        driver.findElement(By.id("gstin")).sendKeys("gst123");
        driver.findElement(By.id("address-form-submit")).click();
        
        Thread.sleep(2000);
        System.out.println("filling up the details");
        
        
        
       
      
   
        
        System.out.println("Window closed");
        driver.close();
	}




@Given("the user opens the browser3")
public void opens_the_browse3() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\heman\\Desktop\\UST_Workspace\\chromedriver.exe" );
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}
    

@When("the user navigates to urban ladder3")
public void navigates_to_urban_ladder3() {
	driver.get("https://www.urbanladder.com/");
}


@Then("selecting product in section3")
public void selecting_product_in_section_3() throws InterruptedException {
	driver.findElement(By.id("search")).getTagName();
    driver.manage().window().maximize();


System.out.println("selecting the product3");
driver.navigate().to("https://www.urbanladder.com/products/altura-coffee-table-with-nested-stools?sku=FNTBCF12TT10053&src=room");


Thread.sleep(6000);
driver.findElement(By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")).click();
System.out.println("Pop-up Closed");
driver.findElement(By.xpath("//*[@id=\"product-thumbnails\"]/li[5]/a/img")).click();
Thread.sleep(2000);
System.out.println("change the view");

driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
Thread.sleep(2000);
System.out.println("add to cart");

driver.findElement(By.xpath("//*[@id=\"checkout-link\"]")).click();
Thread.sleep(2000);
System.out.println("checkout");

driver.findElement(By.id("order_email")).sendKeys("abc@gmail.com");
driver.findElement(By.id("order_ship_address_attributes_zipcode")).sendKeys("683580");
driver.findElement(By.id("order_ship_address_attributes_address1")).sendKeys("abcdefg");
driver.findElement(By.id("order_ship_address_attributes_firstname")).sendKeys("xxxxxx");
driver.findElement(By.id("order_ship_address_attributes_lastname")).sendKeys("yyyyyy");
driver.findElement(By.id("order_ship_address_attributes_phone")).sendKeys("xxxxxx");
driver.findElement(By.id("gstin")).sendKeys("gst123");
driver.findElement(By.id("address-form-submit")).click();




   


    System.out.println("Window closed");
    driver.close();
    

}

@Given("the user opens the browser4")
public void opens_the_browse4() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\heman\\Desktop\\UST_Workspace\\chromedriver.exe" );
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}
    

@When("the user navigates to urban ladder4")
public void navigates_to_urban_ladder4() {
	driver.get("https://www.urbanladder.com/");
}


@Then("selecting product in section4")
public void selecting_product_in_section_4() throws InterruptedException {
	driver.findElement(By.id("search")).getTagName();
    driver.manage().window().maximize();


System.out.println("selecting the product4");
driver.navigate().to("https://www.urbanladder.com/products/altura-coffee-table-with-nested-stools?sku=FNTBCF12TT10053&src=room");


Thread.sleep(6000);
driver.findElement(By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")).click();
System.out.println("Pop-up Closed");




driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
Thread.sleep(2000);
System.out.println("add to cart");

driver.findElement(By.xpath("//*[@id=\"checkout-link\"]")).click();
Thread.sleep(2000);
System.out.println("checkout");

driver.findElement(By.id("order_email")).sendKeys("abc@gmail.com");
driver.findElement(By.id("order_ship_address_attributes_zipcode")).sendKeys("683580");
driver.findElement(By.id("order_ship_address_attributes_address1")).sendKeys("abcdefg");
driver.findElement(By.id("order_ship_address_attributes_firstname")).sendKeys("xxxxxx");
driver.findElement(By.id("order_ship_address_attributes_lastname")).sendKeys("yyyyyy");
driver.findElement(By.id("order_ship_address_attributes_phone")).sendKeys("xxxxxx");
driver.findElement(By.id("gstin")).sendKeys("gst123");
driver.findElement(By.id("address-form-submit")).click();



   


    System.out.println("Window closed");
    driver.close();
    

}


}


