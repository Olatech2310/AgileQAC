import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.did.ie/')

CustomKeywords.'cart.cartQty.searchForItemAndAddItToCart'('iphone 7')

CustomKeywords.'cart.cartQty.changeQty'('2')

WebUI.click(findTestObject('Page_upd_qty/td_1299.98'))

WebUI.verifyElementText(findTestObject('Page_upd_qty/total_amount'), '€1,299.98')

CustomKeywords.'cart.cartQty.changeQty'('5')

WebUI.click(findTestObject('Page_upd_qty/td_1299.98'))

WebUI.verifyElementText(findTestObject('Page_upd_qty/total_amount'), '€3,249.95')

WebUI.closeBrowser()

