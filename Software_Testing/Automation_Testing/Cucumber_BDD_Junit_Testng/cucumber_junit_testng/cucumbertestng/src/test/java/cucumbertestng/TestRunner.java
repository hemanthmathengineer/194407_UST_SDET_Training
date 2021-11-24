package cucumbertestng;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features",glue= {"cucumbertestng"},
monochrome=true)

public class TestRunner extends AbstractTestNGCucumberTests  {

}