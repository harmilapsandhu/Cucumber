package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

//We can also use Tidy Gherkin plugin in Chrome to populate this entire skeleton. (Just paste the .feature file into plugin)	
//Better way is to run JUnit Test without implementing these methods first, then these missing methods will be
//automatically displayed in console from where you can copy and paste here.
	
//Regular Expressions - In .feature file, anything placed in inverted commas "" is considered as dynamic value.
//In our stepDifinition file, for every dynamic value, we tweak our method by adding an argument
//It's best to run it as blank first and then copy paste the methods from console	
	
//Parameterization:
//In .feature file., list scenarios as 'Scenario Outline'.
//Under 'Examples:'	provide the data using pipes(Check E2E.feature file for illustration)
//Enclose in <> instead of "" in Scenario Outline
//Run the test and then copy the syntax for stepDefinitions from console	
//This will make the test run for as many times as the different data are provided
	
	@Given("User is on NetBanking Login Page")
	public void user_is_on_net_banking_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login in Page opened");
	    //throw new io.cucumber.java.PendingException();
	}


	@When("User logs in using {string} and {string}")
	public void user_logs_in_using_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);
		System.out.println(string2);
	   // throw new io.cucumber.java.PendingException();
	}
	@Then("Dashboard is populated")
	public void dashboard_is_populated() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Dashboard populated");
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("Cards are {string}")
	public void cards_are(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User Cards are "+string);
	    //throw new io.cucumber.java.PendingException();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
