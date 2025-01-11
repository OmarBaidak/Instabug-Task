package cucumber;

import io.cucumber.testng.*;
import io.cucumber.testng.CucumberOptions;

public class CucumberRunnerClass {

    @CucumberOptions(features = {"src/test/java/feature"}
            , glue = {"stepDefinition", "hooks"}
            , tags = "@validLogin"
            , plugin = {"html:target/cucumber-reports.html"}
    )

    public static class CucumberRunner extends AbstractTestNGCucumberTests {


    }

}
