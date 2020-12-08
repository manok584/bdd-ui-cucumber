package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/appfeatures"},
		glue= {"stepDefinitions", "src/test/java/myHooks"},
		plugin= {"pretty", "json:target/cucumber-reports"},
		monochrome= true,
		dryRun = true,
		tags = "@Regression"
//		publish = false  // only available in 6.9.0
		)
public class DashboardTest {

}
