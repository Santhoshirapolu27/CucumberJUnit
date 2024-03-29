package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/featureFiles/ScenarioTagging.feature", tags = "@regression and not @sanity")
public class ScenarioTagsTest {

}
