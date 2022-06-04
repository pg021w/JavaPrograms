import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature/SearchFlights.feature",
        glue = {"stepDefinition", "Hooks"},
        tags = "@Test",
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true)
public class Runner {
}
