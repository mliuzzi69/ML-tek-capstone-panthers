package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "nameInput")
	public WebElement name;
	
	@FindBy(id = "personalPhoneInput") 
	public WebElement phone;
	
	@FindBy(id = "emailInput")
	public WebElement email;
	
	@FindBy(xpath = "//button[text()='Update']")
	public WebElement updateButton;
	
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInformationUpdateMessage;
	
	@FindBy(id = "previousPasswordInput")
	public WebElement previousPassword;
		
	@FindBy(id = "newPasswordInput")
	public WebElement newPassword;
	
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPassword;
	
	@FindBy(id = "credentialsSubmitBtn")
	public WebElement changePassword;
	
	@FindBy(xpath = "//div[text()='Password Updated Successfully']")
	public WebElement passwordUpdatedSuccessfullyMessage;
	
	@FindBy(xpath = "//p[text()='Add a payment method']")
	public WebElement addPaymentMethodLink;
		
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumber;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCard;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonth;
	
	@FindBy(id = "expirationYearInput")
	public WebElement expirationYear;
	
	@FindBy(id = "securityCodeInput")
	public WebElement securityCode;
	
	@FindBy(id = "paymentSubmitBtn")
	public WebElement addYourCardBtn;
	
	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement paymentMethodAddedSuccessfullyMessage;
	
	@FindBy(xpath = "//p[@class='account__payment-sub-title']")
	public WebElement cardAndAccounts;
		
	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement CardEditBtn;
	
	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement paymentMethodUpdatedSuccessfullyMessage;
	
	@FindBy(xpath = "//button[text()='remove']")
	public WebElement CardRemoveBtn;
	
	@FindBy(xpath = "//div[@class='account__address-new']") 
	public WebElement AddAddress;
	
	@FindBy(id = "countryDropdown")
	public WebElement country;
	
	@FindBy(id = "fullNameInput")
	public WebElement fullName;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumber;
	
	@FindBy(id = "streetInput")
	public WebElement streetAddress;
	
	@FindBy(id = "apartmentInput")
	public WebElement apt;
	
	@FindBy(id = "cityInput")
	public WebElement city;
	
	@FindBy(xpath = "//*[@id=\"newForm\"]/div[5]/div[2]/div/div/select")
	public WebElement state;
	
	@FindBy(id = "zipCodeInput")
	public WebElement zipCode;
	
	@FindBy(id = "addressBtn")
	public WebElement AddYourAddreesBtn; 
	
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressAddedSuccessfullyMessage;
	
	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement editAddressBtn;
	
	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement addressUpdatedSuccessfullyMessage;
	
	@FindBy(xpath = "//button[text()='Remove']")
	public WebElement removeAddressBtn;
	
}
