package cucumber;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
WebDriver dr;

@Given("navigate to Gmail page")
public void navigate_to_Gmail_page() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb420\\Desktop\\chromedriver_win32\\chromedriver.exe");	
    dr=new ChromeDriver();
    dr.get("https://mail.google.com/");
    //Write code here that turns the phrase above into concrete actions
	System.out.println("Hi model i am good");
 
}

@When("user loged in")
public void user_loged_in() {
	System.out.println("Hi, i am doing good iuabsdhfipbwDSGBGVFsdidbvipSDBVbsddvibSDHIVBHASDBVHSDBVHASDBDVOBSADVHBADSNVSD");
    // Write code here that turns the phrase above into concrete actions

}





/*@Then("^home page should be displayed$")
public void verifySuccessful(){
      String expectedText="Gmail";
      String actualText=         dr.findElement(By.xpath("//*[@id='gbq1']/div/a/span")).getText();
      Assert.assertTrue("Login not successful",expectedText.equals(actualText));
      }*/
}