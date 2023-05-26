package GatwayPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrderPageGateWay2 {
	
	WebDriver ldriver;
	
	public OrderPageGateWay2(WebDriver rdriver) {
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//h2")
	WebElement OrderPagetitle;
	public String getOrderPageHeadertxt() {
		return OrderPagetitle.getText();
	}
	@FindBy(xpath="//table[@class='alt access']/tbody/tr[1]/td[2]")
	WebElement orderID;
	public String getOrderId() {
		return orderID.getText();
	}
	
	
	
	
}
