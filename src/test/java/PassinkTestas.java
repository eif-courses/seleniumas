import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"passed"},
    tags = "@reset",
    plugin = {
        "pretty",
        "json:build/cucumber-report/cucumber.json",
        "html:build/cucumber-report/cucumber.html",
        "junit:build/cucumber-report/cucumber.xml"}
)
public class PassinkTestas { }