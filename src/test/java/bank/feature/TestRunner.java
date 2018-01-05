package bank.feature;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/feature",
		strict = true, monochrome=true,
		plugin = { "pretty", "html:target/site/cucumber" }
		 ) 
public class TestRunner {

}

