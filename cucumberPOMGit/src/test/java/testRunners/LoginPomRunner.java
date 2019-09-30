package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions
(
		features="features",
		glue= {"stepDefinition"},
		plugin= {"json:target/cucumber-reports/report.json"}
		)
public class LoginPomRunner {

}
