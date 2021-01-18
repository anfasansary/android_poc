package mobilePOC;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import wrapper.MobilePOCWrappers;

public class ProductDetailPage extends MobilePOCWrappers{

	public ProductDetailPage(AndroidDriver<?> driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}
	
	public ProductDetailPage verifyProductTitle(String productTitle) {
		assertTextByXpath(prop.getProperty("ProductDetailPage.ProductTitle.Xpath"), productTitle);
		return this;
	}
	
	public ProductDetailPage addToCart() {
		do {
			verticalSwipe(0.70, 0.30);
		}
		while(elementPresentOrNot(prop.getProperty("ProductDetailPage.AddToCart.Xpath"), "Xpath"));
		clickByXpath(prop.getProperty("ProductDetailPage.AddToCart.Xpath"));
		return this;
	}
	
	public CartPage clickCartIcon() {
		clickByID("ProductDetailPage.CartIcon.Id");
		return new CartPage(driver, test);
	}
}