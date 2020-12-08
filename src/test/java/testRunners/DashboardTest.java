package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/appfeatures"},
		glue= {"stepDefinitions", "src/test/java/myHooks"},
		plugin= {"pretty", "html:target/cucumber-reports/report.html"},
		monochrome= true,
		dryRun = false,
		tags = "@smoke",
		publish = true  // only available in 6.9.0
		)
public class DashboardTest {

}
