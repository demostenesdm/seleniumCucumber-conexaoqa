package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"Steps","Hooks"},
        plugin = {
                "pretty",
                "html:target/Relatorio-html.html"
        }
)
public class Runner {
}
