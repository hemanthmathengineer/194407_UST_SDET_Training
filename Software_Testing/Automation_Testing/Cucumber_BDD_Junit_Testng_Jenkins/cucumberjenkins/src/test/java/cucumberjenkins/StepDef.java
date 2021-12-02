package cucumberjenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDef {
public WebDriver driver;


@Given("Navigate to Browser")
public void navigate_to_browser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\heman\\Desktop\\UST_Workspace\\ChromeDriverpath\\chromedriver.exe");	
    driver=new ChromeDriver();
    driver.get("http://demo.guru99.com/test/newtours/register.php");
}


@When("Contact Information")
public void contact_information() {
	  driver.findElement(By.name("firstName")).sendKeys("John");	
	  driver.findElement(By.name("lastName")).sendKeys("Philip");	
	  driver.findElement(By.name("phone")).sendKeys("1234567890");	
	  driver.findElement(By.name("userName")).sendKeys("user");	
  
}

@When("Mailing Information")
public void mailing_information() {
	 driver.findElement(By.name("address1")).sendKeys("House no 14 hgj hhfbfvbfvffff");	
 	  driver.findElement(By.name("city")).sendKeys("Persia");	
 	  driver.findElement(By.name("state")).sendKeys("kerala");	
 	  driver.findElement(By.name("postalCode")).sendKeys("8905123");
 	  driver.findElement(By.name("country")).click();	  
 	  driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select/option[7]")).click();
   
}

@When("User Information")
public void user_information() {
	  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("user");
  	  driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input")).sendKeys("user");
  	  driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")).sendKeys("user");
  	  driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input")).click();

}

@When("Login Information")
public void login_information() {
	  driver.findElement(By.linkText("Home")).click();
	  driver.findElement(By.name("userName")).sendKeys("user");	
	  driver.findElement(By.name("password")).sendKeys("user");	  
	  driver.findElement(By.name("submit")).click();
	  
}


@When("Preferences")
public void preferences() {
	  driver.findElement(By.linkText("Flights")).click();
	  //click on the Business class
    driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();
    // click on Blue Skies Airlines
    driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select/option[2]")).click();
    //Then click continue
    driver.findElement(By.xpath(" /html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")).click();
    driver.findElement(By.xpath(" /html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/a")).click();
    driver.close();
}



}