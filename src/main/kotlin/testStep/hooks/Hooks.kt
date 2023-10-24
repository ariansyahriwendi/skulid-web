package testStep.hooks

import baseClass.BaseSetUp
import baseClass.BaseStep
import io.cucumber.java.After
import io.cucumber.java.Before
import java.io.IOException

class Hooks : BaseStep() {
    @Before
    @Throws(IOException::class)
    fun setUp() {
        BaseSetUp.getDriver()
        BaseSetUp.getUrl()?.let { BaseSetUp.openWebsite(it) }
        BaseSetUp.maximizeWebsite()
    }
}


    @After
    fun tearDown() {
        try {
            Thread.sleep(2000)
            BaseSetUp.quitWebsite()
        } catch (ignored: Exception) {

    }
}
