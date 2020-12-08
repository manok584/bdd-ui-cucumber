package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	
	@Given("search field is available on dashboard page")
	public void search_field_is_available_on_dashboard_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Am on dashboard page ");
	}

	@When("i enter the group with name {string}")
	public void i_enter_the_group_with_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Entered the group name "+string);
	}

	@Then("group with name {string} should be displayed")
	public void group_with_name_should_be_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("group name" +string +"should be displayed ");
	}

	@When("i enter the external group with name {string}")
	public void i_enter_the_external_group_with_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Entered the external group name "+string);
	}

	@Then("external group with name {string} should be displayed")
	public void external_group_with_name_should_be_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("");
	}

	@When("i enter the dynamic group with name {string}")
	public void i_enter_the_dynamic_group_with_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Entered the dynamic group name "+string);
	}

	@Then("dynamic group with name {string} should be displayed")
	public void dynamic_group_with_name_should_be_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("group name" +string +"should be displayed");
	}

	@When("i enter the entitlement group with name {string}")
	public void i_enter_the_entitlement_group_with_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Entered the entitlement group name "+string);
	}

	@Then("entitlement group with name {string} should be displayed")
	public void entitlement_group_with_name_should_be_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("group name\" +string +\"should be displayed");
	}

}
