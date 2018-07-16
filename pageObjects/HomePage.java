package pageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSBy;
import io.appium.java_client.pagefactory.iOSFindAll;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utility.ExtraFunctionalityCheck;
import utility.ImageClass;

public class HomePage {
	
	IOSDriver<MobileElement> driver;

/****************************************************************************CONSTRUCTOR************************************************************************************/	
	
	
	public HomePage(IOSDriver<MobileElement> driver){
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
	}

	
/****************************************************************************COMMON PATHS***********************************************************************************/
	
	
	public String commonPath = "//XCUIElementTypeApplication[@name='ValueChek']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther";
	public String cardsPath1 = "/XCUIElementTypeCollectionView/XCUIElementTypeCell[";
	public String cardsPath2 = "]/XCUIElementTypeOther/XCUIElementTypeOther";
	

/****************************************************************************ELEMENTS***************************************************************************************/	
	
	
	//MENU
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[1]")
	public IOSElement menuButton;
	
	//PROPERTY PHASES
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='PROPERTY PHASES']")
	public IOSElement propertyPhasesBtn;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	public IOSElement newBtn;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	public IOSElement newPropCount;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell[2]")
	public IOSElement activeBtn;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
	public IOSElement activePropCount;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell[3]")
	public IOSElement pendingBtn;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]")
	public IOSElement pendingPropCount;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell[4]")
	public IOSElement purchaseBtn;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]")
	public IOSElement purchasedPropCount;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell[5]")
	public IOSElement archiveBtn;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]")
	public IOSElement archivePropCount;
	
	//LOAN PHASES
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='LOAN PHASES']")
	public IOSElement loanPhasesBtn;
	
	@iOSXCUITFindBy(accessibility="Submitted")
	public IOSElement submittedBtn;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[2]")
	public IOSElement submittedPropCount;
	
	@iOSXCUITFindBy(accessibility="In Review")
	public IOSElement inReviewBtn;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeStaticText[2]")
	public IOSElement inReviewPropCount;
	
	@iOSXCUITFindBy(accessibility="Denied")
	public IOSElement deniedBtn;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeStaticText[2]")
	public IOSElement deniedPropCount;
	
	@iOSXCUITFindBy(accessibility="Tabled")
	public IOSElement tabledBtn;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell[9]/XCUIElementTypeStaticText[2]")
	public IOSElement tabledPropCount;
	
	@iOSXCUITFindBy(accessibility="Approved")
	public IOSElement approvedBtn;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell[10]/XCUIElementTypeStaticText[2]")
	public IOSElement approvedPropCount;
	
	//DATE ADDED
	@iOSXCUITFindBy(accessibility = "DATE ADDED")
	public IOSElement dateAddedBtn;
	
	@iOSXCUITFindBy(accessibility="3 Months Ago")
	public IOSElement threeMonthsAgoBtn;
	
	@iOSXCUITFindBy(accessibility="6 Months Ago")
	public IOSElement sixMonthsAgoBtn;
	
	@iOSXCUITFindBy(accessibility="12 Months Ago")
	public IOSElement twelveMonthsAgoBtn;
	
	//TEAM
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='TEAM']")
	public IOSElement teamBtn;
	
	@iOSXCUITFindBy(accessibility="Kiwi1 Tech")
	public IOSElement kiwitech1Btn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Kiwi1 Tech']/following::XCUIElementTypeStaticText")
	public IOSElement kiwi1PropCount;
	
	@iOSXCUITFindBy(accessibility="Kiwi2 Tech")
	public IOSElement kiwitech2Btn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Kiwi2 Tech']/following::XCUIElementTypeStaticText")
	public IOSElement kiwi2PropCount;
	
	@iOSXCUITFindBy(accessibility="Kiwi3 Tech")
	public IOSElement kiwitech3Btn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Kiwi3 Tech']/following::XCUIElementTypeStaticText")
	public IOSElement kiwi3PropCount;
	
	@iOSXCUITFindBy(accessibility="Kiwi4 Tech")
	public IOSElement kiwitech4Btn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Kiwi4 Tech']/following::XCUIElementTypeStaticText")
	public IOSElement kiwi4PropCount;
	
	@iOSXCUITFindBy(accessibility="Kiwi5 Tech")
	public IOSElement kiwitech5Btn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Kiwi5 Tech']/following::XCUIElementTypeStaticText")
	public IOSElement kiwi5PropCount;
	
	@iOSXCUITFindBy(accessibility="Kiwi6 Tech")
	public IOSElement kiwitech6Btn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Kiwi6 Tech']/following::XCUIElementTypeStaticText")
	public IOSElement kiwi6PropCount;
	
	@iOSXCUITFindBy(accessibility="Kiwi7 Tech")
	public IOSElement kiwitech7Btn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Kiwi7 Tech']/following::XCUIElementTypeStaticText")
	public IOSElement kiwi7PropCount;
	
	//SETTINGS
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='SETTINGS']")
	public IOSElement settingsBtn;
	
	@iOSXCUITFindBy(accessibility="Pricing Profiles")
	public IOSElement pricingProfileBtn;
	
	@iOSXCUITFindBy(accessibility="FAQ")
	public IOSElement fAQBtn;
	
	@iOSXCUITFindBy(accessibility="Support")
	public IOSElement supportBtn;
	
	@iOSXCUITFindBy(accessibility="Terms and Conditions")
	public IOSElement termsAndConditionBtn;
	
	@iOSXCUITFindBy(accessibility="Privacy Policy")
	public IOSElement privacyPolicyBtn;
	
	@iOSXCUITFindBy(accessibility="Feedback")
	public IOSElement feedbackBtn;
	
	@iOSXCUITFindBy(accessibility="Log Out")
	public IOSElement logOutBtn;
	
	//HEADER
	@iOSXCUITFindBy(accessibility="My Properties")
	public IOSElement homePageHeading;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='search']")
	public IOSElement searchBar;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='iconBell']")
	public IOSElement notificationBell;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='iconNewProperty']")
	public IOSElement addPropertyBtn;
	
	//PROPERTY CARDS
	@iOSFindAll({@iOSBy(xpath="(//XCUIElementTypeImage[@name='card'])")})
	public ArrayList<IOSElement> cards;
	
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeImage[@name='card'])[10]")
	public IOSElement finalRow;
	
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeImage[@name='card'])[4]")
	public IOSElement secondRow;
	
	//NOTIFICATION BELL
	
	//Details of first property in notification bell
	@iOSXCUITFindBy(iOSNsPredicate=" rect.y == 146 OR rect.y == 175 OR rect.y == 171 ")
	public ArrayList<IOSElement> firstNotification;
	
	@iOSXCUITFindBy(iOSNsPredicate=" type == 'XCUIElementTypeButton' AND name == 'See All'")
	public IOSElement seeAllBtn;
	
	@iOSXCUITFindBy(iOSNsPredicate=" rect.x = 912 AND rect.y = 26")
	public IOSElement notificationCountElement;
	

/****************************************************************************ACTIONS***************************************************************************************/	
	/*ACTIONS COUNT: 14
	 * 1. isDisplayed(MobileElement element)  
	 * 2. clickBtn(MobileElement element)
	 * 3. checkPhasesCount(String tag-name,Integer cell-no)
	 * 4. checkPropertyPhaseSelectedItem(Integer cell-no)
	 * 5. checkLoanPhaseSelectedItem(Integer cell-no)
	 * 6. checkDateAddedSelectedItem(Integer cell-no)
	 * 7. checkHeaderOpened(Integer cell-no)
	 * 8. userItems(String user)
	 * 9. countProperties(MobileElement element)
	 * 10. swipeProperties(null)
	 * 11. findPropByString(Integer totalPropShown , String string)
	 * 12. findPropByIndex(Integer totalPropShown , Integer index)
	 * 13. checkFirstNotification(String provided address/project name)
	 * 14. notificationCount(null)
	 */
/**************************************************************************/
	
	/*Method to check if an element is displayed or not.
	 * Parameters : MobileElement 
	 * Returns : true is action is done and false if there is any exception in that.
	 * NOTE: Needs scrolling if data is not currently on screen but is on page
	 */
	public boolean isDisplayed(MobileElement element){
		try{
			element.isDisplayed();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - isDisplayed :"+e);
			return false;
		}
	}
	
	
	/*Method to click an element.
	 * Parameters : MobileElement
	 * Returns : true is action is done and false if there is any exception in that. 
	 */
	public boolean clickBtn(MobileElement element){
		try{
			element.click();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - clickBtn : "+e);
			return false;
		}
	}
	
	
	
	/*Method to verify the number of phase tags of a property with the value given in menu.
	 * Parameters : String(Tag-name) , integer(cell no. in the menu)  
	 * Returns : true if number of property is same as mentioned in the menu for a particular item and false otherwise.
	 * NOTE: Needs scrolling if data is not currently on screen but is on page
	 */
	public boolean checkPhasesCount(String tagName, int cellNum){
		try{
			int count = 0;
			for(int i=1;i<=cards.size();i++){
				String re = driver.findElement(By.xpath(commonPath+cardsPath1+i+cardsPath2+"/XCUIElementTypeStaticText")).getAttribute("name");
				if(re.equals("tagName")){
					count++;
				}
			}
			try{
				menuButton.click();
				if(driver.findElement(By.xpath(commonPath+"/XCUIElementTypeOther[4]/XCUIElementTypeTable/XCUIElementTypeCell["+cellNum+"]/XCUIElementTypeStaticText[@name='"+count+"']")).isDisplayed()){
					menuButton.click();
					return true;
				}
				else{
					System.out.println("Not Matched"); 															//LOG
					menuButton.click();
					return false;
				}
			}
			catch(Exception e){
				System.err.println("Exception in class - HomePage, in method - checkPhasesButton :"+e); 		//LOG
				menuButton.click();
				return false;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - checkPhasesButton :"+e);
			return false;
		}
	}
	
	
	/*Method to check if Property Phase Items is in selected state or not.
	 * Parameters : Integer(cell no. in the menu) 
	 * Returns : true if in selected state and false if not.
	 * NOTE: Needs scrolling if data is not currently on screen but is on page
	 */
	public boolean checkPropertyPhaseSelectedItem(int i){
		String path = "/Users/kiwitech/Desktop/screenshots/";
	try{
		switch(i){
		
		//New
		case 1 :  ExtraFunctionalityCheck.getScreenshots(newBtn);
				if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/NewBtnClicked.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/NewBtn.png")==0){
					return false;
				}
		break;
		
		//Active
		case 2 :  ExtraFunctionalityCheck.getScreenshots(activeBtn);
				if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/ActiveBtnClicked.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/ActiveBtn.png")==0){
					return false;
				}
		break;
		
		//Pending
		case 3 :  ExtraFunctionalityCheck.getScreenshots(pendingBtn);
				if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/PendingBtnClicked.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/PendingBtn.png")==0){
					return false;
				}
		break;
				

		//Purchased
		case 4 :  ExtraFunctionalityCheck.getScreenshots(purchaseBtn);
				if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/PurchaseBtnClicked.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/PurchaseBtn.png")==0){
					return false;
				}
		break;
		

		//Archived
		case 5 :  ExtraFunctionalityCheck.getScreenshots(archiveBtn);
				if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/ArchiveBtnClicked.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/ArchiveBtn.png")==0){
					return false;
				}
		break;
			}
		return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - checkPropertyPhaseSelectedItem :"+e);
			return false;
		}
	}	
	
	
	/*Method to check if Loan Phase Item is in selected state or not.
	 * Parameters : Integer(cell no. in the menu) 
	 * Returns : true if in selected state and false if not.
	 * NOTE: Needs scrolling if data is not currently on screen but is on page
	 */
	public boolean checkLoanPhaseSelectedItem(int i){
		String path = "/Users/kiwitech/Desktop/screenshots/";
		
		try{
		switch(i){ 
		//Submitted
		case 1 :  ExtraFunctionalityCheck.getScreenshots(submittedBtn);
				if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/SubmittedBtnClicked.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/SubmittedBtn.png")==0){
					return false;
				}
		break;
		
		//In Review
		case 2 :  ExtraFunctionalityCheck.getScreenshots(inReviewBtn);
				if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/InReviewClicked.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/InReviewBtn.png")==0){
					return false;
				}
		break;
				
		//Denied
		case 3 :  ExtraFunctionalityCheck.getScreenshots(deniedBtn);
				if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/DeniedBtnClicked.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/DeniedBtn.png")==0){
					return false;
				}
		break;
				
		//Tabled
		case 4 :  ExtraFunctionalityCheck.getScreenshots(tabledBtn);
				if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/TabledBtnClicked.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/TabledBtn.png")==0){
					return false;
				}
		break;
				
		//Approved
		case 5 :  ExtraFunctionalityCheck.getScreenshots(approvedBtn);
				if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/ApprovedBtnClicked.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/ApprovedBtn.png")==0){
					return false;
				}
				break;
			}
		return true;
		}	
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - checkLoanPhaseSelectedItem :"+e);
			return false;
		}
	}	
	
	
	/*Method to check if Loan Phase Item is in selected state or not.
	 * Parameters : Integer(cell no. in the menu) 
	 * Returns : true if in selected state and false if not.
	 * NOTE: Needs scrolling if data is not currently on screen but is on page
	 */
	public boolean checkDateAddedSelectedItem(int i){
		String path = "/Users/kiwitech/Desktop/screenshots/";
		try{
		switch(i){
		//3 Months
		case 1 :  ExtraFunctionalityCheck.getScreenshots(threeMonthsAgoBtn);
				if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/ThreeMonthsBtnClicked.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/ThreeMonthsBtn.png")==0){
					return false;
				}
		break;

		//6 Months
		case 2 :  ExtraFunctionalityCheck.getScreenshots(sixMonthsAgoBtn);
				if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/SixMonthsBtnClicked.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/SixMonthsBtn.png")==0){
					return false;
				}
		break;
				
		//12 Months
		case 3 :  ExtraFunctionalityCheck.getScreenshots(twelveMonthsAgoBtn);
				if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/TweleveMonthsBtnClicked.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/TwelveMonthsBtn.png")==0){
					return false;
				}
		break;				
		}	
		return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - checkdateAddedSelectedItem :"+e);
			return false;
		}
	}
	
	
	/*Method to check if Menu Header is open or close.
	 * Parameters : Integer(cell no. in the menu) 
	 * Returns : true if opened and false if closed
	 * NOTE: Needs scrolling if data is not currently on screen but is on page
	 */
	public boolean checkHeaderOpened(int i){
		String path = "/Users/kiwitech/Desktop/screenshots/";
		try{
		switch(i){
		//PROPERTY PHASES
		case 1 :  ExtraFunctionalityCheck.getScreenshots(pricingProfileBtn);
				if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU HEADERS/PropertyPhasesBtnOpened.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU HEADERS/PropertyPhasesBtnClosed.png")==0){
					return false;
				}
		break;

		//LOAN PHASES
		case 2 :  ExtraFunctionalityCheck.getScreenshots(loanPhasesBtn);
				if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU HEADERS/LoanPhasesBtnOpened.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/LoanPhasesBtnClosed.png")==0){
					return false;
				}
		break;
				
		//DATE ADDED
		case 3 :  ExtraFunctionalityCheck.getScreenshots(dateAddedBtn);
				if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/DateAddedBtnOpened.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/DateAddedBtnClosed.png")==0){
					return false;
				}
		break;		
		
		//TEAM
		case 4 :  ExtraFunctionalityCheck.getScreenshots(teamBtn);
				if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU HEADERS/TeamBtnOpened.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/TeamBtnClosed.png")==0){
					return false;
				}
		break;
				
		//SETTINGS
		case 5 :  ExtraFunctionalityCheck.getScreenshots(settingsBtn);
				if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/SettingsBtnOpened.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/SettingsBtnClosed.png")==0){
					return false;
				}
		break;
		
		}	
			
		return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - checkHeaderOpened :"+e);
			return false;
		}
	}
	
	
	/*Method to check if these users are displayed or not.
	 * Parameters : String(user's name) 
	 * Returns : true if appropriate team is displayed.
	 * NOTE: Needs scrolling if data is not currently on screen but is on page
	 */
	public boolean userItems(String user){
		
		try{
			if((user.equalsIgnoreCase("kiwitech1"))||(user.equalsIgnoreCase("kiwitech2"))||(user.equalsIgnoreCase("kiwitech4"))){
				kiwitech1Btn.isDisplayed();
				kiwitech2Btn.isDisplayed();
				kiwitech4Btn.isDisplayed();
				return true;
			}
			else if((user.equalsIgnoreCase("kiwitech3"))||(user.equalsIgnoreCase("kiwitech6"))){
				kiwitech3Btn.isDisplayed();
				kiwitech6Btn.isDisplayed();
				return true;
			}
			else if((user.equalsIgnoreCase("kiwitech5"))||(user.equalsIgnoreCase("kiwitech7"))){
				kiwitech5Btn.isDisplayed();
				kiwitech7Btn.isDisplayed();
				return true;
			}
			else{
				return false;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - userItems :"+e);
			return false;
		}
	}
	
	/*Method to get Count of Number of properties as per selection
	 * Parameter : MobileElement 
	 * Returns : The Integer representation of count.
	 * NOTE: Needs scrolling if data is not currently on screen but is on page
	 */
	public int countProperties(MobileElement element){
		try{
			String s = element.getAttribute("value").toString();
			return ExtraFunctionalityCheck.getNumberFromString(s);
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - countProperties :"+e);
			return 0;
		}
	}
	
	/*Method to swipe Properties.
	 * Parameters : Null 
	 * Returns : Null
	 * NOTE: Scrolling is done in two phases, first the Third Row swipes to top and then the Second Row Swipes to Top.
	 */
	public void swipeProperties(){
		try{
			IOSTouchAction ob = new IOSTouchAction(driver);
			ob.press(0,finalRow.getLocation().getY()).waitAction(Duration.ofSeconds(6)).moveTo(homePageHeading).release().perform();
			ob.press(0,secondRow.getLocation().getY()).waitAction(Duration.ofSeconds(3)).moveTo(homePageHeading).release().perform();
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - swipeProperties :"+e);
		}
	}
	
	/*Method to Find a Property on the basis of Project Name, Address, Appointment Date, House Details.
	 * Parameters : integer(total number of property selected) , String (the string to identify the element) 
	 * Returns : MobileElement of the property being searched.
	 * NOTE: Should be used in conjunction to countProperties method
	 */
	public MobileElement findPropByString(int totalPropShown , String string){
		try{
			int loops = totalPropShown / 12;
			for(int i=0;i<=loops;i++){
				try{
					MobileElement element = driver.findElementByAccessibilityId(string);
					return element;
				}
				catch(Exception e){
					swipeProperties();
					continue;
				}
			}
			System.out.println("No Property Found");
			return null;
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - findPropByString :"+e);
			return null;
		}
	}
	
	/*Method to Find a Property on the basis of its index.
	 * Parameters : integer(total number of property selected) , integer (the index of the element) 
	 * Returns : MobileElement of the property being searched.
	 * NOTE: Should be used in conjunction to countProperties method
	 */
	public MobileElement findPropByIndex(int totalPropShown , int index){
		try{
			int loops = index/12;
			int remaining = index%12;
			int totalNeededLoops = totalPropShown/12;
			
			for(int i=0;i<loops;i++){
				swipeProperties();
			}
			if(remaining == 0){
				MobileElement element = driver.findElement(By.xpath("//XCUIElementTypeImage[@name='card'])[12]"));
				return element;
			}
			else if((loops == totalNeededLoops) && (remaining == 1) && (remaining == 2) && (remaining == 3)){
				swipeProperties();
				MobileElement element = driver.findElement(By.xpath("//XCUIElementTypeImage[@name='card'])["+(9+remaining)+"]"));
				return element;
			}
			else if((loops == totalNeededLoops) && (remaining == 4) && (remaining == 5) && (remaining == 6)){
				swipeProperties();
				MobileElement element = driver.findElement(By.xpath("//XCUIElementTypeImage[@name='card'])["+(6+remaining)+"]"));
				return element;
			}
			else if((loops == totalNeededLoops) && (remaining == 7) && (remaining == 8) && (remaining == 9)){
				swipeProperties();
				MobileElement element = driver.findElement(By.xpath("//XCUIElementTypeImage[@name='card'])["+(3+remaining)+"]"));
				return element;
			}
			else{
				swipeProperties();
				MobileElement element = driver.findElement(By.xpath("//XCUIElementTypeImage[@name='card'])["+(0+remaining)+"]"));
				return element;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - findPropByIndex :"+e);
			return null;
		}
	}
	
	/*Method to Check if the first notification in notification bell is same as the string provided.
	 * Parameters : String 
	 * Returns : true if the property is same , false otherwise.
	 */
	@SuppressWarnings("unused")
	public boolean checkFirstNotification(String s){
		try{
			for(int i=0;i<firstNotification.size();i++){
				if(firstNotification.get(i).toString().equals(s));{
					return true;
				}
			}
			return false;
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - checkFirstNotification :"+e);
			return false;
		}
	}
	
	/*Method to provide the count of notifications on notification bell.
	 * Parameters : null 
	 * Returns : integer representation of notification count.
	 */
	public int notificationCount(){
		try{
			String element = notificationCountElement.getAttribute("Name").toString();
			int count = Integer.parseInt(element);
			return count;
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - notificationCount :"+e);
			return 0;
		}
	}
	
}
