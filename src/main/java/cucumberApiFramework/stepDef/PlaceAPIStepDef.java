package cucumberApiFramework.stepDef;

import java.util.ArrayList;

import cucumberApiFramework.POJO.AddPlacePOJO;
import cucumberApiFramework.POJO.Location;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceAPIStepDef {
	
	AddPlacePOJO objPOJO = new AddPlacePOJO();
	
	@Given("user add new place payload")
	public void user_add_new_place_payload() {		
		
		Location objLocation = new Location();
		ArrayList<String> type = new ArrayList<String>();
		type.add("API");
		type.add("e-learning");
		
		objLocation.setLat(-48.383494);
		objLocation.setLang(43.427362);
		
		objPOJO.setLocation(objLocation);
		objPOJO.setAccuracy("50");
		objPOJO.setName("API Testing");
		objPOJO.setPhone_number("(+91) 983 893 3937");
		objPOJO.setAddress("29, side layout, cohen 09");
		objPOJO.setTypes(type);
		objPOJO.setWebsite("hpps:\\www.google.com");
		objPOJO.setLanguage("French-IN");	
	    
	}

	@When("user calls {string} using POST http request")
	public void user_calls_using_POST_http_request(String string) {
	   
		//new RequestSpecBuilder()
	}

	@Then("API call got success with status code as {int}")
	public void api_call_got_success_with_status_code_as(Integer int1) {
	   
	}

	@Then("{string} in responce body is {string}")
	public void in_responce_body_is(String string, String string2) {
	   
	}



}
