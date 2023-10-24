package baseClass

import org.openqa.selenium.*
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import java.util.concurrent.TimeUnit
import org.openqa.selenium.WebDriver
import java.io.File
import java.io.IOException
import java.util.Properties


private lateinit var driver: WebDriver
private val properties = Properties()

open class BaseSetUp {
    companion object {


        fun getDriver() {
            try {
                val input = File("properties/browser.properties").inputStream()
                properties.load(input)
                System.setProperty(properties.getProperty("DRIVER_NAME"), properties.getProperty("CHROME_DRIVER_PATH"))

                val chromeOptions = ChromeOptions()
                driver = ChromeDriver(chromeOptions)
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
            } catch (e: IOException) {
                e.printStackTrace()
            }

        }

        fun getUrl(): String? {
            return properties.getProperty("WEB_URL")
        }

        fun openWebsite(websiteUrl: String) {
            driver.navigate().to(websiteUrl)
        }

        fun quitWebsite() {
            driver.quit()
        }

        fun maximizeWebsite() {
            driver.manage().window().maximize()
        }

        fun click(by: By) {
            val element = driver.findElement<WebElement>(by)
            element.click()
        }

        fun input(by: By, text: String) {
            val element = driver.findElement<WebElement>(by)
            element.sendKeys(text)
        }

    }
}



