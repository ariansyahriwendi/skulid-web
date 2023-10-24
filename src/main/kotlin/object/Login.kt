package `object`

import baseClass.BaseSetUp
import org.openqa.selenium.By

class Login : BaseSetUp() {
    private val username = By.id("username")
    fun username(x: String) {
        input(username, x)
    }

    private val password = By.id("password")
    fun password(x: String) {
        input(password, x)
    }

    private val submit = By.ById("submit")
    fun submit() {
        click(submit)
    }

}
