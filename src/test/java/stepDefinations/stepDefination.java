package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import resources.base;
import woolies.accountCreation;
import woolies.shopPageObject;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;

@RunWith(Cucumber.class)
public class stepDefination extends base {

	@Given("^User is on shopping portal landing page$")
	public void user_is_on_shopping_portal_landing_page() throws Throwable {

		driver = initializeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}

	@And("^User select item from homepage featured items$")
	public void user_select_item_from_homepage_featured_items() throws Throwable {

		shopPageObject prodContainer = new shopPageObject(driver);
		prodContainer.moveToElementProd1(driver);
		prodContainer.addProd().click();
		Assert.assertTrue(prodContainer.addProd().isDisplayed());
	}

	@And("^User selects continue shopping$")
	public void user_selects_continue_shopping() throws Throwable {

		shopPageObject prodContainer = new shopPageObject(driver);
		prodContainer.contShop().click();
		Assert.assertTrue(prodContainer.contShop().isDisplayed());

	}

	@And("^User select second item from homepage featured items$")
	public void user_select_second_item_from_homepage_featured_items() throws Throwable {
		shopPageObject prodContainer = new shopPageObject(driver);
		prodContainer.moveToElementProd2(driver);
		prodContainer.addProd2().click();
		Assert.assertTrue(prodContainer.addProd2().isDisplayed());

	}

	@And("^User select proceed to checkout$")
	public void user_select_proceed_to_checkout() throws Throwable {
		shopPageObject prodContainer = new shopPageObject(driver);
		prodContainer.proceedCheckoutLayer().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertTrue(prodContainer.proceedCheckoutLayer().isDisplayed());
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		prodContainer.proceedCheckoutFinal().click();
		Assert.assertTrue(prodContainer.proceedCheckoutFinal().isDisplayed());

	}

	@And("^User provide email address in create new account section$")
	public void user_provide_email_address_in_create_new_account_section() throws Throwable {
		accountCreation accountCreate = new accountCreation(driver);

		String userName = "" + (int) (Math.random() * Integer.MAX_VALUE);
		String emailID = "User" + userName + "@example.com";

		accountCreate.email().sendKeys(emailID);
		Assert.assertTrue(accountCreate.email().isDisplayed());
	}

	@And("^User provide all required information and click submit to register$")
	public void user_provide_all_required_information_and_click_submit_to_register() throws Throwable {
		
		accountCreation accountCreate = new accountCreation(driver);
		accountCreate.submitCreate().click();
		Assert.assertTrue(accountCreate.submitCreate().isDisplayed());
		accountCreate.title().click();
		Assert.assertTrue(accountCreate.title().isDisplayed());
		accountCreate.firstName().sendKeys("Shoaib");
		Assert.assertTrue(accountCreate.firstName().isDisplayed());
		accountCreate.lastName().sendKeys("Rehman");
		Assert.assertTrue(accountCreate.lastName().isDisplayed());
		accountCreate.password().sendKeys("Testuser123");
		Assert.assertTrue(accountCreate.password().isDisplayed());
		accountCreate.days().selectByValue("3");
		accountCreate.month().selectByValue("3");
		accountCreate.year().selectByValue("1982");
		accountCreate.address().sendKeys("5 Byron Ave, Bondi Junction");
		Assert.assertTrue(accountCreate.address().isDisplayed());
		accountCreate.city().sendKeys("Sydney");
		Assert.assertTrue(accountCreate.city().isDisplayed());
		accountCreate.state().selectByValue("4");
		accountCreate.postcode().sendKeys("25203");
		Assert.assertTrue(accountCreate.postcode().isDisplayed());
		accountCreate.country().selectByValue("21");
		accountCreate.mobile().sendKeys("2002054521");
		Assert.assertTrue(accountCreate.mobile().isDisplayed());
		accountCreate.register().click();
		Assert.assertTrue(accountCreate.register().isDisplayed());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		accountCreate.ProceedtoCheckout().click();
		Assert.assertTrue(accountCreate.ProceedtoCheckout().isDisplayed());
		accountCreate.acceptCB().click();
		Assert.assertTrue(accountCreate.acceptCB().isDisplayed());
		accountCreate.ProceedtoCheckoutFinal().click();
		Assert.assertTrue(accountCreate.ProceedtoCheckoutFinal().isDisplayed());
		accountCreate.paymentMethodSelect().click();
		Assert.assertTrue(accountCreate.paymentMethodSelect().isDisplayed());
	
	}

	@Then("^User lands on order confirmation page and agrees before placing order$")
	public void user_lands_on_order_confirmation_page_and_agrees_before_placing_order() throws Throwable {
		accountCreation accountCreate = new accountCreation(driver);
		Assert.assertTrue(accountCreate.acceptCB().isDisplayed());
		accountCreate.ProceedtoCheckoutFinal().click();
		Assert.assertTrue(accountCreate.ProceedtoCheckoutFinal().isDisplayed());
		accountCreate.paymentMethodSelect().click();
		Assert.assertTrue(accountCreate.paymentMethodSelect().isDisplayed());
	}

	@And("^User place order by clicking confirm order$")
	public void user_place_order_by_clicking_confirm_order() throws Throwable {
		accountCreation accountCreate = new accountCreation(driver);
		accountCreate.confirmOrder().click();
		Assert.assertTrue(accountCreate.confirmOrder().isDisplayed());	
		driver.close();	
	}

}