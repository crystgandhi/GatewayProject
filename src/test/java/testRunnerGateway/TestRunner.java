package testRunnerGateway;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={".//Features/gatewayHomepage.feature"},
		glue={"stepDefinitions"},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty", "html:target/cucumber"}
		)
public class TestRunner {

}
