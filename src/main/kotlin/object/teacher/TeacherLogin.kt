package `object`.teacher

import baseClass.BaseSetUp
import org.openqa.selenium.By

class TeacherLogin : BaseSetUp() {

    private val userRoleTeacher = By.ByXPath("//*[@id=\"root\"]/div/main/div[2]/div[3]")
    fun userRoleTeacher() {
        click(userRoleTeacher)
    }

    private val username = By.name("username")
    fun username(x: String) {
        input(username, x)
    }

    private val password = By.name("password")
    fun password(x: String) {
        input(password, x)
    }

    private val privacyPolicy = By.ByXPath("//*[@id=\"root\"]/div/main/div/div[2]/form/div[4]/div/div/label/span")
    fun privacyPolicy() {
        click(privacyPolicy)
    }

    private val login = By.ByXPath("//*[@id=\"root\"]/div/main/div/div[2]/form/div[5]/button")
    fun login() {
        click(login)
    }

}
