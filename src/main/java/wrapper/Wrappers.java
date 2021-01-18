package wrapper;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Wrappers {

	void loadObjects() throws FileNotFoundException, IOException;
	
	void unloadObjects();

	boolean launchApp(String deviceName, String version);

	boolean launchActivity();

	boolean verifyAndInstallApp();

	void sleep(int mSec);

	void printContext();

	boolean switchview();

	boolean clickByID(String id);

	boolean clickByAccessebilityID(String id);

	boolean clickByXpath(String xpath);

	boolean clickByLinkText(String LinkText);

	void enterTextByID(String id, String data);

	void pressEnter();

	void enterTextByXpath(String xpath, String data);

	long takeSnap();

	boolean verifyTextByID(String id, String data);

	boolean backButton();

	boolean scrollUsingDesc(String text);

	boolean scrollUpinApp();

	boolean zoomInApp();

	boolean zoomUsingElement(String xpath);

	boolean pinchUsingElement(String xpath);

	boolean verifyAttributeTextByXPath(String xpath, String text);

	void enterTextByXpathUsingActions(String id, String data);

	boolean closeApp();

	boolean screenOrientation();
	
	boolean hideKeyBoard();
	
	boolean getNetworkConnection();
	
	boolean setWIFINetworkConnection();
	
	boolean switchWebview();
	
	void clickXpathUsingActions(String xpath);
	
	void horizontalSwipe(double A1, double A2);
	
	void verticalSwipe(double A1, double A2);
	
	boolean elementPresentOrNot(String locator, String locatorType);
}