package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="src/test/resources/FeatureFiles/LoginFeature.feature",
		glue="StepDefinition",
		monochrome=true,
		tags="@smoke",
		plugin= {"pretty", "html:target/cucumber_reports.html"}
		)

public class Run
{

}
