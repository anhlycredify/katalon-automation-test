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

// Step 1
WebUI.openBrowser('')

WebUI.navigateToUrl('https://web-sdk.credify.one/bnpl')

WebUI.setText(findTestObject('Object Repository/Page_Credify App/input__product2_quantity'), '0')

WebUI.setText(findTestObject('Object Repository/Page_Credify App/input__product3_quantity'), '0')

WebUI.click(findTestObject('Object Repository/Page_Credify App/div_NHN HNG TRC TR SAUCngCredify'))

WebUI.click(findTestObject('Object Repository/Page_Passport/img_Select a desired partner_serviceProvide_c6be13'))

WebUI.click(findTestObject('Object Repository/Page_Passport/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Passport/button_Verify with OTP'))

WebUI.setText(findTestObject('Object Repository/Page_Passport/input_A 6-character confirmation code has verification-input-id'), 
    '123456')

WebUI.click(findTestObject('Object Repository/Page_Passport/div'))

WebUI.click(findTestObject('Object Repository/Page_Passport/input_Gender_ant-radio-input'))

WebUI.setText(findTestObject('Page_Passport/input_Old ID number_idcard_old_number'), '025520098')

WebUI.click(findTestObject('Object Repository/Page_Passport/div_Email address'))

WebUI.setText(findTestObject('Object Repository/Page_Passport/input_Email address_email'), 'testmail@yopmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Passport/input_VillageHamletResidential group_perman_a4b352'), 'test1')

WebUI.setText(findTestObject('Object Repository/Page_Passport/input_Company name_employment.claims.company_name'), 'test2')

WebUI.setText(findTestObject('Object Repository/Page_Passport/input_Company phone number_employment.claim_b569fc'), '0332522971')

WebUI.setText(findTestObject('Object Repository/Page_Passport/input_VillageHamletResidential group_employ_e468ba'), 'test3')

WebUI.setText(findTestObject('Object Repository/Page_Passport/input_Monthly wage income_monthly_wage_inco_d5d4bc'), '2đ')

WebUI.click(findTestObject('Object Repository/Page_Passport/label_20,000,000'))

WebUI.click(findTestObject('Object Repository/Page_Passport/div_'))

WebUI.setText(findTestObject('Object Repository/Page_Passport/input_concat(Primary person, , s full name)_5c4218'), 'test name')

WebUI.setText(findTestObject('Object Repository/Page_Passport/input_Phone number_primary_reference_person_d47978'), '0332522972')

WebUI.setText(findTestObject('Object Repository/Page_Passport/input_concat(Secondary person, , s full nam_a47527'), 'test name2')

WebUI.setText(findTestObject('Object Repository/Page_Passport/input_Phone number_secondary_reference_pers_91e8ff'), '0332522973')

WebUI.click(findTestObject('Object Repository/Page_Passport/span_I agree to share the information with _e731ed'))

