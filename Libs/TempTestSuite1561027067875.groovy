import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/VisitDays Test Suit for SchoolAdminUsers')

suiteProperties.put('name', 'VisitDays Test Suit for SchoolAdminUsers')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\DELL\\Downloads\\tests copy\\tests copy 14-4-2019\\Reports\\VisitDays Test Suit for SchoolAdminUsers\\20190620_063747\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/VisitDays Test Suit for SchoolAdminUsers', suiteProperties, [new TestCaseBinding('Test Cases/Login and Logout/LoginAsSchoolAdmin', 'Test Cases/Login and Logout/LoginAsSchoolAdmin',  null), new TestCaseBinding('Test Cases/InvalidTimesVerificationWhileCreatingDailyVisit', 'Test Cases/InvalidTimesVerificationWhileCreatingDailyVisit',  null), new TestCaseBinding('Test Cases/InvalidTimesVerificationWhileCreatingEvent', 'Test Cases/InvalidTimesVerificationWhileCreatingEvent',  null), new TestCaseBinding('Test Cases/InvalidTimesVerificationWhileCreatingOff-Campus', 'Test Cases/InvalidTimesVerificationWhileCreatingOff-Campus',  null), new TestCaseBinding('Test Cases/VerificationOfVisitDateAndTimeOnPublishedVisits (Daily Visits)', 'Test Cases/VerificationOfVisitDateAndTimeOnPublishedVisits (Daily Visits)',  null), new TestCaseBinding('Test Cases/VerificationOfVisitDateAndTimeOnPublishedVisits (Events)', 'Test Cases/VerificationOfVisitDateAndTimeOnPublishedVisits (Events)',  null), new TestCaseBinding('Test Cases/VerificationOfVisitDateAndTimeOnPublishedVisits (Off-Campus)', 'Test Cases/VerificationOfVisitDateAndTimeOnPublishedVisits (Off-Campus)',  null), new TestCaseBinding('Test Cases/EditDailyVIsitInSummaryPage', 'Test Cases/EditDailyVIsitInSummaryPage',  null), new TestCaseBinding('Test Cases/EditEventInSummaryPage', 'Test Cases/EditEventInSummaryPage',  null), new TestCaseBinding('Test Cases/EditOff-CampusInSummaryPage', 'Test Cases/EditOff-CampusInSummaryPage',  null), new TestCaseBinding('Test Cases/EditPipelineValuesTest', 'Test Cases/EditPipelineValuesTest',  null), new TestCaseBinding('Test Cases/EditDetailsAndStatusTimestampsVerificationInUserProfile', 'Test Cases/EditDetailsAndStatusTimestampsVerificationInUserProfile',  null), new TestCaseBinding('Test Cases/VerificationOfStatusInStudentProfileWhenRegisteredFromMobi (Daily visits)', 'Test Cases/VerificationOfStatusInStudentProfileWhenRegisteredFromMobi (Daily visits)',  null), new TestCaseBinding('Test Cases/VerificationOfStatusInStudentProfileWhenRegisteredFromMobi (Events)', 'Test Cases/VerificationOfStatusInStudentProfileWhenRegisteredFromMobi (Events)',  null), new TestCaseBinding('Test Cases/VerificationOfStatusInStudentProfileWhenRegisteredFromMobi (Off-Campus)', 'Test Cases/VerificationOfStatusInStudentProfileWhenRegisteredFromMobi (Off-Campus)',  null), new TestCaseBinding('Test Cases/SearchVisitTypeTestInAddVisitToItineraryModal', 'Test Cases/SearchVisitTypeTestInAddVisitToItineraryModal',  null), new TestCaseBinding('Test Cases/AssignedUserIconShouldShowInVisitTypeVisitsPage (Daily Visit)', 'Test Cases/AssignedUserIconShouldShowInVisitTypeVisitsPage (Daily Visit)',  null), new TestCaseBinding('Test Cases/EnableQuestionTest', 'Test Cases/EnableQuestionTest',  null), new TestCaseBinding('Test Cases/AddingTeamMembersWhileCreatingTeam', 'Test Cases/AddingTeamMembersWhileCreatingTeam',  null), new TestCaseBinding('Test Cases/AssignedUserIconShouldShowInVisitTypeVisitsPage (Events)', 'Test Cases/AssignedUserIconShouldShowInVisitTypeVisitsPage (Events)',  null), new TestCaseBinding('Test Cases/AssignedUserIconShouldShowInVisitTypeVisitsPage (Off-Campus)', 'Test Cases/AssignedUserIconShouldShowInVisitTypeVisitsPage (Off-Campus)',  null), new TestCaseBinding('Test Cases/BackButtonShouldbeHiddenInEVRAndEVRCPages', 'Test Cases/BackButtonShouldbeHiddenInEVRAndEVRCPages',  null), new TestCaseBinding('Test Cases/CancelButtonShouldNotSaveTheModificationsMadeInTimesAndBlackoutDatesInSummaryPage', 'Test Cases/CancelButtonShouldNotSaveTheModificationsMadeInTimesAndBlackoutDatesInSummaryPage',  null), new TestCaseBinding('Test Cases/CapacityFilledAndCheckInBarVerificationOnVIsitCardInIndexPage (Daily Visits)', 'Test Cases/CapacityFilledAndCheckInBarVerificationOnVIsitCardInIndexPage (Daily Visits)',  null), new TestCaseBinding('Test Cases/CapacityFilledAndCheckInBarVerificationOnVIsitCardInIndexPage (Events)', 'Test Cases/CapacityFilledAndCheckInBarVerificationOnVIsitCardInIndexPage (Events)',  null), new TestCaseBinding('Test Cases/CapacityFilledAndCheckInBarVerificationOnVIsitCardInIndexPage (Off-Campus)', 'Test Cases/CapacityFilledAndCheckInBarVerificationOnVIsitCardInIndexPage (Off-Campus)',  null), new TestCaseBinding('Test Cases/CurrentCapacityFilterTestForSeatsAtCapacityAndRegistrationsAtCapacity', 'Test Cases/CurrentCapacityFilterTestForSeatsAtCapacityAndRegistrationsAtCapacity',  null), new TestCaseBinding('Test Cases/DeleteAllCanceledVisitsTest (Daily Visits)', 'Test Cases/DeleteAllCanceledVisitsTest (Daily Visits)',  null), new TestCaseBinding('Test Cases/DeleteAllCanceledVisitsTest (Events)', 'Test Cases/DeleteAllCanceledVisitsTest (Events)',  null), new TestCaseBinding('Test Cases/DeleteAllCanceledVisitsTest (Off-Campus)', 'Test Cases/DeleteAllCanceledVisitsTest (Off-Campus)',  null), new TestCaseBinding('Test Cases/DeleteAllDraftedVisitsTest (Daily Visits)', 'Test Cases/DeleteAllDraftedVisitsTest (Daily Visits)',  null), new TestCaseBinding('Test Cases/DeleteAllDraftedVisitsTest (Events)', 'Test Cases/DeleteAllDraftedVisitsTest (Events)',  null), new TestCaseBinding('Test Cases/DeleteAllDraftedVisitsTest (Off-Campus)', 'Test Cases/DeleteAllDraftedVisitsTest (Off-Campus)',  null), new TestCaseBinding('Test Cases/DetailsPageAndUnsavedChangesModalVerificationInUserprofile', 'Test Cases/DetailsPageAndUnsavedChangesModalVerificationInUserprofile',  null), new TestCaseBinding('Test Cases/DuplicateDailyVisitTest', 'Test Cases/DuplicateDailyVisitTest',  null), new TestCaseBinding('Test Cases/DuplicateEventTest', 'Test Cases/DuplicateEventTest',  null), new TestCaseBinding('Test Cases/DuplicateOff-CampusVisitTest', 'Test Cases/DuplicateOff-CampusVisitTest',  null), new TestCaseBinding('Test Cases/MergeUserInTheSameVisitAndVerifyStatusMessageInProfile (Daily Visit)', 'Test Cases/MergeUserInTheSameVisitAndVerifyStatusMessageInProfile (Daily Visit)',  null), new TestCaseBinding('Test Cases/MergeUserInTheSameVisitAndVerifyStatusMessageInProfile (Event)', 'Test Cases/MergeUserInTheSameVisitAndVerifyStatusMessageInProfile (Event)',  null), new TestCaseBinding('Test Cases/MergeUserInTheSameVisitAndVerifyStatusMessageInProfile (Off-Campus)', 'Test Cases/MergeUserInTheSameVisitAndVerifyStatusMessageInProfile (Off-Campus)',  null), new TestCaseBinding('Test Cases/Pre-fillVisitTypeAfterCreatingNewVisitType (Daily Visit)', 'Test Cases/Pre-fillVisitTypeAfterCreatingNewVisitType (Daily Visit)',  null), new TestCaseBinding('Test Cases/Pre-fillVisitTypeAfterCreatingNewVisitType( Event)', 'Test Cases/Pre-fillVisitTypeAfterCreatingNewVisitType( Event)',  null), new TestCaseBinding('Test Cases/Pre-fillVisitTypeAfterCreatingNewVisitType(Off-Campus)', 'Test Cases/Pre-fillVisitTypeAfterCreatingNewVisitType(Off-Campus)',  null), new TestCaseBinding('Test Cases/DeletedVisitTypesShouldNotShowInVisitTypeFilter', 'Test Cases/DeletedVisitTypesShouldNotShowInVisitTypeFilter',  null), new TestCaseBinding('Test Cases/EditNumberOfAttendeesInUserProfileTest', 'Test Cases/EditNumberOfAttendeesInUserProfileTest',  null), new TestCaseBinding('Test Cases/EmptyStateVerificatioInCheckInPage', 'Test Cases/EmptyStateVerificatioInCheckInPage',  null), new TestCaseBinding('Test Cases/GlobalSearchTest', 'Test Cases/GlobalSearchTest',  null), new TestCaseBinding('Test Cases/Mobi-MobileNumberValidationTestForInternationalNumber (Daily Visits)', 'Test Cases/Mobi-MobileNumberValidationTestForInternationalNumber (Daily Visits)',  null), new TestCaseBinding('Test Cases/Mobi-MobileNumberValidationTestForInternationalNumber (Events)', 'Test Cases/Mobi-MobileNumberValidationTestForInternationalNumber (Events)',  null), new TestCaseBinding('Test Cases/Mobi-MobileNumberValidationTestForInternationalNumber (Off-Campus)', 'Test Cases/Mobi-MobileNumberValidationTestForInternationalNumber (Off-Campus)',  null), new TestCaseBinding('Test Cases/RegisteredGroupCountVerificationOnVisitCard', 'Test Cases/RegisteredGroupCountVerificationOnVisitCard',  null), new TestCaseBinding('Test Cases/RegisteredIndividualsAndCombinationOfGroupAndIndividualRegistrantsCountVerificaitonOnTheVisitCard', 'Test Cases/RegisteredIndividualsAndCombinationOfGroupAndIndividualRegistrantsCountVerificaitonOnTheVisitCard',  null), new TestCaseBinding('Test Cases/SearchVisitTypeWithUpperCaseLettersTestInQuestions', 'Test Cases/SearchVisitTypeWithUpperCaseLettersTestInQuestions',  null), new TestCaseBinding('Test Cases/Surveys -Student App Tests/Survey404PageVerification', 'Test Cases/Surveys -Student App Tests/Survey404PageVerification',  null), new TestCaseBinding('Test Cases/VerifyAccessiblityNeedQuestionShouldNotHaveButtonToEnableOrDisableIt', 'Test Cases/VerifyAccessiblityNeedQuestionShouldNotHaveButtonToEnableOrDisableIt',  null), new TestCaseBinding('Test Cases/VisitRegistrationStatusesVerificationInUserProfile', 'Test Cases/VisitRegistrationStatusesVerificationInUserProfile',  null), new TestCaseBinding('Test Cases/WhileCreatingDailyVisitValidationErrorShouldBeShownIfUserNotSelectsAtleastOneDay', 'Test Cases/WhileCreatingDailyVisitValidationErrorShouldBeShownIfUserNotSelectsAtleastOneDay',  null), new TestCaseBinding('Test Cases/EnableAndDisableAdminDigestEmailsTest', 'Test Cases/EnableAndDisableAdminDigestEmailsTest',  null), new TestCaseBinding('Test Cases/DraftedAndCanceledVisitsShouldNotShowInCheckInPage', 'Test Cases/DraftedAndCanceledVisitsShouldNotShowInCheckInPage',  null), new TestCaseBinding('Test Cases/AccessibilityNeedLabelVerification(Daily Visit)', 'Test Cases/AccessibilityNeedLabelVerification(Daily Visit)',  null), new TestCaseBinding('Test Cases/AccessibilityNeedLabelVerification(Event)', 'Test Cases/AccessibilityNeedLabelVerification(Event)',  null), new TestCaseBinding('Test Cases/AccessibilityNeedLabelVerification(Off-Campus)', 'Test Cases/AccessibilityNeedLabelVerification(Off-Campus)',  null), new TestCaseBinding('Test Cases/Login and Logout/Logout', 'Test Cases/Login and Logout/Logout',  null), new TestCaseBinding('Test Cases/CloseBrowser', 'Test Cases/CloseBrowser',  null)])
