package cucumber3;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = {"cucumber3"},plugin = {"pretty", "html:target/HtmlReports"})
public class TestRunner{
	
}