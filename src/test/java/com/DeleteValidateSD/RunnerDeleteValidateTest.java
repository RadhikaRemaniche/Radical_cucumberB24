package com.DeleteValidateSD;

//Test word should be there in the class name  cucumber understands it 

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/com/DeleteValidateFF/DeleteRequestValidate.feature", // Location of the feature files
    glue = "com.DeleteValidateSD",     // Location of the step definitions
  //dryRun=false,
    //monochrome=true,
    plugin = {
        "pretty",                           // Prints the Gherkin steps in a readable format
        "html:target/cucumber-htmlreport.html",     // Generates HTML report
        "json:target/cucumber-report3.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/ExtentReport1.html"// Generates JSON report
    }
)

public class RunnerDeleteValidateTest {
    // This class doesn't need any code. It's just used as a placeholder.

}
