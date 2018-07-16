package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginPage {
	
	IOSDriver<MobileElement> driver ;


/****************************************************************************CONSTRUCTOR************************************************************************************/	
	
	public LoginPage(IOSDriver<MobileElement> driver){
		System.out.println("Started");
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
	}

/****************************************************************************ELEMENTS***************************************************************************************/	
	//ELEMENTS COUNT: 13
/**************************/	
	
	//IMAGE
	@iOSFindBy(xpath="//XCUIElementTypeImage[@name='ug']")
	public IOSElement image;
	
	//APPNAME
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='ValueChek']")
	public IOSElement appName;
	
	//USERNAME LABEL
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Username']")
	public IOSElement usernameLabel;
	
	//USERNAME TEXTFIELD
	@iOSFindBy(xpath="//XCUIElementTypeTextField")
	public IOSElement usernameField;
	
	//PASSWORD LABEL
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Password']")
	public IOSElement passwordLabel;
	
	//PASSWORD FIELD
	@iOSFindBy(xpath="//XCUIElementTypeSecureTextField")
	public IOSElement passwordField;
	
	//FORGOT PASSWORD LINK
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Forgot your password?']")
	public IOSElement forgotPasswordLink;
	
	//LOGIN BUTTON
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Log In']")
	public IOSElement loginBtn;
	
	//"BY USING THIS APPLICATION, YOU AGREE TO THE" LABEL
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='By using this application, you agree to the ']")
	public IOSElement LabelBeforeTermsAndCond;
	
	//TERMS AND CONDITION LINK
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Terms and Conditions']")
	public IOSElement TermsAndCondLink;
	
	//STATUS BAR
	@iOSFindBy(xpath="//XCUIElementTypeStatusBar")
	public IOSElement statusBar;
	
	//OFFLINE LOGIN MESSAGE
	@iOSFindBy(accessibility="Not able to log in right now. Try again later.")
	public IOSElement offlineMessage;
	
	//INCORRECT USERNAME AND PASSWORD COMBINATION MESSAGE
	@iOSFindBy(accessibility="Username/Password combination is incorrect")
	public IOSElement incorrectCombinations;

	
/****************************************************************************ACTIONS***************************************************************************************/	
	/*ACTIONS COUNT: 4
	 * 1. clickAction(MobileElement)  
	 * 2. login(String,String)
	 * 3. isStatusBar(null)
	 * 4. isElementDisplayed(MobileElement)
	 */
/*******************************/	
	
	/*Method to click a link or a button.
	 * Parameters : MobileElement 
	 * Returns : true if action is done and false if there is any exception in that.
	 */
	public boolean clickAction(MobileElement element){
		try{
			element.click();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - LoginPage, in method - clickAction :"+e);		//LOG
			return false;
		}
	}
	
	/*Method to check login behavior.
	 * Parameters : String(user's name) , String(password) 
	 * Returns : true if action is done and false if there is any exception in that.
	 */
	public boolean login(String username , String password){
		try{
			usernameField.clear();
			usernameField.sendKeys(username);
			passwordField.sendKeys(password);
			loginBtn.click();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - LoginPage, in method - login :"+e);
			return false;
		}
	}
	
	/*Method to check if status bar is active or not.
	 * Parameters : null 
	 * Returns : true if status bar is active otherwise false.
	 */
	public boolean isStatusBarActive(){										
		try{
			return StatusBar.isDisplayed();
		}
		catch(Exception e){
			System.err.println("Exception in class - LoginPage, in method - isStatusBarActive :"+e);
			return false;
		}
	}
	
	/*Method to check if an element is displayed or not.
	 * Parameters : MobileElement 
	 * Returns : true if element is displayed and false otherwise.
	 */
	public boolean isElementDisplayed(MobileElement element){
		try{
			boolean a = element.isDisplayed();
			return a;
		}
		catch(Exception e){
			System.err.println("Exception in class - LoginPage, in method - isElementDisplayed :"+e);		//LOG
			return false;
		}
	}
}
