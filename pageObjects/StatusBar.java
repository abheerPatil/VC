package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class StatusBar {
	
	IOSDriver<MobileElement> driver;
	
	private StatusBar(IOSDriver<MobileElement> driver){
		System.out.println("Started");
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(new AjaxElementLocatorFactory(driver,20), this);
	}
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[contains(@name,'iPad')]")
	private static IOSElement iPad; 
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[contains(@name,'3 Wi-Fi bars')]")
	private static IOSElement wifiBar; 
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[contains(@name,'M')]")
	private static IOSElement time; 
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[contains(@name,'battery power, Charging')]")
	private static IOSElement charging; 
	
	public static boolean isDisplayed(){
		
		return ((iPad.isDisplayed())&&(wifiBar.isDisplayed())&&(time.isDisplayed())&&(charging.isDisplayed()));
	}
	
	public static boolean isOffline(){
		return (wifiBar.isDisplayed());
	}
}
