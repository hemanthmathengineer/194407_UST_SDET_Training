package TestNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestcase {
	
		WebDriver d;
		@BeforeTest
		 public void launchBrowser() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\heman\\Desktop\\UST_Workspace\\chromedriver.exe");
			 d=new ChromeDriver();
			d.navigate().to("https://www.urbanladder.com/");	
			d.manage().window().maximize();
			Thread.sleep(2000);
		}

	@Test(priority = 0)
		 public void login() throws InterruptedException {
		    d.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/section[3]/ul/li[2]/span")).click();
			Thread.sleep(2000);
			d.findElement(By.partialLinkText("Log In")).click();
			Thread.sleep(10000);
			d.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div[3]/form/div/input")).sendKeys( "ashnatp369@gmail.com");
			d.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div[3]/form/div/div/div/input")). sendKeys("ashnatp@123");
			d.findElement(By.id("ul_site_login")).click();
		}
	@Test(priority = 1)
		public void Living() {
			d.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[2]/span")).click();
			String s = d.findElement(By.partialLinkText("Living")).getText();
	}
	@Test(priority = 2)
	public void AccentChairs() {
		d.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[2]/div/div/ul/li[3]/ul/li[4]/a/span")).click();
		String s = d.findElement(By.partialLinkText("Accent Chairs")).getText();
		
	}
	@Test(priority = 3)
	public void ExcludeOutOfStock() {
		d.findElement(By.id("filters_availability_In_Stock_Only")).click();
		String s = d.findElement(By.partialLinkText("Exclude Out Of Stock")).getText();
		System.out.println(s);
		Assert.assertEquals(s,"Exclude Out Of Stock");
	}
	@Test(priority = 4)
	public void Finish() {
		d.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[3]/div[1]")).click();

	}}

