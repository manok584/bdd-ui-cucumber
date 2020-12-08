package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/appfeatures"},
		glue= {"stepDefinitions", "myHooks"},
		plugin= {"pretty", "html:target/cucumber-reports/report.html"},
		monochrome= true,
		dryRun = true,
		tags = "@smoke",
		publish = true
		)
public class DashboardTest {

}
