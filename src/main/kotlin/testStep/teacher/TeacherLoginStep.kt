package testStep.teacher

import baseClass.BaseStep
import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class TeacherLoginStep : BaseStep() {
    @Given("Account is created")
    fun accountIsCreated() {
    }

    @When("I open website")
    fun iOpenWebsite() {
    }

    @And("I select user role teacher")
    fun iSelectUserRoleTeacher() {
        teacherLogin.userRoleTeacher()
    }

    @And("I input username {string}")
    fun iInputUsername(x: String) {
        teacherLogin.username(x)
    }

    @And("I input password {string}")
    fun iInputPassword(x: String) {
        teacherLogin.password(x)
    }

    @And("I click privacy policy")
    fun iClickPrivacyPolicy() {
        teacherLogin.privacyPolicy()
    }

    @And("I click login")
    fun iClickLogin() {
        teacherLogin.login()
    }

    @Then("Success to login")
    fun successToLogin() {

    }

}
