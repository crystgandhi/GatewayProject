package GatwayPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GenerateCardNumber {
	
	WebDriver ldriver;
	
	public GenerateCardNumber(WebDriver rdriver) {
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//h2")
	WebElement cardNumberpagetitle;
	public String getPageHeadertitle() {
		return cardNumberpagetitle.getText();
	}
	@FindBy(xpath="//div[@class='6u 12u$(xsmall)']")
	WebElement payAmount;
	public String payAmountviaCard() {
		return payAmount.getText();
	}
	@FindBy(css="#card_nmuber")
	WebElement cardNumber;
	public void getCardNumber(String cardNum) {
		cardNumber.sendKeys(cardNum);
	}
	@FindBy(id="month")
	WebElement cardExpirationMonth;
	public void getCardExpirationMonth() {
		Select sl1=new Select(cardExpirationMonth);
		sl1.selectByIndex(6);
	}
	@FindBy(id="year")
	WebElement cardExpirationYear;
	public void getCardExpirationYear() {
		Select sl2=new Select(cardExpirationYear);
		sl2.selectByIndex(6);
	}
	@FindBy(name="cvv_code")
	WebElement cvvCode;
	public void getcvvCode(String code) {
		cvvCode.sendKeys(code);
	}
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement pay;
	public void makePayment() {
		pay.click();
	}
	
}
