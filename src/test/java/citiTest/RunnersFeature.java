package citiTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import net.serenitybdd.cucumber.CucumberWithSerenity;


	
	@RunWith(CucumberWithSerenity.class)
	@CucumberOptions(features = { "src/test/resources/features" }, glue = {"citiDefinitions" })
	
	public class RunnersFeature {
		
	
}
