package demotest.stepdefinition;

import commonpage.toolbox.Alert;
import commonpage.util.Testdata;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demotest.util.ActionContainer;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import java.util.List;

import static org.junit.Assert.assertTrue;

public class AccountsPageSteps {
    private ActionContainer actionContainer;

    public AccountsPageSteps(ActionContainer actionContainer) {
        this.actionContainer = actionContainer;
    }


    @Then("^I should see My Account page$")
    public void iShouldSeeMyAccountPage() {
        assertTrue(actionContainer.accountsPageActions.verifyMyAccountPage());
    }

    @When("^I Click My Health Center tab in the My Account Page$")
    public void iClickMyHealthCenterTabInTheMyAccountPage() {
        assertTrue(actionContainer.accountsPageActions.clickMyHealthCentresTab());
    }

    @Then("^Administrative Staff is present in the My Health Center Tab$")
    public void administrativeStaffIsPresentInTheMyHealthCenterTab() {
        assertTrue(actionContainer.accountsPageActions.verifyClinicalStaffPresentasRole());
    }

    @When("^I click Access Information Tab$")
    public void iClickAccessInformationTab() {
        assertTrue(actionContainer.accountsPageActions.clickAccessInformationTab());
    }

    @Then("^Access Information tab opened$")
    public void accessInformationTabOpened() {
        assertTrue(actionContainer.accountsPageActions.verifyAccessInformationPage());
    }

    @When("^I click Emergency Contacts Tab$")
    public void iClickEmergencyContactsTab() {
        assertTrue(actionContainer.accountsPageActions.clickEmergencyContactsTab());

    }

    @Then("^Emergeny Contacts tab opened$")
    public void emergenyContactsTabOpened() {
        assertTrue(actionContainer.accountsPageActions.verifyEmergencyContactsPage());
    }

    @And("^click Add icon the Emergency contact Tab$")
    public void clickAddIconTheEmergencyContactTab() {
        assertTrue(actionContainer.accountsPageActions.clickAddEmergencyContacts());
    }


    @And("^Enter the required details in the Emergency contacts tab: (.*), (.*), (.*), (.*)$")
    public void enterTheRequiredDetailsInTheEmergencyContactsTabFirstNameMobilePhoneRelationshipLastName(String strFirstName, String strMobilePhone, String strRelationship, String strLastName) throws InterruptedException {
        assertTrue(actionContainer.accountsPageActions.enterFirstNameInAddEmergencyContacts(Testdata.getValue(strFirstName)));
        assertTrue(actionContainer.accountsPageActions.enterMobilePhoneInAddEmergencyContacts(Testdata.getValue(strMobilePhone)));
        assertTrue(actionContainer.accountsPageActions.enterRelationshipInAddEmergencyContacts(Testdata.getValue(strRelationship)));
        assertTrue(actionContainer.accountsPageActions.enterLastNameInAddEmergencyContacts(Testdata.getValue(strLastName)));
        assertTrue(actionContainer.accountsPageActions.clickSaveEmergencyContacts());
    }

    @Then("^I should see added emergency contacts in the Emergency Contacts tab$")
    public void iShouldSeeAddedEmergencyContactsInTheEmergencyContactsTab() {
        assertTrue(actionContainer.accountsPageActions.verifyEmergencyContactsAdded());
    }

    @And("^Delete the Emergency Contacts$")
    public void deleteTheEmergencyContacts() {
        assertTrue(actionContainer.accountsPageActions.clickDeleteEmergencyContacts());
        assertTrue(actionContainer.accountsPageActions.AcceptAlert());
    }

    @And("^I click Update Profile$")
    public void iClickUpdateProfile() {
        assertTrue(actionContainer.accountsPageActions.clickUpdateProfile());

    }

    @Then("^I see Update Profile page$")
    public void iSeeUpdateProfilePage() {
        assertTrue(actionContainer.accountsPageActions.verifyUpdateProfilePage());

    }


    @And("^I Change the Required Details(.*)$")
    public void iChangeTheRequiredDetailsMobilePhoneNumber(String strMobilePhoneEditProfileDetails) {
        assertTrue(actionContainer.accountsPageActions.enterMobilePhoneNumberInEditProfileDetails(Testdata.getValue(strMobilePhoneEditProfileDetails)));
    }

    @When("^I Click Update Profile button$")
    public void iClickUpdateProfileButton() {
        assertTrue(actionContainer.accountsPageActions.clickUpdateProfileButton());
    }

    @Then("^I should see updated profile details$")
    public void iShouldSeeUpdatedProfileDetails() {
        assertTrue(actionContainer.accountsPageActions.verifyUpdatedProfileDetails());
    }

    @And("^Remove the Updated profile details$")
    public void removeTheUpdatedProfileDetails() {
        assertTrue(actionContainer.accountsPageActions.clickUpdateProfile());
        assertTrue(actionContainer.accountsPageActions.clearMobilePhoneNumberInEditProfileDetails());
        assertTrue(actionContainer.accountsPageActions.clickUpdateProfileButton());
    }
    @And("^I click change password button$")
    public void iClickChangePasswordButton() {
        assertTrue(actionContainer.accountsPageActions.ClickChangePassword());

    }

    @And("^I Enter Invalid And Valid Password(.*), (.*),(.*)$")
    public void iEnterInvalidAndValidPassword(String StrCurrentPassword, String StrNewpassword, String StrConfirmNewPassword) {
        assertTrue(actionContainer.accountsPageActions.entercurrentpassword(Testdata.getValue(StrCurrentPassword)));
        assertTrue(actionContainer.accountsPageActions.enternewpassword(Testdata.getValue(StrNewpassword)));
        assertTrue(actionContainer.accountsPageActions.enterconfirmnewpassword(Testdata.getValue(StrConfirmNewPassword)));
    }


    @And("^I click button Change Password$")
    public void iClickButtonChangePassword() {
        assertTrue(actionContainer.accountsPageActions.ClickBtnChangePassword());
    }

    @And("^I Verify the error message displays$")
    public void iVerifyTheErrorMessageDisplays() {

        assertTrue(actionContainer.accountsPageActions.Verifytheerrortextdisplays());
    }

    @And("^I Verify the required format message displays$")
    public void iVerifyTheRequiredFormatMessageDisplays() {
        assertTrue(actionContainer.accountsPageActions.verifyrequiredformatdisplays());
    }

    @And("^I Verify the New and confirm password miss match$")
    public void iVerifyTheNewAndConfirmPasswordMissMatch() {
        assertTrue(actionContainer.accountsPageActions.VerifyConfirmAndNewPasswordMissmatch());
    }

    @Then("^I Click Change Photo button$")
    public void iClickChangePhotoButton() {
        assertTrue(actionContainer.accountsPageActions.ClickChangePhotoBtn());
    }

    @And("^I Click Choose File Button$")
    public void iClickChooseFileButton() {
        assertTrue(actionContainer.accountsPageActions.ClickChooseBtn());
    }

    @And("^I Click Verify button$")
    public void iClickVerifyButton() {
        assertTrue(actionContainer.accountsPageActions.ClickverifyBtn());
    }

    @And("^I Verify The Warning Displays$")
    public void iVerifyTheWarningDisplays() {
        assertTrue(actionContainer.accountsPageActions.VerifyTheWarningDisplays());
    }

    @And("^I Click Cancel Button And Verify It redirect To Profile Tab$")
    public void iClickCancelButtonAndVerifyItRedirectToProfileTab() {
        assertTrue(actionContainer.accountsPageActions.ClickCancelMyAccountMHC());
        assertTrue(actionContainer.accountsPageActions.VerifyThePageRedirectToProfileTab());
    }

    @And("^I Click Edit Button$")
    public void iClickEditButton(){
        assertTrue(actionContainer.accountsPageActions.ClickEditButton());
    }

    @And("^I Edit The Created Contact(.*)$")
    public void iEditTheCreatedContact(String strFirstName) throws InterruptedException {
        assertTrue(actionContainer.accountsPageActions.enterFirstNameEditedEmergencyContacts(Testdata.getValue(strFirstName)));
        assertTrue(actionContainer.accountsPageActions.clickSaveEditEmergencyContacts());
    }

    @And("^I Verify The Edited Text Got Saved$")
    public void iVerifyTheEditedTextGotSaved() {
        assertTrue(actionContainer.accountsPageActions.VerifyTheEditedTextGotSaved());
    }


    @And("^Click Cancel Button and Verify it redirect to Emergency Contacts tab$")
    public void clickCancelButtonAndVerifyItRedirectToEmergencyContactsTab() {
        assertTrue(actionContainer.accountsPageActions.ClickCancelEmergencyContacts());
        assertTrue(actionContainer.accountsPageActions.VerifyThePageRedirectToEmergencyContacts());
    }
}
