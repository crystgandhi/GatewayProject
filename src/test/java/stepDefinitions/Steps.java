package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GatwayPageObjects.GenerateCardNumber;
import GatwayPageObjects.HomePageGateWay;
import GatwayPageObjects.LoginPageGuru99;
import GatwayPageObjects.OrderPageGateWay2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	public WebDriver driver;
	public HomePageGateWay hp;
	public GenerateCardNumber Gcn;
	public OrderPageGateWay2 op;

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath + "//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		hp = new HomePageGateWay(driver);
		Gcn = new GenerateCardNumber(driver);
		op = new OrderPageGateWay2(driver);
	}

	@When("User open URL {string}")
	public void user_open_url(String url) {
		driver.get(url);
	}

	@Then("User land on Guru99 Payment Gateway")
	public void user_land_on_guru99_payment_gateway() {
		hp.getHeadertxt();
	}

	@Then("User check the page title")
	public void user_check_the_page_title() {
		hp.getPageHeadertxt();
	}

	@When("User select number of Quantities as {string}")
	public void user_select_number_of_quantities_as(String string) {
		hp.getproductQuantity();
	}

	@Then("User click Buy now Btn")
	public void user_click_buy_now_btn() {
		hp.buyproduct();
	}

	@Then("Check the Page title")
	public void check_the_page_title() {
		Gcn.getPageHeadertitle();
	}

	@Then("User Check Pay Amount")
	public void user_check_pay_amount() {
		Gcn.payAmountviaCard();
	}

	@When("User enter Card Number as {string}")
	public void user_enter_card_number_as(String cardNum) {
		Gcn.getCardNumber(cardNum);
	}

	@When("User enter Expiration Month as {string}")
	public void user_enter_expiration_month_as(String string) {
		Gcn.getCardExpirationMonth();
	}

	@When("User enter Expiration Year  as {string}")
	public void user_enter_expiration_year_as(String expYear) {
		Gcn.getCardExpirationYear();
	}

	@When("User enter CVV Code as {string}")
	public void user_enter_cvv_code_as(String cvv) {
		Gcn.getcvvCode(cvv);
	}

	@Then("User Click pay button")
	public void user_click_pay_button() {
		Gcn.makePayment();
	}

	@Then("user land on Order ID page")
	public void user_land_on_order_id_page() {
		op.getOrderPageHeadertxt();
	}

	@Then("User get Order ID")
	public void user_get_order_id() {
		op.getOrderId();
	}
	
	@Then("close the window")
	public void closeTheWindow() {
		driver.close();
	}

}
