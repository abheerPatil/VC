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
	
	public LoginPage(IOSDriver<MobileElement> driver){
		System.out.println("Started");
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
	}
	
	@iOSFindBy(xpath="//XCUIElementTypeImage[@name='ug']")
	public IOSElement image;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='ValueChek']")
	public IOSElement appName;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Username']")
	public IOSElement usernameLabel;
	
	@iOSFindBy(xpath="//XCUIElementTypeTextField")
	public IOSElement usernameField;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Password']")
	public IOSElement passwordLabel;
	
	@iOSFindBy(xpath="//XCUIElementTypeSecureTextField")
	public IOSElement passwordField;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Forgot your password?']")
	public IOSElement forgotPasswordLink;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Log In']")
	public IOSElement loginBtn;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='By using this application, you agree to the ']")
	public IOSElement LabelBeforeTermsAndCond;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Terms and Conditions']")
	public IOSElement TermsAndCondLink;
	
	@iOSFindBy(xpath="//XCUIElementTypeStatusBar")
	public IOSElement statusBar;
	
	@iOSFindBy(accessibility="Not able to log in right now. Try again later.")
	public IOSElement offlineMessage;
	
	@iOSFindBy(accessibility="Username/Password combination is incorrect")
	public IOSElement incorrectCombinations;
	
	
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
	
	
	public boolean blankUsernameAndPassword(){
		try{
			usernameField.clear();
			loginBtn.click();
			if(incorrectCombinations.isDisplayed()==true){
				return true;
			}
			else{
				return false;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - LoginPage, in method - blankUsernameAndPassword :"+e);		//LOG
			return false;
		}
	}
	
	
	public boolean Login(){
		try{
			usernameField.clear();
			usernameField.sendKeys("kiwitech1");
			passwordField.sendKeys("hvavc1");
			loginBtn.click();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - LoginPage, in method - positiveLogin :"+e);
			return false;
		}
	}
	
	public boolean isStatusBarActive(){										
		try{
			return StatusBar.isDisplayed();
		}
		catch(Exception e){
			System.err.println("Exception in class - LoginPage, in method - isStatusBarActive :"+e);
			return false;
		}
	}
	
	public boolean offlinelogin(){
		try{
			if(StatusBar.isOffline()==true){
				
				String preEnteredText = usernameField.getAttribute("value");
				usernameField.clear();
				usernameField.sendKeys("kiwitech1");
				passwordField.sendKeys("hvavc1");
				loginBtn.click();
				if(preEnteredText.equals("kiwitech1")){
					return (offlineMessage.isDisplayed());
				}
				else{
					System.out.println("Offline Login because of same username");  //Log
					return true;
				}
			}
			else{
				System.out.println("Not online");							//Log
				return false;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - LoginPage, in method - offlinelogin :"+e);
			return false;
		}
	}
	
	public boolean negativeLogin(){
		try{
			usernameField.clear();
			usernameField.sendKeys("kiwitech1");
			passwordField.sendKeys("qwerty");
			loginBtn.click();
			if(incorrectCombinations.isDisplayed()==true){
				return true;
			}
			else{
				return false;
			}
			
		}
		catch(Exception e){
			System.err.println("Exception in class - LoginPage, in method - negativelogin :"+e);
			return false;
		}
	}

}
