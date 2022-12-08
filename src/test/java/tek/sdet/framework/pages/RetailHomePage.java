package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//span[text()='All']") 
	public WebElement allElement;
	
	@FindBy(id="accountLink")
	public WebElement account;
	
	@FindBy(id="signinLink")
	public WebElement signIn;
	
	@FindBy(id = "sidebar")
	public WebElement sidebar;
	
	@FindBy(id = "contentHeader")
	public WebElement shopByDepartment;
	
	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronicsOption;
	
	@FindBy(xpath = "//span[text()='Computers']")
	public WebElement computersOption;
	
	@FindBy(xpath = "//span[text()='Smart Home']")
	public WebElement smartHomeOption;
	
	@FindBy(xpath = "//span[text()='Sports']")
	public WebElement sportsOption;
	
	@FindBy(xpath = "//span[text()='Automative']")
	public WebElement automotiveOption;
	
	@FindBy(id = "submenuBtn")
	public WebElement mainMenuBtn;
	
	@FindBy(xpath = "//span[text()='TV & Video']")
	public WebElement tvAndVideoOption;
	
	@FindBy(xpath = "//span[text()='Video Games']")
	public WebElement videoGamesOpton;
	
	@FindBy(xpath = "//span[text()='Accessories']")
	public WebElement accessories;
	
	@FindBy(xpath = "//span[text()='Networking']")
	public WebElement networking;
	
	@FindBy(xpath = "//span[text()='Smart Home Lightning']")
	public WebElement smartHomeLightning;
	
	@FindBy(xpath = "//span[text()='Plugs and Outlets']")
	public WebElement plugsAndOutlets;
	
	@FindBy(xpath = "//span[text()='Athletic Clothing']")
	public WebElement athleticClothing;
	
	@FindBy(xpath = "//span[text()='Exercise & Fitness']")
	public WebElement exerciseAndFitness;
	
	@FindBy(xpath = "//span[text()='Automative Parts & Accessories']")
	public WebElement autoPartsAndAccessories;
	
	@FindBy(xpath = "//span[text()='MotorCycle & Powersports']")
	public WebElement motorCycleAndPowersports;
	
	@FindBy(xpath = "//div[text()='sidebar_content-item']")
	public WebElement sidebarContent;
	
	@FindBy(xpath = "//img[@alt='Plugs and Outlets']")
	public WebElement homeCategory;
	
	@FindBy(id = "searchInput")
	public WebElement searchInputField;
	
	@FindBy(id = "searchBtn")
	public WebElement searchButton;
	
	@FindBy(xpath = "//img[@alt='Kasa Outdoor Smart Plug']")
	public WebElement kasaOutdoorSmartPlugItem;
	
	@FindBy(xpath = "//*[@id='root']/div[1]/div[1]/div[3]/div/div[1]/div[3]/div/div/select")
	public WebElement qtyItem;
	
	@FindBy(id = "addToCartBtn")
	public WebElement addToCartBtn;
	
	@FindBy(id = "cartQuantity")
	public WebElement cartQtyAdded;
	
	@FindBy(xpath = "//p[text()='Cart ']")
	public WebElement cartBtn;
	
	@FindBy(id = "proceedBtn")
	public WebElement proceedToCheckoutBtn;
	
	@FindBy(id = "addAddressBtn")
	public WebElement addAddressBtn;
	
	@FindBy(id = "addPaymentBtn")
	public WebElement addPaymentBtn;
	
	@FindBy(id = "placeOrderBtn")
	public WebElement placeOrderBtn;
	
	@FindBy(xpath = "//div[text()='Order Placed Successfully']")
	public WebElement orderPlacedSuccessfullyMessage;
	
	@FindBy(xpath = "//h1[text()='Your Shopping Cart is Empty']")
	public WebElement yourShoppingCartIsEmpty;
	
	@FindBy(xpath = "//img[@alt='Apex Legends - 1,000 Apex Coins']")
	public WebElement apexLegendsItem;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/img")
	public WebElement productLayout;
	
	@FindBy(id = "orderLink")
	public WebElement ordersSection;
	
}
