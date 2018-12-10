package cart

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class cartQty {
	@Keyword
	def searchForItemAndAddItToCart(String itemName)  {
		WebUI.setText(findTestObject('Page_main/input_Search_q'), itemName)
		WebUI.click(findTestObject('Page_Search/button_Search'))
		WebUI.click(findTestObject('Page_Search/img'))
		WebUI.click(findTestObject('Page_item/a_Add to Cart'))
	}

	@Keyword
	def changeQty(String qty){

		WebUI.setText(findTestObject('Page_upd_qty/input_upd_qty'), qty)
		WebUI.click(findTestObject('Page_upd_qty/button_'))
	}
}
