package mobilePOC;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import wrapper.MobilePOCWrappers;

public class LoginPage extends MobilePOCWrappers{
	public LoginPage(AndroidDriver<?> driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}
	
	public LoginPage installEbayApp(){
		verifyAndInstallApp();
		return this;
	}

	public LoginPage launchEbayApp(String deviceName, String version){
		launchApp(deviceName, version);	
		switchview();
		return this;
	}
	
	public LoginPage switchToWebView() {
		switchWebview();
		return this;
	}
	
	public LoginPage switchToNativeView() {
		switchview();
		return this;
	}
	
	public LoginPage alreadyCustomerButtonClick(){
		switchview();
		clickByID(prop.getProperty("LoginPage.AlreadyCustomer.Id"));
		return this;
	}

	public LoginPage enterUserName(String email){
		enterTextByXpath(prop.getProperty("LoginPage.Email.Xpath"),email);
		return this;
	}
	
	public LoginPage clickContinueButton(){
		clickByXpath(prop.getProperty("LoginPage.Continue.Xpath"));
		return this;
	}

	public LoginPage enterPassword(String password){
		enterTextByXpath(prop.getProperty("LoginPage.Password.Xpath"), password);
		return this;
	}

	public HomePage clickLogin(){
		clickByXpath(prop.getProperty("LoginPage.Signin.Xpath"));
		return new HomePage(driver, test);
	}
}
