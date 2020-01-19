package woolies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class accountCreation {

	WebDriver driver;

	public accountCreation(WebDriver driver) {

		this.driver = driver;
	}
// REPLACE with @Findby annotation
	By email = By.id("email_create");
	By createacntbutton = By.id("SubmitCreate");
	By gender = By.id("id_gender1");
	By firstname = By.id("customer_firstname");
	By lastname = By.id("customer_lastname");
	By password = By.id("passwd");
	By days = By.id("days");
	By month = By.id("months");
	By year = By.id("years");
	By address = By.id("address1");
	By city = By.id("city");
	By state = By.id("id_state");
	By postcode = By.id("postcode");
	By country = By.id("id_country");
	By mobile = By.id("phone_mobile");
	By register = By.id("submitAccount");
	By ProceedtoCheckout = By.xpath("//*[@id=\"center_column\"]/form/p/button");
	By acceptCB = By.id("cgv");
	By ProceedtoCheckoutFinal = By.xpath("//*[@id=\"form\"]/p/button");
	By paymentMethodSelect = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a");
	By confirmOrder = By.xpath("//*[@id=\"cart_navigation\"]/button");
	

	public WebElement email() {
		return driver.findElement(email);
	}

	public WebElement submitCreate() {
		return driver.findElement(createacntbutton);
	}

	public WebElement title() {

		return driver.findElement(gender);

	}

	public WebElement firstName() {

		return driver.findElement(firstname);

	}

	public WebElement lastName() {

		return driver.findElement(lastname);

	}

	public WebElement password() {

		return driver.findElement(password);

	}

	public Select days() {

		return new Select(driver.findElement(days));

	}

	public Select month() {

		return new Select(driver.findElement(month));

	}

	public Select year() {

		return new Select(driver.findElement(year));

	}

	public WebElement address() {

		return driver.findElement(address);

	}

	public WebElement city() {

		return driver.findElement(city);

	}

	public Select state() {

		return new Select(driver.findElement(state));

	}

	public WebElement postcode() {

		return driver.findElement(postcode);

	}

	public Select country() {

		return new Select(driver.findElement(country));

	}

	public WebElement mobile() {

		return driver.findElement(mobile);

	}

	public WebElement register() {

		return driver.findElement(register);

	}

	public WebElement ProceedtoCheckout() {

		return driver.findElement(ProceedtoCheckout);

	}
	
	public WebElement acceptCB() {

		return driver.findElement(acceptCB);

	}
	
	public WebElement ProceedtoCheckoutFinal() {

		return driver.findElement(ProceedtoCheckoutFinal);

	}
	
	public WebElement paymentMethodSelect() {

		return driver.findElement(paymentMethodSelect);

	}
	
	public WebElement confirmOrder() {

		return driver.findElement(confirmOrder);

	}
	
	
}
