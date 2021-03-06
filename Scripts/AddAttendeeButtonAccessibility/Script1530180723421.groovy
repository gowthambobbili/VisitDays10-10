import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


CustomKeywords.'com.CommonUtilities.LoginAsDifferentUserPermissions.NavigateToHomePage'()

WebUI.click(findTestObject('HomePageElements/CheckInLeftNav'))

CustomKeywords.'com.CommonUtilities.Verifications.VerifyElementPresentAndStopExecutionIfFailed'(findTestObject('HomePageElements/AddAttendeeButton'), "Add Attendee button is not present in Check in page")

//WebUI.click(findTestObject('HomePageElements/AddAttendeeButton'))

CustomKeywords.'com.CommonUtilities.PageNavigations.NavigateToDailyVisits'()

CustomKeywords.'com.CommonUtilities.Verifications.VerifyElementPresentAndStopExecutionIfFailed'(findTestObject('HomePageElements/AddAttendeeButton'), "Add Attendee button is not present in Daily visits page")

CustomKeywords.'com.CommonUtilities.PageNavigations.NavigateToEvents'()

CustomKeywords.'com.CommonUtilities.Verifications.VerifyElementPresentAndStopExecutionIfFailed'(findTestObject('HomePageElements/AddAttendeeButton'), "Add Attendee button is not present in Events page")

CustomKeywords.'com.CommonUtilities.PageNavigations.NavigateToOffCampus'()

CustomKeywords.'com.CommonUtilities.Verifications.VerifyElementPresentAndStopExecutionIfFailed'(findTestObject('HomePageElements/AddAttendeeButton'), "Add Attendee button is not present in Off-Campus page")

WebUI.delay(10)