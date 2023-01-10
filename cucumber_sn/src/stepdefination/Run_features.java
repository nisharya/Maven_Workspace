package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Run_features {
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	   System.out.println("homepage is opened");
	}
	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() {
	    System.out.println("login page navigated");
	}
	@When("User enters Credentials to LogIn")
	public void user_enters_credentials_to_log_in(io.cucumber.datatable.DataTable dataTable) {
	  String uid1=dataTable.row(0).get(0);
	  String pd1=dataTable.row(0).get(1);
	  System.out.println(uid1+"  "+pd1);
	}
	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
	    System.out.println("error displayed");
	}

}
