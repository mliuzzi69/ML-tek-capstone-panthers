package tek.sdet.framework.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	@And("User click on first order in list") 
	public void userClickOnFirstOrderInList() {
			click(factory.orderPage().showDetails);
			logger.info("User clicked on first order in list");
			slowDown();
	}
	
	@And("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelTheOrderBtn);
		logger.info("User clicked on Cancel The Order button");
		slowDown();
	}
	
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String reason) {
		selectByVisibleText(factory.orderPage().cancelationReason, reason);
		logger.info("User Select Cancelation Reason as: " + reason);
	}
	
	@When("user click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelOrder);
		logger.info("User clicked on Cancel Order button");
		slowDown();
	}
	
//************ 	
	
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.orderPage().returnItemsBtn);
		logger.info("User clicked on Return Items button");
		slowDown();
	}
	
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String returnReason) {
		selectByVisibleText(factory.orderPage().cancelationReason, returnReason);
		logger.info("User Select Return Reason as: " + returnReason);
	    slowDown();
	}
	
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String dropOff) {
		selectByVisibleText(factory.orderPage().dropOffInput,dropOff );
		logger.info("User Select Where to Drop Off as: " + dropOff);
		slowDown();
	}
	
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().cancelOrder);
		logger.info("User clicked on Return Order button");
		slowDown();
	}
	
//***************
	
	@When("User click on Review button")
	public void userClickOnReviewButton() {
	    click(factory.orderPage().reviewBtn);
	    logger.info("User clicked on Review button");
	    slowDown();
	}
	
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String reviewHeadline, String reviewText) {
		sendText(factory.orderPage().headlineText, reviewHeadline);
		sendText(factory.orderPage().reviewTextInput, reviewText);
	    logger.info("User write a review");
	    slowDown();
	}
	
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().addYourReviewBtn);
		logger.info("User clicked on Add Your Review button");
		slowDown();
	}
	
}