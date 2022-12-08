package tek.sdet.framework.steps;

import java.util.List;
import org.junit.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;


public class HomeSteps extends CommonUtility{

	POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
	String expectedTitle = "React App";
	String actualTitle = getTitle();
	Assert.assertEquals(expectedTitle, actualTitle);
	logger.info(actualTitle +" is equal to "+ expectedTitle);
	}

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allElement);
		logger.info("User clicked on All element");
	}
		
	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable data) {
		List<List<String>> sidebarInformation = data.asLists(String.class);
		Assert.assertTrue(isElementDisplayed(factory.homePage().shopByDepartment));
	    Assert.assertTrue(isElementDisplayed(factory.homePage().electronicsOption));
	    Assert.assertTrue(isElementDisplayed(factory.homePage().computersOption));
	    Assert.assertTrue(isElementDisplayed(factory.homePage().smartHomeOption));
	    Assert.assertTrue(isElementDisplayed(factory.homePage().sportsOption));
	    Assert.assertTrue(isElementDisplayed(factory.homePage().automotiveOption));
	    logger.info("Options on Shop by Department sidebar are present");
	    slowDown();
	}
	
// ************ @DepartmentSidebarOptionTest ******
	
	@And("User on {string}")
	public void userOn(String dptValue) {
		slowDown();
		switch(dptValue){
			case "Electronics":
				HighlightElement(factory.homePage().electronicsOption);
				click(factory.homePage().electronicsOption);
				Assert.assertTrue(isElementDisplayed(factory.homePage().tvAndVideoOption));
			    Assert.assertTrue(isElementDisplayed(factory.homePage().videoGamesOpton));
				slowDown();
				click(factory.homePage().mainMenuBtn);
				logger.info("User is on department: " + dptValue);
				break;
			case "Computers":
				HighlightElement(factory.homePage().computersOption);
				click(factory.homePage().computersOption);
				Assert.assertTrue(isElementDisplayed(factory.homePage().accessories));
			    Assert.assertTrue(isElementDisplayed(factory.homePage().networking));
				slowDown();
				click(factory.homePage().mainMenuBtn);
				logger.info("User is on department: " + dptValue);
				break;
			case "SmartHome":
				HighlightElement(factory.homePage().smartHomeOption);
				click(factory.homePage().smartHomeOption);
				Assert.assertTrue(isElementDisplayed(factory.homePage().smartHomeLightning));
			    Assert.assertTrue(isElementDisplayed(factory.homePage().plugsAndOutlets));
				slowDown();
				click(factory.homePage().mainMenuBtn);
				logger.info("User is on department: " + dptValue);
				break;
			case "Sports":
				HighlightElement(factory.homePage().sportsOption);
				click(factory.homePage().sportsOption);
				Assert.assertTrue(isElementDisplayed(factory.homePage().athleticClothing));
			    Assert.assertTrue(isElementDisplayed(factory.homePage().exerciseAndFitness));
				slowDown();
				click(factory.homePage().mainMenuBtn);
				logger.info("User is on department: " + dptValue);
				break;
			case "Automotive":
				HighlightElement(factory.homePage().automotiveOption);
				click(factory.homePage().automotiveOption);
				Assert.assertTrue(isElementDisplayed(factory.homePage().autoPartsAndAccessories));
			    Assert.assertTrue(isElementDisplayed(factory.homePage().motorCycleAndPowersports));
				slowDown();
				click(factory.homePage().mainMenuBtn);
				logger.info("User is on department: " + dptValue);
				break;
		}
	}
	
	@Then("below options are present in department")
	public void belowOptionsArePresetInDepartment(DataTable data) {
		logger.info("All the option are present on the Departments");
	}

//****** Scenario: Verify User can add an item to cart *****************
	
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String string) {
	    click(factory.homePage().homeCategory);
	    logger.info("User changed category to: " + string);
	    slowDown();
	}
	
	@When("User search for an item {string}")
	public void userSearchForAnItem(String item) {
	    click(factory.homePage().searchInputField);
	    sendText(factory.homePage().searchInputField, item);
	    logger.info("User entered " + item);
	    slowDown();
	}
		
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
	    click(factory.homePage().searchButton);
	    logger.info("User clicked on Search icon");
	    slowDown();
	}
	
	@When("User click on item")
	public void userClickOnItem() {
	    click(factory.homePage().productLayout);
	    logger.info("User clicked on the item");
	    slowDown();
	}
	
	@When("User select quantity {string}")
	public void userSelectQuantity(String qty) {
		sendText(factory.homePage().qtyItem, qty);
		logger.info("User select the quantity");
		slowDown();
	}
	
	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.homePage().addToCartBtn);
		logger.info("User clicked Add to Cart button");
		slowDown();
	}
	
	@Then("the cart icon quantity should be change to {string}")
	public void theCartIconQuantityShouldBeChangeTo(String itemQty) {
	    String expectedValue = itemQty;
	    String actualValue = getText(factory.homePage().cartQtyAdded);
	    Assert.assertEquals(expectedValue, actualValue);
	    logger.info("Quantity is: " + itemQty);
	    slowDown();
	}

//*** Scenario: Verify User can place an order without Shipping address and payment Method on file *** 	
	
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
	    click(factory.homePage().cartBtn);
	    logger.info("User clicked on Cart option");
	}
	
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.homePage().proceedToCheckoutBtn);
		logger.info("User clicked on Proceed to Checkout button");
	}
	
	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
		click(factory.homePage().addAddressBtn);
		logger.info(factory);
	}
	
	@Then("User click Add a credit card or Debit card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
	    click(factory.homePage().addPaymentBtn);
	    logger.info("User clicked Add Credit or Debit Card button");
	}
	
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.homePage().placeOrderBtn);
		logger.info("User clicked on Place Your Order button");
	}
	
//********** Order steps
	
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.homePage().ordersSection);
		logger.info("User clicked on Orders section");
		slowDown();
	}
}


