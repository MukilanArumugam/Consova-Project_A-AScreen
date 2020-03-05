package demotest.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SetupPageUI {

    protected final WebDriver driver;

    public SetupPageUI(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_ServiceType1_btnAdd']/img")
    protected WebElement btnAddEsevices;

    @FindBy(how = How.XPATH, using = "//select[@id='ctl01_MainContent_ServiceType1_ServiceTypeAdd1_ddlPractice']")
    protected WebElement ddbHealthCentre;

    @FindBy(how = How.XPATH, using = "//select[@id='ctl01_MainContent_ServiceType1_ServiceTypeAdd1_ddlServiceAdd']")
    protected WebElement ddbServiceCategory;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ServiceType1_ServiceTypeAdd1_txtServiceAdd']")
    protected WebElement txtServiceName;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ServiceType1_ServiceTypeAdd1_txtServiceCodeAdd']")
    protected WebElement txtServiceCode;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ServiceType1_ServiceTypeAdd1_chkRoles_0']")
    protected WebElement chkBoxPatient;

    @FindBy(how = How.XPATH, using = "//select[@id='ctl01_MainContent_ServiceType1_ServiceTypeAdd1_rptRecipient_ctl01_ddlRoles']")
    protected WebElement ddbRecipientRole;

    @FindBy(how = How.XPATH, using = "//select[@id='ctl01_MainContent_ServiceType1_ServiceTypeAdd1_rptRecipient_ctl01_ddlToUsersAdd']")
    protected WebElement ddbRecipient;

    @FindBy(how = How.XPATH, using = "//textarea[@id='ctl01_MainContent_ServiceType1_ServiceTypeAdd1_txtDescAdd']")
    protected WebElement txtDescription;

    @FindBy(how = How.XPATH, using = "//textarea[@id='ctl01_MainContent_ServiceType1_ServiceTypeAdd1_txtTermsAdd']")
    protected WebElement txtTerms;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Service Type Status Settings')]")
    protected WebElement lblServiceTypeStatusSettings;

    protected String lblSelectedService = new StringBuilder("//label[contains(text(),'")
            .append("<<REPLACE>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Settings')]")
    protected WebElement BtnSettingsMyPractice;

    @FindBy(how = How.XPATH, using = "//input[@value='Edit']")
    protected WebElement BtnEditMyPractice;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$PracticeSettings1$ListView1$ctrl0$txtRecallReminder']")
    protected WebElement TxtBoxDaysPracticeSettings;

    @FindBy(how = How.XPATH, using = "//input[@value='Update']")
    protected WebElement BtnUpdatePracticeSettings;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$PracticeSettings1$ListView1$ctrl0$txtRecallReminder']/following-sibling::span[contains(text(),'* Required')]")
    protected WebElement lblRequiredWarningPracticeSettings;

//Eservice Details
@FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ServiceType1_ServiceTypeAdd1_btnSave']")
protected WebElement btnSaveEService;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Practice Details')]")
    protected WebElement lblPracticeDetails;

    protected String StrSetupCreatedRecordEService = new StringBuilder("//td[@class='ob_gCW ob_gC_Fc']//div[@class='ob_gCc1']//div[contains(text(),'")
            .append("<<REPLACE>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH, using = "//input[@value='Cancel']")
    protected WebElement BtnCancelEServiceMenu;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Show Active')]")
    protected WebElement lblShowActiveEService;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Service Type Updated Successfully.')]")
    protected WebElement lblSuccessMessageEService;

    @FindBy(how = How.XPATH, using = "//input[@value='Return to e-Services']")
    protected WebElement BtnReturnEService;

    protected String BtnEditESerivice = new StringBuilder("//div[contains(text(),'")
            .append("<<REPLACE>>")
            .append("')]/following::td[@class='ob_gC']//div[@class='ob_gCc2C']//a[contains(@id,'grid_link_Add')]").toString();

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ServiceType1_ServiceTypeEdit1_txtService']")
    protected WebElement txtServiceNameEdit;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ServiceType1_ServiceTypeEdit1_btnSave']")
    protected WebElement btnEditSaveEService;

    protected String BtnStatusEService = new StringBuilder("//div[contains(text(),'")
            .append("<<REPLACE>>")
            .append("')]/following::td[@class='ob_gC ob_gC_Lc']//div[@class='ob_gCc1']//a[contains(text(),'Active')]").toString();

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Setup e-Services')]")
    protected WebElement lblSetupEservices;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Health Centre :')]")
    protected WebElement lblHealthCentreEservices;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Service Category :')]")
    protected WebElement lblServiceCategoryEservices;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Service Name :')]")
    protected WebElement lblServiceNameEservices;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Service Code :')]")
    protected WebElement lblServiceCodeEservices;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Recipient  ')]")
    protected WebElement lblRecipientEservices;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Applies to :')]")
    protected WebElement lblAppliesToEservices;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Description :')]")
    protected WebElement lblDescriptionEservices;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Payment Option :')]")
    protected WebElement lblPaymentOptionEservices;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Terms :')]")
    protected WebElement lblTermsEservices;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Message Sent Successfully.')]")
    protected WebElement lblSuccessMessageEservices;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sent Message')]")
    protected WebElement btnSentTabEservices;
//Group Mail

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_Sent1_grdInbox_ob_grdInboxBodyContainer_ob_grdInbox_R_0_ctl08_ctl00_lnkbtnDetails']")
    protected WebElement BtnCreatedSubjectGroupMessage;

    @FindBy(how = How.XPATH, using = "//span[text()='From']")
    protected WebElement lblFromGroupMessage;

    @FindBy(how = How.XPATH, using = "//span[text()='Date']")
    protected WebElement lblDateGroupMessage;

    @FindBy(how = How.XPATH, using = "//span[text()='Message']")
    protected WebElement lblMessageGroupMessage;

    @FindBy(how = How.XPATH, using = "//span[text()='To']")
    protected WebElement lblToGroupMessage;

    @FindBy(how = How.XPATH, using = "//span[text()='Subject']")
    protected WebElement lblSubjectGroupMessage;

    @FindBy(how = How.XPATH, using = "//a[text()='Compose Group Message']")
    protected WebElement BtnComposeGroupMessage;

    @FindBy(how = How.XPATH, using = "//a[text()='Next']")
    protected WebElement BtnNextGroupMessage;

    @FindBy(how = How.XPATH, using = "//a[text()='Back to Sent Message']")
    protected WebElement BtnBackGroupMessage;

//My Practice Details
    @FindBy(how = How.XPATH, using = "//span[@id='ctl01_MainContent_PracticeDetails1_PracticeLocationListView_ctrl0_lblLocationName']")
    protected WebElement lblLocation1MyPractice;

    @FindBy(how = How.XPATH, using = "//span[@id='ctl01_MainContent_PracticeDetails1_PracticeLocationListView_ctrl1_lblLocationName']")
    protected WebElement lblLocation2MyPractice;







}