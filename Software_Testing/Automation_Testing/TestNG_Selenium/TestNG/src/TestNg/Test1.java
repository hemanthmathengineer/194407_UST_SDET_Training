package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	 WebDriver driver;
	 String path = "C:\\Users\\heman\\Desktop\\UST_Workspace\\ChromeDriverpath\\chromedriver.exe";
	
  @Test(priority = 0)
  public void testingTitle() {
	  
	  System.setProperty("webdriver.chrome.driver",path);
	  driver = new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/register.php");
	  
	  
	   Assert.assertEquals(driver.getTitle(),"Register: Mercury Tours");
	   	 
  }
      @Test(priority = 1)
  	  public void userRegistration() {
	  driver.findElement(By.name("firstName")).sendKeys("Hero ranger");	
	  driver.findElement(By.name("lastName")).sendKeys("Richard");	
	  driver.findElement(By.name("phone")).sendKeys("7530020250");	
	  driver.findElement(By.name("userName")).sendKeys("qwertyrockers@gmail.com");	
	  driver.findElement(By.name("address1")).sendKeys("qwertyqwerty hover colony");	
	  driver.findElement(By.name("city")).sendKeys("Persia");	
	  driver.findElement(By.name("state")).sendKeys("City Melbourne");	
	  driver.findElement(By.name("postalCode")).sendKeys("5252525");
	  driver.findElement(By.name("country")).click();
  }
   	  
      @Test(priority = 2)
      public void countrySelection(){
  	  driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select/option[7]")).click();
	  }
	  
      @Test(priority = 3)
	  public void fillForm(){
	  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("rangerrathore@gmail.com");
	  driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input")).sendKeys("abcd");
	  driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")).sendKeys("abcd");
	  driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input")).click();
	  }
	  
      @Test(priority = 4)
	  public void logIn(){
	  driver.findElement(By.linkText("Home")).click();
	  driver.findElement(By.name("userName")).sendKeys("abcd");	
	  driver.findElement(By.name("password")).sendKeys("abcd");
	  driver.findElement(By.name("submit")).click();
	  }
	  
	  @Test(priority = 5)
	  public void flightCheck(){
	  driver.findElement(By.linkText("Flights")).click();
      driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
      driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select/option[3]")).click();
      driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select/option[3]")).click();
      driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select/option[5]")).click();
      driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();
      driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select/option[2]")).click();
      driver.findElement(By.xpath(" /html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")).click();
	  
}
}
	  

 


  
  




