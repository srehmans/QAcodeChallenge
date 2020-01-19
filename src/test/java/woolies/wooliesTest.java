package woolies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import woolies.accountCreation;
import woolies.shopPageObject;


public class wooliesTest {

	String userName, emailID;
	
	@Test
	
	//NAMING NEEDS TO BE CHANGED FOR EASIER UNDERSTANDIBILITY
	public void addCartTest() {

		
		//TO-DO: MOVE THIS PART TO SETUP LIB AND RUN IT BEFORE THE TEST EXECUTION
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		shopPageObject prodContainer = new shopPageObject(driver);
		prodContainer.moveToElementProd1(driver);
		prodContainer.addProd().click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		prodContainer.contShop().click();

		prodContainer.moveToElementProd2(driver);
		prodContainer.addProd2().click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		prodContainer.proceedCheckoutLayer().click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		prodContainer.proceedCheckoutFinal().click();

		
		accountCreation accountCreate = new accountCreation(driver);
		
		//MOVE THIS TO LIBS
		userName = "" + (int) (Math.random() * Integer.MAX_VALUE);
		emailID = "User" + userName + "@example.com";
		
		accountCreate.email().sendKeys(emailID);
		Assert.assertTrue(accountCreate.email().isDisplayed());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		//TO-DO : Put this section in a loop to avoid repetition
		//SEND KEYS DATA SHOULD BE DATA DRIVEN. DATASET HAS TO BE CREATED 
		
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
		accountCreate.confirmOrder().click();
		
		
		
		
		
	}
}

//
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
//
//		driver.findElement(By.id("cgv")).click();
//
//		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();
//
//		driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
//
//		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
//
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//
//		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p/a")).click();
//
//		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
//
//	//	driver.close();
