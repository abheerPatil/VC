package pageObjects;

import java.util.ArrayList;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import utility.ExtraFunctionalityCheck;

public class LoginPage {
	
	IOSDriver<MobileElement> driver ;
	
	public LoginPage(IOSDriver<MobileElement> driver){
		System.out.println("Started");
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(new AjaxElementLocatorFactory(driver,20), this);
		addToList();
	}
	
	@iOSFindBy(xpath="//XCUIElementTypeImage[@name='ug']")
	private IOSElement image;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='ValueChek']")
	private IOSElement appName;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Username']")
	private IOSElement usernameLabel;
	
	@iOSFindBy(xpath="//XCUIElementTypeTextField")
	private IOSElement usernameField;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Password']")
	private IOSElement passwordLabel;
	
	@iOSFindBy(xpath="//XCUIElementTypeSecureTextField")
	private IOSElement passwordField;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Forgot your password?']")
	private IOSElement forgotPasswordLink;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Log In']")
	private IOSElement loginBtn;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='By using this application, you agree to the ']")
	private IOSElement LabelBeforeTermsAndCond;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Terms and Conditions']")
	private IOSElement TermsAndCondLink;
	
	@iOSFindBy(xpath="//XCUIElementTypeStatusBar")
	private IOSElement statusBar;
	
	
	private ArrayList<MobileElement> elements = new ArrayList<MobileElement>();
	
	private void addToList(){
		try{
			elements.add(image);
			elements.add(appName);
			elements.add(usernameLabel);
			elements.add(usernameField);
			elements.add(passwordLabel);
			elements.add(passwordField);
			elements.add(forgotPasswordLink);
			elements.add(loginBtn);
			elements.add(LabelBeforeTermsAndCond);
			elements.add(TermsAndCondLink);
			elements.add(statusBar);
			
		}
		catch(Exception e){
			System.err.println("Exception in class - LoginPage, in method - addToList :"+e);
		}
	}
	
	
	public boolean isElementsDisplayed(){
		
		try{
			if(ExtraFunctionalityCheck.checkElements(elements).size() == 0){
				return true;
			}
			else{
				System.out.println("Not Displayed :"+ExtraFunctionalityCheck.checkElements(elements));	//LOG
				return false;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - LoginPage, in method - checkElements :"+e);
			return false;
		}
	}
	
	
	public boolean checkIfClickable(){
		try{
			if(ExtraFunctionalityCheck.isClickable(elements).size() == 0){
				return true;
			}
			else{
				System.out.println("Non Clickables :"+ExtraFunctionalityCheck.isClickable(elements)); //Log
				return false;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - LoginPage, in method - checkElements :"+e);
			return false;
		}
	}
	
	public boolean positiveLogin(){
		try{
			usernameField.clear();
			usernameField.sendKeys("kiwitech1");
			passwordField.sendKeys("hvavc1");
			loginBtn.click();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - LoginPage, in method - checkElements :"+e);
			return false;
		}
	}
	
	public boolean isStatusBarActive(){										
		try{
			return StatusBar.isDisplayed();
		}
		catch(Exception e){
			System.err.println("Exception in class - LoginPage, in method - checkElements :"+e);
			return false;
		}
	}

	public void showResults(){														//Remove
		try{
			System.out.println("All Elements : "+isElementsDisplayed());
			System.out.println("All Clickable Elements : "+checkIfClickable());
			System.out.println("Positive Login : "+positiveLogin());
			System.out.println("Status Bar : "+isElementsDisplayed());
		}
		catch(Exception e){
			System.out.println("Exception caught!");
		}
	}
}
