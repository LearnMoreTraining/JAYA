package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = {"src/test/resources/featurefile"},
        glue = {"stepdefination"},
        tags = "@Table",
        plugin = {"pretty","html:target/test-output/test.html",
                "json:target/json-output/test.json",
                "junit:target/junit-output/test.xml"
        }
)

public class Runner {
}
