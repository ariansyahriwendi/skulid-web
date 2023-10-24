package testStep

import baseClass.BaseStep
import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class LoginStep : BaseStep() {
    @Given("Account is created")
    fun accountIsCreated() {
    }

    @When("I open website")
    fun iOpenWebsite() {
    }

    @And("I input username {string}")
    fun iInputUsername(x: String) {
        login.username(x)
    }

    @And("I input password {string}")
    fun iInputPassword(x: String) {
        login.password(x)
    }

    @And("I click submit")
    fun iClickSubmit() {
        login.submit()
    }

    @Then("Success to login")
    fun successToLogin() {

    }

}
