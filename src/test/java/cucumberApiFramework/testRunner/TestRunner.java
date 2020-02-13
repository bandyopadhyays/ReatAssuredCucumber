package cucumberApiFramework.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:cucumberApiFramework/featureFiles" ,
				 glue = {"cucumberApiFramework.stepDef"})
public class TestRunner {

}
