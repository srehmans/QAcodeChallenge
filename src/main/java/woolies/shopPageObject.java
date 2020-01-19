package woolies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class shopPageObject {

	WebDriver driver;

	public shopPageObject(WebDriver driver) {

		this.driver = driver;
	}

	
	By product1 = By.className("product-container");
	By product2 = By.xpath("//*[@id=\"homefeatured\"]/li[2]/div");
	By additem1 = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]");
	By additem2 = By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[1]");
	By continueShopLayer = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span");
	By proceedCheckoutLayer = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
	By proceedCheckoutFinal = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");

	public void moveToElementProd1(WebDriver driver) {
		Actions act = new Actions(driver);
		this.driver = driver;
		act.moveToElement(this.driver.findElement(product1)).build().perform();

	}
	
	public void moveToElementProd2(WebDriver driver) {
		Actions act = new Actions(driver);
		this.driver = driver;
		act.moveToElement(this.driver.findElement(product2)).build().perform();

	}

	public WebElement addProd() {
		return lib.waitUntilElementLocated(driver, additem1, 10);
	}

	public WebElement contShop() {
		return lib.waitUntilElementLocated(driver, continueShopLayer, 30);
	}

	public WebElement addProd2() {
		return lib.waitUntilElementLocated(driver, additem2, 30);
	}

	public WebElement proceedCheckoutLayer() {
		return lib.waitUntilElementLocated(driver, proceedCheckoutLayer, 60);
	}

	public WebElement proceedCheckoutFinal() {
		return lib.waitUntilElementLocated(driver, proceedCheckoutFinal, 30);
	}

	public void moveToElementproceedCheckoutFinal(WebDriver driver) {

		Actions act = new Actions(driver);
		this.driver = driver;
		act.moveToElement(this.driver.findElement(proceedCheckoutFinal)).build().perform();

	}
}


