package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import mobilePOC.LoginPage;
import wrapper.MobilePOCWrappers;

public class TC01_BuyProductCycle extends MobilePOCWrappers{

	@BeforeClass
	public void setValues(){
		dataSheetName 	= "ProductDetails";
		testCaseName 	= "Login to App and purchase product";
		testDescription = "Login to app and search for 65 inch TV and purchase one product";
		categories = "funtional";
		authors = "Anfas";

	}

	@Test(dataProvider="fetchData")
	public void verifyBuyProductCycle(String deviceName,String version, String email,String Password, String searchKeyword, String productTitle, String productGroup, String productDetails) throws IOException {
		new LoginPage(driver, test).
		
		installEbayApp()
		.launchEbayApp(deviceName, version)
		.alreadyCustomerButtonClick()
		.switchToWebView()
		.enterUserName(email)
		.clickContinueButton()
		.enterPassword(Password)
		.clickLogin()
		.switchToNativeView()
		.clickSearch()
		.enterSearchKeyword(searchKeyword)
		.clickSearchEnterButton()
		.findProductAndClick(productTitle)
		.verifyProductTitle(productTitle)
		.addToCart()
		.clickCartIcon()
		.verifyCartCount("1")
		.verifyCartProductTitle(productTitle)
		.clickProceedToCheckOut();
		//.clickLogout();
	}


}
