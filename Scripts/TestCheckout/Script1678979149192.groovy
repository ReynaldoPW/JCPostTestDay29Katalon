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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://shop.demoqa.com/')

WebUI.click(findTestObject('Object Repository/Checkout/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_Dismiss'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_My Account'))

WebUI.setText(findTestObject('Object Repository/Checkout/Page_My Account  ToolsQA Demo Site/input__username'), 'reypau')

WebUI.setEncryptedText(findTestObject('Object Repository/Checkout/Page_My Account  ToolsQA Demo Site/input__password'), 
    '/DC12iZoLA7LhSNf8IZ3NA==')

WebUI.click(findTestObject('Object Repository/Checkout/Page_My Account  ToolsQA Demo Site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_My Account  ToolsQA Demo Site/a_Search'))

WebUI.setText(findTestObject('Object Repository/Checkout/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s'), 
    'product')

WebUI.sendKeys(findTestObject('Object Repository/Checkout/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Search Results for product  ToolsQA Demo Site/a_pink drop shoulder oversized t shirt'))

WebUI.selectOptionByValue(findTestObject('Checkout/color'), 'pink', true)

WebUI.selectOptionByValue(findTestObject('Checkout/size'), '37', true, FailureHandling.OPTIONAL)

WebUI.waitForElementVisible(findTestObject('Checkout/size'), 10)

WebUI.selectOptionByValue(findTestObject('Checkout/size'), '37', true)

WebUI.click(findTestObject('Object Repository/Checkout/Page_pink drop shoulder oversized t shirt  _e751c6/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_pink drop shoulder oversized t shirt  _e751c6/a_View cart'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Cart  ToolsQA Demo Site/a_Proceed to checkout'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/input_privacy policy_terms'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/button_Place order'))

WebUI.verifyElementPresent(findTestObject('Checkout/txtSuccessOrder'), 1)

WebUI.verifyElementText(findTestObject('Checkout/txtSuccessOrder'), 'Thank you. Your order has been received.')

WebUI.closeBrowser()

