import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join

String baseUrl = 'https://dev.advertizoom.com/#/login'

WebUI.openBrowser(baseUrl)

def driver = DriverFactory.getWebDriver()

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.open('https://dev.advertizoom.com/#/login')

//selenium.click("id=exampleInputLogin1")
//selenium.click("id=exampleInputLogin1")
selenium.doubleClick('id=exampleInputLogin1')

WebUI.setText(findTestObject('login'), 'admin')

WebUI.setMaskedText(findTestObject('password'), 'a8wtbYA8QX5RZYoC')

selenium.click('//button[@type=\'submit\']')
WebUI.delay(1)
for (int x = 0; x < 2; x = x + 1){
WebUI.click(findTestObject('mediaplans'))

WebUI.delay(1)

//selenium.click('link=Медиапланы')
selenium.click('id=tagid_403')

WebUI.delay(1)

selenium.click('link=12')

WebUI.delay(1)

selenium.click('id=status')

WebUI.delay(1)

selenium.select('id=status', 'label=На согласовании')

WebUI.delay(1)

selenium.click('xpath=(//option[@value=\'1\'])[5]')

WebUI.delay(1)

selenium.click('//input[@value=\'Сохранить\']')

WebUI.delay(1)

selenium.click('id=status')

WebUI.delay(1)

selenium.select('id=status', 'label=Отклонен')

WebUI.delay(1)

selenium.click('xpath=(//option[@value=\'2\'])[4]')

WebUI.delay(1)

selenium.click('//input[@value=\'Сохранить\']')

WebUI.delay(1)
}

