package myHooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	WebDriver driver;

	@Before(order = 1)
	public void launchBrowser() {
		System.out.println("Launch chrome browser");
	}

	@Before(order = 2)
	public void login(Scenario sc) {

		System.out.println("Open URL");
		System.out.println("Scneario name:" + sc.getName());

	}

	@After(order = 2)
	public void closeBrowser() {

		System.out.println("Quit browser");

	}

	@After(order = 1)
	public void logout(Scenario sc) {

		System.out.println("Capture failed screenshot");

		System.out.println("Logout app");
	}

}
