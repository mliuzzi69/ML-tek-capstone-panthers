package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//p[text()='Show Details']")
	public WebElement showDetails;
	
	@FindBy(xpath = "//p[text()='Hide Details']")
	public WebElement hideDetails;
	
	@FindBy(id = "cancelBtn")
	public WebElement cancelTheOrderBtn;
	
	@FindBy(id = "reasonInput")
	public WebElement cancelationReason;
	
	@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
	public WebElement yourOrderHasBeenCanceledMessage;
	
	@FindBy(id = "orderSubmitBtn")
	public WebElement cancelOrder;
	
	@FindBy(id = "returnBtn")
	public WebElement returnItemsBtn;
	
	@FindBy(id = "buyAgainBtn")
	public WebElement buyAgainBtn;
	
	@FindBy(id = "dropOffInput")
	public WebElement dropOffInput;
	
	@FindBy(xpath = "//p[text()='Return was successfull']")
	public WebElement yourOrderHasBeenReturnedMessage;
	
	@FindBy(id = "reviewBtn")
	public WebElement reviewBtn;
	
	@FindBy(id = "headlineInput")
	public WebElement headlineText;
	
	@FindBy(id = "descriptionInput" )
	public WebElement reviewTextInput;
	
	@FindBy(id = "reviewSubmitBtn")
	public WebElement addYourReviewBtn;
	
	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement yourReviewWasAddedSuccessfully;
	
}
