import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/feature"},
        glue = {"stepdefinitions"},
        monochrome = false, tags = "@Test",
        plugin = {"pretty"
        })
public class CucumberRunner
{

}


