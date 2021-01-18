package mobilePOC;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import wrapper.MobilePOCWrappers;

public class CartPage extends MobilePOCWrappers{

	public CartPage(AndroidDriver<?> driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}
	
	public CartPage verifyCartCount(String count) {
		assertTextById(prop.getProperty("CartPage.CartCount.Id"), count);
		return this;
	}
	
	public CartPage verifyCartProductTitle(String productTitle) {
		verifyTextByXpath(prop.getProperty("CartPage.ProductTitle.Xpath"), productTitle.substring(0, 62));
		return this;
	}
	
	public CartPage clickProceedToCheckOut() {
		clickByXpath(prop.getProperty("CartPage.ProceedToCheckOut.Xpath"));
		return this;
	}
}