package GatwayPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePageGateWay {
	
	WebDriver ldriver;
	
	public HomePageGateWay(WebDriver rdriver) {
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//strong")
	WebElement hedaerTitle;
	public String getHeadertxt() {
		return hedaerTitle.getText();
	}
	@FindBy(xpath="//h2")
	WebElement title;
	public String getPageHeadertxt() {
		return title.getText();
	
	}
	@FindBy(name="quantity")
	WebElement Quantity;
	public void getproductQuantity() {
		Select sl=new Select(Quantity);
		sl.selectByIndex(3);
	}
	@FindBy(xpath="//input[@value='Buy Now']")
	WebElement buyNow;
	public void buyproduct() {
		buyNow.click();
	}
	
}
