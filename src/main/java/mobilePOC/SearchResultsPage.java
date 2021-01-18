package mobilePOC;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import wrapper.MobilePOCWrappers;

public class SearchResultsPage extends MobilePOCWrappers{

	public SearchResultsPage(AndroidDriver<?> driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}
	
	public ProductDetailPage findProductAndClick(String productTitle) {
		boolean status=false;
		
		List<WebElement> productListInitialSize = webelementList(prop.getProperty("SearchResultPage.ProductList.Xpath"));
		do {
			List<WebElement> productList = webelementList(prop.getProperty("SearchResultPage.ProductList.Xpath"));
			
			for(int i=1; i<=productList.size(); i++) {
				String productTitleXpath = stringReplacerMethod(prop.getProperty("SearchResultPage.ProductTitle.Xpath"), String.valueOf(i));
				
				if(assertTextByXpath(productTitleXpath, productTitle)) {
					status=true;
					
					String productClickXpath = stringReplacerMethod(prop.getProperty("SearchResultPage.ProductClick.Xpath"), String.valueOf(i));
					clickByXpath(productClickXpath);
					break;
				}
				else {
					continue;
				}
				
			}
			
			if(!status && (productList.size()>=productListInitialSize.size())) {
				verticalSwipe(0.80, 0.20);
			}
		}
		while(status);
		
		return new ProductDetailPage(driver, test);
	}
}