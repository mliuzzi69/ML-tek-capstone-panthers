package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().account);
		logger.info("User clicked on Account option");
		slowDown();
	}
	
	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().name);
		clearTextUsingSendKeys(factory.accountPage().phone);
		sendText(factory.accountPage().name, nameValue);
		sendText(factory.accountPage().phone, phoneValue);
		logger.info("User Updated Name and Phone");
		slowDown();
	}

	@And("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().updateButton);
		logger.info("User clicked on Update button");
		slowDown();
	}
	
	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalInformationUpdateMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInformationUpdateMessage));
		logger.info("User Profile Information Updated Successfully");
	}
	
	@When("User enter below information")
	public void userEnterBelowInformation(DataTable data) {
	    List<Map<String, String>>passwordInformation = data.asMaps(String.class, String.class);
	    sendText(factory.accountPage().previousPassword, passwordInformation.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPassword, passwordInformation.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPassword, passwordInformation.get(0).get("confirmPassword"));
		logger.info("User entered new password information");
		slowDown();
	}
	
	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
	    click(factory.accountPage().changePassword);
	    logger.info("User clicked on Change Password button");
	    slowDown();
	}
	
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMessage) {
		if(expectedMessage.contains("Password")) {
			waitTillPresence(factory.accountPage().passwordUpdatedSuccessfullyMessage);
			Assert.assertEquals(expectedMessage, factory.accountPage().passwordUpdatedSuccessfullyMessage.getText());
		}else if(expectedMessage.contains("Payment Method added Sucessfully")) {
			waitTillPresence(factory.accountPage().paymentMethodAddedSuccessfullyMessage);
			Assert.assertEquals(expectedMessage, factory.accountPage().paymentMethodAddedSuccessfullyMessage.getText());
		}else if(expectedMessage.contains("Payment Method updated Successfully")) {
			waitTillPresence(factory.accountPage().paymentMethodUpdatedSuccessfullyMessage);
			Assert.assertEquals(expectedMessage, factory.accountPage().paymentMethodUpdatedSuccessfullyMessage.getText());
		}else if(expectedMessage.contains("Address Added Successfully")) {
			waitTillPresence(factory.accountPage().addressAddedSuccessfullyMessage);
			Assert.assertEquals(expectedMessage, factory.accountPage().addressAddedSuccessfullyMessage.getText());
		}else if(expectedMessage.contains("Address Updated Successfully")) {
			waitTillPresence(factory.accountPage().addressUpdatedSuccessfullyMessage);
			Assert.assertEquals(expectedMessage, factory.accountPage().addressUpdatedSuccessfullyMessage.getText());
		}else if(expectedMessage.contains("Order Placed Successfully")) {
			waitTillPresence(factory.homePage().orderPlacedSuccessfullyMessage);
			Assert.assertEquals(expectedMessage, factory.homePage().orderPlacedSuccessfullyMessage.getText());
		}else if(expectedMessage.contains("Your Order Has Been Cancelled")) {
			waitTillPresence(factory.orderPage().yourOrderHasBeenCanceledMessage);
			Assert.assertEquals(expectedMessage,factory.orderPage().yourOrderHasBeenCanceledMessage.getText());
		}else if(expectedMessage.contains("Return was successfull")) {
			waitTillPresence(factory.orderPage().yourOrderHasBeenReturnedMessage);
			Assert.assertEquals(expectedMessage,factory.orderPage().yourOrderHasBeenReturnedMessage.getText());
		}else if(expectedMessage.contains("Your review was added successfully")) {
			waitTillPresence(factory.orderPage().yourReviewWasAddedSuccessfully);
			Assert.assertEquals(expectedMessage,factory.orderPage().yourReviewWasAddedSuccessfully.getText());
		}
		logger.info(expectedMessage + " is displayed");
		slowDown();
	}
	
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().addPaymentMethodLink);
		logger.info("User clicked on Add a payment method link");
	}
	
	@When("User fill debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable data) {
		List<Map<String, String>>paymentInformation = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumber, paymentInformation.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCard, paymentInformation.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationYear, paymentInformation.get(0).get("expirationYear"));
		selectByVisibleText(factory.accountPage().expirationMonth, paymentInformation.get(0).get("expirationMonth"));
		sendText(factory.accountPage().securityCode, paymentInformation.get(0).get("securityCode"));
		logger.info("User fill the debit or credit card information");
		slowDown();
	}
	
	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
	    click(factory.accountPage().addYourCardBtn);
	    logger.info("User clicked on Add Your card button");
	}

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().cardAndAccounts);
		click(factory.accountPage().CardEditBtn);
		logger.info("user clicked on Edit option of card section");
		slowDown();
	}
	
	@When("User edit information with below data")
	public void userEditInformationWithBelowData(DataTable data) {
		List<Map<String, String>>paymentInformation = data.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().cardNumber);
		clearTextUsingSendKeys(factory.accountPage().nameOnCard);
		clearTextUsingSendKeys(factory.accountPage().expirationMonth);
		clearTextUsingSendKeys(factory.accountPage().expirationYear);
		clearTextUsingSendKeys(factory.accountPage().securityCode);
		slowDown();
		sendText(factory.accountPage().cardNumber, paymentInformation.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCard, paymentInformation.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationYear, paymentInformation.get(0).get("expirationYear"));
		selectByVisibleText(factory.accountPage().expirationMonth, paymentInformation.get(0).get("expirationMonth"));
		sendText(factory.accountPage().securityCode, paymentInformation.get(0).get("securityCode"));
		logger.info("User fill the debit or credit card information");
		slowDown();
	}
	
	@When("User click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().addYourCardBtn);
		logger.info("User clicked on Update Your Card button");
		slowDown();
	}
	
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().cardAndAccounts);
		slowDown();
		click(factory.accountPage().CardRemoveBtn);
		logger.info("user clicked on remove option of card section");
		slowDown();
	}
	
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		logger.info("Payment details removed Successfully");
	}
	
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().AddAddress);
		logger.info("User clicked on Add Address option");
	}
	
	@When("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable data) {
		List<Map<String, String>>addressInformation = data.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().country);
		clearTextUsingSendKeys(factory.accountPage().fullName);
		clearTextUsingSendKeys(factory.accountPage().phoneNumber);
		clearTextUsingSendKeys(factory.accountPage().streetAddress);
		clearTextUsingSendKeys(factory.accountPage().apt);
		clearTextUsingSendKeys(factory.accountPage().city);
		clearTextUsingSendKeys(factory.accountPage().state);
		clearTextUsingSendKeys(factory.accountPage().zipCode);
		slowDown();
		selectByVisibleText(factory.accountPage().country, addressInformation.get(0).get("country"));
		sendText(factory.accountPage().fullName, addressInformation.get(0).get("fullName"));
		sendText(factory.accountPage().phoneNumber, addressInformation.get(0).get("phoneNumber"));
		sendText(factory.accountPage().streetAddress, addressInformation.get(0).get("streetAddress"));
		sendText(factory.accountPage().apt, addressInformation.get(0).get("apt"));
		sendText(factory.accountPage().city, addressInformation.get(0).get("city"));
		selectByVisibleText(factory.accountPage().state, addressInformation.get(0).get("state"));
		sendText(factory.accountPage().zipCode, addressInformation.get(0).get("zipCode"));
		logger.info("User fill new address information");
		slowDown();
	}
	
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
	    click(factory.accountPage().AddYourAddreesBtn);
	    logger.info("User clicked on Add Your Address button");
	}
	
	@When("User click on edit address button")
	public void userClickOnEditAddressButton() {
	    click(factory.accountPage().editAddressBtn);
	    logger.info("User clicked on Edit address button");
	}
	
	@When("User click update Your Address option")
	public void userClickUpdateYourAddressOption() {
		click(factory.accountPage().AddYourAddreesBtn);
		logger.info("User clicked on Update Your Address button");
	}
	
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().removeAddressBtn);
		logger.info("User clicked on Remove Address button");
	}
	
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		logger.info("Address details removed Successfully");
	}

}
