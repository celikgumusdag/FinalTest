package  cucumber;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = "src/test/java/featur",
        plugin = {"pretty", "html:target/cucumber-html-report"},
        //glue = " ",
        tags = "@TestCases1"
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}