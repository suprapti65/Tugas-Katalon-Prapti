import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.demoblaze.com/index.html')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Purchase/phones tab'))

WebUI.click(findTestObject('Object Repository/Purchase/phone images'))

WebUI.click(findTestObject('Object Repository/Purchase/add to cart button'))

WebUI.click(findTestObject('Object Repository/Purchase/cart tab'))

WebUI.verifyElementText(findTestObject('Object Repository/Purchase/cart verify text'), 'Products')

WebUI.verifyElementText(findTestObject('Object Repository/Purchase/cart verify total price'), 'Total')

WebUI.click(findTestObject('Object Repository/Purchase/place order button cart'))

WebUI.setText(findTestObject('Object Repository/Purchase/inputname'), 'prapti')

WebUI.setText(findTestObject('Object Repository/Purchase/inputcountry'), 'indonesia')

WebUI.setText(findTestObject('Object Repository/Purchase/inputcity'), 'rembang')

WebUI.setText(findTestObject('Object Repository/Purchase/inputcard'), '2345454')

WebUI.click(findTestObject('Object Repository/Purchase/inputcard'))

WebUI.setText(findTestObject('Object Repository/Purchase/inputmonth'), '11')

WebUI.setText(findTestObject('Object Repository/Purchase/inputyear'), '2')

WebUI.click(findTestObject('Object Repository/Purchase/button_Purchase'))

WebUI.click(findTestObject('Object Repository/Purchase/button_OK'))

