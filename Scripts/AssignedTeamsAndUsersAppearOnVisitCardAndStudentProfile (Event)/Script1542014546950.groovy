import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By

WebDriver driver = DriverFactory.getWebDriver()

CustomKeywords.'com.CommonUtilities.LoginAsDifferentUserPermissions.NavigateToHomePage'()

WebUI.click(findTestObject('Object Repository/PersonIconObjects/PersonIcon'))

WebUI.click(findTestObject('Object Repository/PersonIconObjects/MyTeamOption'))

WebUI.click(findTestObject('TeamManagement/TeamsTab'))

WebUI.click(findTestObject('TeamManagement/Teams/CreateTeamButton'), FailureHandling.STOP_ON_FAILURE)

def TeamName ="Don't delete"

def TeamBio = 'Team is created'

WebUI.sendKeys(findTestObject('TeamManagement/Teams/TeamNameTextBoxInCreateTeamPage'), TeamName)

WebUI.sendKeys(findTestObject('TeamManagement/Teams/TeamBioTextFieldInCreteTeamPage'), TeamBio)

WebUI.click(findTestObject('TeamManagement/Teams/AddLaterButtonInTeamPhotoDivisionInCreateTeamPage'))

WebUI.click(findTestObject('TeamManagement/Teams/AddMembersButtonInMembersDivision'))

WebUI.waitForElementVisible(findTestObject('TeamManagement/Teams/SearchFiledInmembers'), 0)

WebUI.sendKeys(findTestObject('TeamManagement/Teams/SearchFiledInmembers'), 'test user1')

WebUI.click(findTestObject('TeamManagement/Teams/AddIconInAddTeamMembersModal'))

WebUI.click(findTestObject('TeamManagement/Teams/DoneButtonInUpdateTeamMembersModal'))

WebUI.waitForElementVisible(findTestObject('TeamManagement/Teams/DoneButtonInUpdateTeamMembersModal'), 0)

WebUI.waitForElementVisible(findTestObject('TeamManagement/Teams/SelectAllButtonInNotificationPreferancesDivision'), 0)

WebUI.click(findTestObject('TeamManagement/Teams/SelectAllButtonInNotificationPreferancesDivision'), FailureHandling.STOP_ON_FAILURE)

//WebUI.scrollToElement(findTestObject('TeamManagement/Teams/CreateTeamBtn'), 0)

WebUI.click(findTestObject('Object Repository/Teams1/CreateTeamButtonInTeams'))

//WebUI.verifyElementNotPresent(findTestObject('TeamManagement/Teams/CreateTeamBtn'), 0)

def Object = new TestObject("CreatedTeamInTeamList")

Object.addProperty("xpath", ConditionType.EQUALS, '//div[text()="'+TeamName+'"]')

if(!(WebUI.verifyElementPresent(Object, 0, FailureHandling.OPTIONAL)))
{
	KeywordUtil.markFailed("The created team is not shown in the Teams list")

	WebUI.takeScreenshot()
}

WebUI.click(findTestObject('Object Repository/HomePageElements/SchoolProdoutNav'))


//===========

String VisitType = CustomKeywords.'com.CommonUtilities.RequestMethods.CreateInstantEventVisitTypeWithManualCheckin'()

WebUI.waitForElementPresent(findTestObject('DailyVisitsPage/VisitTypeFieldInDailyVisit'), 0)

WebUI.click(findTestObject('DailyVisitsPage/VisitTypeFieldInDailyVisit'))

//driver.findElement(By.xpath(('//li[text()=\'' + VisitTypeName) + '\']')).click()
def VisitTypeObjetct = new TestObject('VisitTypeInVisitTypeDropDown')

VisitTypeObjetct.addProperty('xpath', ConditionType.EQUALS, ('//li[text()=\'' + VisitType) + '\']')

WebUI.click(VisitTypeObjetct)

WebUI.scrollToElement(findTestObject('DailyVisitsPage/LocationFieldInDailyVisit'), 0)

WebUI.click(findTestObject('EventsPage/DateFieldInCreateEventPage'))

WebUI.click(findTestObject('DailyVisitsPage/StartDateInVisitTypeCalanderWhileCreatingVT'))

WebUI.scrollToElement(findTestObject('DailyVisitsPage/LocationFieldInDailyVisit'), 0)

WebUI.click(findTestObject('DailyVisitsPage/LocationFieldInDailyVisit'))

WebUI.click(findTestObject('DailyVisitsPage/FirstLocationInCreateDailyVisiyPage'))

WebUI.click(findTestObject('DailyVisitsPage/NextButtonInDailyVisit'))

WebUI.click(findTestObject('DailyVisitsPage/NoCapacityButtonInDailyVisit'))

WebUI.click(findTestObject('DailyVisitsPage/NextButtonInDailyVisit'))

WebUI.scrollToElement(findTestObject('DailyVisitsPage/AssignLaterButtonInDailyVisit'), 0)

//WebUI.click(findTestObject('DailyVisitsPage/AssignLaterButtonInDailyVisit'), FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('DailyVisitsPage/AssignLaterButtonInDailyVisit'), 0)

WebUI.click(findTestObject('DailyVisitsPage/AssignNowInDailyVisit'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('DailyVisitsPage/SearchUserSearchboxInAssignUsersPage'), 'mahesh test')

WebUI.delay(2)

WebUI.click(findTestObject('DailyVisitsPage/AddSymbolOfMaheshTestInAssignUsersPage'))

WebUI.click(findTestObject('DailyVisitsPage/TeamsTabInUsersAssignedDivision'))

WebUI.clearText(findTestObject('DailyVisitsPage/SearchUserSearchboxInAssignUsersPage'))

WebUI.sendKeys(findTestObject('DailyVisitsPage/SearchUserSearchboxInAssignUsersPage'), 'Don\'t delete')

WebUI.click(findTestObject('DailyVisitsPage/TeamInTeamsListInUserAssignedDivision'))

WebUI.click(findTestObject('DailyVisitsPage/NextButtonInDailyVisit'))

WebUI.click(findTestObject('DailyVisitsPage/PublishButtonInDailyVisit'))

WebUI.waitForElementVisible(findTestObject('DailyVisitsPage/PublishButtonInConfirmationModal'), 0)

WebUI.click(findTestObject('DailyVisitsPage/PublishButtonInConfirmationModal'))

WebUI.waitForElementPresent(findTestObject('DailyVisitsPage/DateRangeFilterInDailyVisitsPage'), 0)

WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('DailyVisitsPage/DateRangeFilterInDailyVisitsPage'), 0, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.CommonUtilities.FilterInIndexPage.ApplyFiltersInIndexPage'(VisitType)

WebUI.click(findTestObject('DailyVisitsPage/InstantBookRadioButtonInRegistationMethodFilter'))

WebUI.waitForElementPresent(findTestObject('DailyVisitsPage/FirstVisitInVisitIndex'), 0)

//int NumberOfVisits = driver.findElements(By.xpath('//div[@class=\'shadow __visit__visit-card__7422f pointer-on-hover ember-view\']')).size()
def Profile = new TestObject('AssignedTeamProfileOnVisitCard')

def UserProfile = new TestObject('AssignedUserProfileOnVisitCard')

Profile.addProperty('xpath', ConditionType.EQUALS, ('(//h4[text()=\'' + VisitType) + '\']/../../..//div[text()=\'DD\'])[1]')

if (!(WebUI.verifyElementPresent(Profile, 0, FailureHandling.OPTIONAL))) {
	KeywordUtil.markFailed('Assigned Team profile is not shown on the published Event visit card in index page')

	WebUI.takeScreenshot()
}

UserProfile.addProperty('xpath', ConditionType.EQUALS, ('(//h4[text()=\'' + VisitType) + '\']/../../..//div[text()=\'MT\'])[1]')

if (!(WebUI.verifyElementPresent(UserProfile, 0, FailureHandling.OPTIONAL))) {
	KeywordUtil.markFailed('Assigned User profile is not shown on the published Event visit card in index page')

	WebUI.takeScreenshot()
}

String Single = 'Single'

String Group = CustomKeywords.'com.CommonUtilities.ConfirmationPage.NavgateToConfirmationPageForGroupRequestWithUserNameForInstantBook'(
		VisitType, findTestObject('Add Attendee/EventsOptionInAddAttendee'), Single)

CustomKeywords.'com.CommonUtilities.Quit.CloseMobiInConfirmationPageForInstantBook'()

WebUI.verifyElementPresent(findTestObject('DailyVisitsPage/FirstVisitInVisitIndex'), 0)

WebUI.click(findTestObject('DailyVisitsPage/FirstVisitInVisitIndex'), FailureHandling.STOP_ON_FAILURE)

def GroupProfile = new TestObject('RegisteredGroupProfileInRegistrantsPage')

GroupProfile.addProperty('xpath', ConditionType.EQUALS, ('(//div[text()=\'' + Group) + '\'])[1]')

WebUI.verifyElementPresent(GroupProfile, 0)

WebUI.click(GroupProfile)

WebUI.waitForElementPresent(findTestObject('UserProfile/FirstVisitInUserProfileVisits'), 0)

WebUI.verifyElementPresent(findTestObject('UserProfile/DetailsTabInUserProfile'), 0)

if (!(WebUI.verifyElementText(findTestObject('UserProfile/VisitTypeNameInUserProfile'), VisitType, FailureHandling.OPTIONAL))) {
	KeywordUtil.markFailed('Visit Type name is not displayed in Group user profile')

	WebUI.takeScreenshot()
}

if (!(WebUI.verifyElementText(findTestObject('UserProfile/AssignedUsersFirstProfileInUserProfile'), 'MT', FailureHandling.OPTIONAL))) {
	KeywordUtil.markFailed('The assigned User profile is not shown in individual leader profile')

	WebUI.takeScreenshot()
}

if (!(WebUI.verifyElementText(findTestObject('UserProfile/SecondAssignedUsersProfileInUserProfile'), 'DD'))) {
	KeywordUtil.markFailed('The assigned Team profile is not shown in Group leader profile')

	WebUI.takeScreenshot()
}

