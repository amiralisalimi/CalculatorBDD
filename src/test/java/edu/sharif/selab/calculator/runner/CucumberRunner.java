package edu.sharif.selab.calculator.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "edu.sharif.selab.calculator.stepdefs"
)
public class CucumberRunner {
}
