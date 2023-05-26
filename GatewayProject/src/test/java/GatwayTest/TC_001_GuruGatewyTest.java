package GatwayTest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import GatwayPageObjects.GenerateCardNumber;
import GatwayPageObjects.HomePageGateWay;
import GatwayPageObjects.LoginPageGuru99;
import GatwayPageObjects.OrderPageGateWay2;

public class TC_001_GuruGatewyTest extends Baseclass{
	
	@Test
	public void buyAProduct() throws IOException, InterruptedException {
		String validNum="9865543678546738";
		String cvv="453";
		
		LoginPageGuru99 lp=new LoginPageGuru99(ldriver);
		lp.gotoPaymentGateway();
		
		//ldriver.switchTo().frame(0).close();
		HomePageGateWay hp=new HomePageGateWay(ldriver);
		String expected=hp.getHeadertxt();
		Assert.assertEquals("Guru99 Payment Gateway", expected);
		String pageHeader=hp.getPageHeadertxt();
		Assert.assertEquals("Mother Elephant With Babies Soft Toy", pageHeader);
		hp.getproductQuantity();
		hp.buyproduct();
		
		GenerateCardNumber crdNum=new GenerateCardNumber(ldriver);
		String crdNumpage=crdNum.getPageHeadertitle();
		Assert.assertEquals(crdNumpage, "Payment Process");
		crdNum.getCardNumber(validNum);
		crdNum.getCardExpirationMonth();
		crdNum.getCardExpirationYear();
		crdNum.getcvvCode(cvv);
	    String txt=	crdNum.payAmountviaCard();
	    System.out.println(txt);
		crdNum.makePayment();
		
		OrderPageGateWay2 order=new OrderPageGateWay2(ldriver);
		String ordertxt=order.getOrderPageHeadertxt();
		Assert.assertEquals("Payment successfull!", ordertxt);
		String id=order.getOrderId();
		System.out.println(id);
		
		CaptureScreenshot(ldriver, "buyAProduct");
	}
	
	


}
//https://www.youtube.com/watch?v=M4Ye3SKT46g

