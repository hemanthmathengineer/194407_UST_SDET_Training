package cucumberjenkins;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 

@CucumberOptions( 	
		features = "src/test/resources/Features", 
		glue = "cucumberjenkins",
		monochrome = true,
		plugin= {"pretty", "html:target/HtmlReports"})

 
public class TestRunner extends AbstractTestNGCucumberTests {
 
}
