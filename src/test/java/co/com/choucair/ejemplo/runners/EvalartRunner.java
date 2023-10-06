package co.com.choucair.ejemplo.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/evalart.feature",
        glue = {"co.com.choucair.ejemplo.setup", "co.com.choucair.ejemplo.stepdefinitions"},
        tags = "@testEvalart",
        snippets = SnippetType.CAMELCASE,
        dryRun = false
)
public class EvalartRunner {
}
