package cucumberApiFramework.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceAPIStepDef {
	
	@Given("user add new place payload")
	public void user_add_new_place_payload() {
	    
	}

	@When("user calls {string} using POST http request")
	public void user_calls_using_POST_http_request(String string) {
	   
	}

	@Then("API call got success with status code as {int}")
	public void api_call_got_success_with_status_code_as(Integer int1) {
	   
	}

	@Then("{string} in responce body is {string}")
	public void in_responce_body_is(String string, String string2) {
	   
	}



}
