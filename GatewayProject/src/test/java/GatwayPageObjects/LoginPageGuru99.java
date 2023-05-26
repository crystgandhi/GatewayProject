package GatwayPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPageGuru99 {

	WebDriver ldriver;

	public LoginPageGuru99(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(linkText = "Payment Gateway Project")
	WebElement paymentGatewaylink;

	public void gotoPaymentGateway() {
		paymentGatewaylink.click();
	}

}
