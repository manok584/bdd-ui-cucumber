package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	
	@Given("search field is available on dashboard page")
	public void search_field_is_available_on_dashboard_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("step 1: Am on dashboard page ");
	}

	@When("i enter the group with name {string}")
	public void i_enter_the_group_with_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("step 2: Entered the group name "+string);
	}

	@Then("group with name {string} should be displayed")
	public void group_with_name_should_be_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("step 3: group name" +string +"should be displayed ");
	}


}
