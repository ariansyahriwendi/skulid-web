package testRunner

import baseClass.BaseSetUp
import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(
    glue = ["testStep"],
    features = ["src/test/kotlin/BDD/"],
    plugin = ["pretty", "json:target/cucumber.json"],
    tags = "@Login"
)

class TestRunner : BaseSetUp()
