package cucumbertestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	WebDriver driver = null;
	@Given("the user opens the browser")
	public void the_user_opens_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ustjavasdetb420\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();driver.navigate();
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Given("hi")
	public void hi() {
		System.out.println("We work together");
	}

	@When("the user navigates to MercuryTours register page")
	public void the_user_navigates_to_mercury_tours_register_page() {
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.getTitle().contains("Tours");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("the user enters lands on the page")
	public void the_user_enters_lands_on_the_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("firstName")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("lastName")).sendKeys("abcd123");
		driver.findElement(By.name("phone")).sendKeys("1231233123");
		driver.findElement(By.name("userName")).sendKeys("abcd123qwerty@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("qwertyqwerty hover colony");	
		driver.findElement(By.name("city")).sendKeys("Persia");	
		driver.findElement(By.name("state")).sendKeys("City Melbourne");	
		driver.findElement(By.name("postalCode")).sendKeys("5252525");
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select/option[7]")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("rangerrathore@gmail.com");
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input")).sendKeys("abcd");
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")).sendKeys("abcd");
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input")).click();
	} 
		@And("Doing a login")
		public void Doing_a_login() {
			driver.findElement(By.linkText("Home")).click();
			  driver.findElement(By.name("userName")).sendKeys("abcd");	
			  driver.findElement(By.name("password")).sendKeys("abcd");
			  driver.findElement(By.name("submit")).click();
			  driver.findElement(By.linkText("Flights")).click();
		      driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		      driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select/option[4]")).click();
		      driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select/option[5]")).click();			  
		      driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();
		      // click on Blue Skies Airlines
		      driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select/option[2]")).click();
		      //Then click continue
		      driver.findElement(By.xpath(" /html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")).click();
		      driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/a/img")).click();
		      driver.close();
	}


}