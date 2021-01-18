package mobilePOC;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import wrapper.MobilePOCWrappers;

public class HomePage extends MobilePOCWrappers{

	public HomePage(AndroidDriver<?> driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}
	
	public HomePage switchToWebView() {
		switchWebview();
		return this;
	}
	
	public HomePage switchToNativeView() {
		switchview();
		return this;
	}

	public HomePage clickSearch() {
		clickByID(prop.getProperty("HomePage.Search.Id"));		
		return this;
	}
	
	public HomePage enterSearchKeyword(String searchKeyword) {
		enterTextByID(prop.getProperty("HomePage.Search.Id"), searchKeyword);		
		return this;
	}
	
	public SearchResultsPage clickSearchEnterButton() {
		pressEnter();
		return new SearchResultsPage(driver, test);
	}
}