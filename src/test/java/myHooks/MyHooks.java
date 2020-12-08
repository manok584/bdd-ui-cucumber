package myHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks {

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
	public void logout() {

		System.out.println("Logout app");
	}

}
