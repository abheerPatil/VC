package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Property_TopBar {

	IOSDriver<MobileElement> driver;
	
	
/****************************************************************************CONSTRUCTOR************************************************************************************/	
	
	public Property_TopBar(IOSDriver<MobileElement> driver){
		System.out.println("Started");
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
	}

/****************************************************************************ELEMENTS***************************************************************************************/	
	//ELEMENTS COUNT: 3
/**************************/	
	
	@iOSXCUITFindBy(iOSNsPredicate=" type = 'XCUIElementTypeButton' AND name = 'VC' ")
	IOSElement vcBtn;
	
	@iOSXCUITFindBy(iOSNsPredicate=" type = 'XCUIElementTypeButton' AND name = 'Save Changes' ")
	IOSElement saveChangesBtn;
	
	@iOSXCUITFindBy(iOSNsPredicate=" type = 'XCUIElementTypeButton' AND name = 'Camera' ")
	IOSElement cameraBtn;
	
	
/****************************************************************************ACTIONS***************************************************************************************/	
	/*METHODS COUNT : 4
	 * 1. isSaveEnabled()
	 * 2. clickCameraBtn()
	 * 3. clickVCBtn()
	 * 4. clickSaveChangesBtn()
	 */
/*****************************/
	
	/*Method to check if Save Changes button is enabled or not.
	 * Parameters : null 
	 * Returns : true if action is enabled and false if not enabled or if there is any exception.
	 */
	public boolean isSaveEnabled(){
		try{
			boolean check = saveChangesBtn.isEnabled();
			return check;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_TopBar, in method - isSaveEnabled :"+e);		//LOG
			return false;
		}
	}
	
	/*Method to click camera button.
	 * Parameters : null 
	 * Returns : true if action is performed and false if there is any exception.
	 */
	public boolean clickCameraBtn(){
		try{
			cameraBtn.click();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_TopBar, in method - clickCameraBtn :"+e);		//LOG
			return false;
		}
	}
	
	/*Method to click VC button.
	 * Parameters : null 
	 * Returns : true if action is performed and false if there is any exception.
	 */
	public boolean clickVCBtn(){
		try{
			vcBtn.click();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_TopBar, in method - clickVCBtn :"+e);		//LOG
			return false;
		}
	}
	
	/*Method to click Save Changes button.
	 * Parameters : null 
	 * Returns : true if action is performed and false if there is any exception.
	 */
	public boolean clickSaveChangesBtn(){
		try{
			saveChangesBtn.click();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_TopBar, in method - clickSaveChangesBtn :"+e);		//LOG
			return false;
		}
	}
}
