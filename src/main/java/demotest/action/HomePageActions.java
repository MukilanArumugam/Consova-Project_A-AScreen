package demotest.action;

import commonpage.toolbox.Element;
import commonpage.toolbox.Textbox;
import commonpage.util.TestdataConstants;
import demotest.Repository.HomePageUI;
import jdk.nashorn.internal.ir.IfNode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageActions extends HomePageUI {
    public HomePageActions(WebDriver driver) {
        super(driver);
    }


    public boolean verifyHomePage() {
        Boolean isVerified = false;
        if (lblHomePage.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifySetupMenu() {
        Boolean isVerified = false;
        if (lblSetUpMenu.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyHeaderInLeftPane(String strValue) {
        System.out.println("pass");
        Boolean isVerified = false;
        System.out.println("pass");
        WebElement ele = driver.findElement(By.xpath(strLeftPaneHeaderLocator.replace("<<REPLACE>>", strValue)));
        if (ele.isDisplayed()) {
            System.out.println("actual value" + ele);
            isVerified = true;
        }
        return isVerified;
    }

    /**
     * Created by Ganesh babu
     *
     * @return
     */
    public boolean clickLogoutBtn() {
        Boolean isClicked = false;
        if (iconLogout.isDisplayed()) {
            isClicked = Element.click(driver, iconLogout);
        }
        return isClicked;


    }

    public boolean verifyInboxwidget() {
        Boolean isVerified = false;
        if (lblInbox.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickMyAccountMenu() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleMyAccount);
        return isClicked;
    }

    public boolean clickProviderInboxMenu() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleProviderInbox);
        return isClicked;
    }

    public boolean clickPatientInboxMenu() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, elePatientInbox);
        return isClicked;
    }

    public boolean clickCalenderMenu() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleCalender);
        return isClicked;
    }

    public boolean clickJournalMenu() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleJournal);
        return isClicked;
    }

    public boolean clickPracticeMenu() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, elePractice);
        return isClicked;
    }

    public boolean clickDownloadsMenu() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleDownloads);
        return isClicked;
    }

    public boolean clickClinicalMenu() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleClinicalMenu);
        return isClicked;
    }

    public boolean clickSetupMenu() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleSetupMenu);
        return isClicked;
    }

    public boolean clickAppointmentinbox() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleAppointmentinbox);
        return isClicked;
    }

    public boolean clickSetupEservices() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleSetupeService);
        return isClicked;
    }

    public boolean clickGroupMail() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleGroupMail);
        return isClicked;
    }

    public boolean clickSetupEserviceIcon()
    {
        Boolean isClicked=false;
        System.out.println("Methos entry");
        System.out.println("LOCATOR" + btnAddEsevices.isDisplayed());
        isClicked = Element.click(driver, btnAddEsevices);
        return isClicked;
    }

    public boolean clickMyPractice() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleMyPractice);
        return isClicked;
    }

    public boolean ClickSaveEntryJournal() {
        boolean isClicked = false;
        if (BtnSaveEntryJaurnal.isDisplayed()){
            isClicked = Element.click(driver, BtnSaveEntryJaurnal);
            isClicked = true;
        }
        else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean VerifyTheRequiredErrorDisplaysJournalWindow() {
        boolean isVerify = false;
        if (lblRequiredErrorSubjectTxtBox.isDisplayed()){
            isVerify = true;
        }
        else {
            isVerify = false;
        }
        return isVerify;
    }

    public boolean ClickEditBtnViewJournal() {
        boolean isClicked = false;
        if (BtnEditViewJournal.isDisplayed()){
            isClicked = Element.click(driver, BtnEditViewJournal);
            isClicked = true;
        }
        else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean VerifyTheWarningDisplaysAfterClearInJournal() {
        boolean isVerify = false;
        if (lblRequiredErrorEditSubjectTxtBox.isDisplayed()){
            isVerify = true;
        }
        else {
            isVerify = false;
        }
        return isVerify;
    }

    public boolean ClickStaffTabPracticePage() {
        boolean isClicked = false;
        if (BtnStaffTabPracticePage.isDisplayed()){
            isClicked = Element.click(driver, BtnStaffTabPracticePage);
            isClicked = true;
        }
        else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean EnterInValidStaffinTheTxtBox(String StrStaffTxt) {
        boolean isEntered = false;
        if (txtBoxUserNameStafftabPracticePage.isDisplayed()){
            isEntered = Textbox.enterValue(driver, txtBoxUserNameStafftabPracticePage, StrStaffTxt);
            isEntered = true;
        }
        else {
            isEntered = false;
        }
        return isEntered;
    }

    public boolean ClickSearchButtonStaffTabPracticePage() {
        boolean isClicked = false;
        if (BtnSearchStaffTabPracticePage.isDisplayed()){
            isClicked = Element.click(driver, BtnSearchStaffTabPracticePage);
            isClicked = true;
        }
        else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean VerifyTheNoRecordAvailablemessageinStaffTabPracticePage() {
        boolean isVerify = false;
        if (CaptionNoRecordAvailableStafftabPracticepage.isDisplayed()){
            isVerify = true;
        }
        else {
            isVerify = false;
        }
        return isVerify;
    }

    public boolean ClickMaplocationrolelinkpracticepage() {
        boolean isClicked = false;
        if (BtnMapLocationRolePracticePage.isDisplayed()){
            isClicked = Element.click(driver, BtnMapLocationRolePracticePage);
            isClicked = true;
        }
        else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean ClickUpateBtnMapLocation() {
        boolean isClicked = false;
        if (BtnUpdateMapLocationRole.isDisplayed()){
            isClicked = Element.click(driver, BtnUpdateMapLocationRole);
            isClicked = true;
        }
        else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean ClickCancelMapLocation() {
        boolean isClicked = false;
        if (BtnCancelMapLocation.isDisplayed()){
            isClicked = Element.click(driver, BtnCancelMapLocation);
            isClicked = true;
        }
        else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean ClickSearchUserLick() {
        boolean isClicked = false;
        if (BtnSearchUserMainMenu.isDisplayed()){
            isClicked = Element.click(driver, BtnSearchUserMainMenu);
            isClicked = true;
        }
        else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean EnterInvalidPatientInTheNameTxtBox(String StrStaffTxt) {
        boolean isEntered = false;
        if (TxtBoxNameSearchPatient.isDisplayed()){
            isEntered = Textbox.enterValue(driver, TxtBoxNameSearchPatient, StrStaffTxt);
            isEntered = true;
        }
        else {
            isEntered = false;
        }
        return isEntered;
    }

    public boolean ClickSearchBtnSearchPatient() {
        boolean isClicked = false;
        if (BtnSearchPatientPage.isDisplayed()){
            isClicked = Element.click(driver, BtnSearchPatientPage);
            isClicked = true;
        }
        else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean VerifyTheNopatientfoundisplays() {
        boolean isVerify = false;
        if (WarningnoPatientFoundSearchPatient.isDisplayed()){
            isVerify = true;
        }
        else {
            isVerify = false;
        }
        return isVerify;
    }

    public boolean ClickFirstNameRadioBtnSearchAptient() {
        boolean isClicked = false;
        if (BtnfirstnamelastnameSearchpatient.isDisplayed()){
            isClicked = Element.click(driver, BtnfirstnamelastnameSearchpatient);
            isClicked = true;
        }
        else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean ClickLastNameRadioBtnSearchAptient() {
        boolean isClicked = false;
        if (BtnlastnamefirstnameSearchpatient.isDisplayed()){
            isClicked = Element.click(driver, BtnlastnamefirstnameSearchpatient);
            isClicked = true;
        }
        else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean VerifyTheTextDisplaysinPAtientSearchtxtBox() {
        boolean isVerify = false;
        System.out.println("before GetText");
        String StrPatientName = TxtBoxNameSearchPatient.getText();
        System.out.println("Show Value"+StrPatientName);
        if (StrPatientName.equals(TestdataConstants.SEARCHPATIENT)){
            isVerify = true;
        }
        else {
            isVerify = false;
        }
        return isVerify;
    }

    public boolean ClickClearButtonSearchPatient() {
        boolean isClicked = false;
        if (BtnClearSearchPatient.isDisplayed()){
            isClicked = Element.click(driver, BtnClearSearchPatient);
            isClicked = true;
        }
        else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean VerifyTheTextGotClearedFromTheSearchPatientTxtBox() {
        boolean isVerify = false;
        String StrPatientName = TxtBoxNameSearchPatient.getText();
        if (StrPatientName.isEmpty()){
            isVerify = true;
        }
        else {
            isVerify = false;
        }
        return isVerify;
    }

    public boolean ClickAutoSuggestButtonSearchpatient() {
        boolean isClicked = false;
        if (BtnAutoSuggestSearchPatient.isDisplayed()){
            isClicked = Element.click(driver, BtnAutoSuggestSearchPatient);
            isClicked = true;
        }
        else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean VerifyTheSuggesstionListNotDisplays() {
        boolean isVerify = false;
        if (TxtBoxNameSearchPatient.isEnabled())
        {
            isVerify = true;
        }
        else{
            isVerify = false;
        }
        return isVerify;
    }
}
