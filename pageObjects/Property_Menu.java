package pageObjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utility.ExtraFunctionalityCheck;
import utility.ImageClass;

public class Property_Menu {

	IOSDriver<MobileElement> driver;
	
	
/****************************************************************************CONSTRUCTOR************************************************************************************/	
		
	public Property_Menu(IOSDriver<MobileElement> driver){
		System.out.println("Started");
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
	}

/****************************************************************************ELEMENTS***************************************************************************************/	
	//ELEMENTS COUNT: 32 
/**************************/	
	
	//PROPERTY IMAGE
	@iOSXCUITFindBy(xpath="//XCUIElementTypeImage[following::XCUIElementTypeButton[@name='Add']]")
	public IOSElement propertyImage;
	
	//ADD PROPERTY IMAGE BUTTON
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name = 'Add']")
	public IOSElement imageAddBtn;
	
	//CAMERA LOGO WITH ADD BUTTON
	@iOSXCUITFindBy(xpath="//XCUIElementTypeImage[@name='Camera']")
	public IOSElement cameraImage;
	
	//SELLER CELL
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[1][@width = '244']")
	public IOSElement sellerCell;
	
	//SELLER TEXT
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[@x <= '31']")
	public IOSElement sellerText;
	
	//HOUSE DETAILS CELL
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[2][@width = '244']")
	public IOSElement houseDetailsCell;
	
	//HOUSE DETAILS TEXT
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[2]/XCUIElementTypeStaticText[@x <= '31']")
	public IOSElement houseDetailsText;
	
	//COMPARABLES CELL
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[3][@width = '244']")
	public IOSElement comparablesCell;
	
	//COMPARABLES TEXT
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[3]/XCUIElementTypeStaticText[@x <= '31']")
	public IOSElement comparablesText;
	
	//COMPARABLE MAP CELL
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[4][@width = '244']")
	public IOSElement comparablesMapCell;
	
	//COMPARABLE MAP TEXT
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[4]/XCUIElementTypeStaticText[@x <= '31']")
	public IOSElement comparablesMapText;
	
	//NEIGHBORHOOD CLASS CELL
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[5][@width = '244']")
	public IOSElement neighbourhoodClassCell;
	
	//NEIGHBORHOOD CLASS TEXT
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[5]/XCUIElementTypeStaticText[@x <= '31']")
	public IOSElement neighbourhoodClassText;
	
	//REPAIRS CELL
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[6][@width = '244']")
	public IOSElement repairsCell;
	
	//REPAIRS TEXT
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[6]/XCUIElementTypeStaticText[@x <= '31']")
	public IOSElement repairsText;
	
	//PHOTOS CELL
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[7][@width = '244']")
	public IOSElement photosCell;
	
	//PHOTOS TEXT
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[7]/XCUIElementTypeStaticText[@x <= '31']")
	public IOSElement photosText;
	
	//MESSAGES CELL
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[8][@width = '244']")
	public IOSElement messagesCell;
	
	//MESSAGES TEXT
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[8]/XCUIElementTypeStaticText[@x <= '31']")
	public IOSElement messagesText;
	
	//PROPERTY ANALYSIS REPORT CELL
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[9][@width = '244']")
	public IOSElement propertyAnalysisReportCell;
	
	//PROPERTY ANALYSIS REPORT TEXT
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[9]/XCUIElementTypeStaticText[@x <= '31']")
	public IOSElement propertyAnalysisReportText;
	
	//LOAN CELL
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[10][@width = '244']")
	public IOSElement loanCell;
	
	//LOAN TEXT
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[10]/XCUIElementTypeStaticText[@x <= '31']")
	public IOSElement loanText;
	
	//HOUSE DETAIL FILLED TICK
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[2]/XCUIElementTypeImage[@x < '244']")
	public IOSElement houseDetailsTick;
	
	//HOUSE DETAILS DEFAULT DASH
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@x>'124' and @x < '244' and preceding::XCUIElementTypeCell[1]]")
	public IOSElement houseDetailsDash;
	
	//COMAPARABLES DASH/AMOUNT
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@x>'120' and @x < '244' and preceding::XCUIElementTypeCell[2]]")
	public IOSElement comparablesAmount;
	
	//NEIGHNORHOOD CLASS DASH/LEVEL
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@x>'166' and @x < '244' and preceding::XCUIElementTypeCell[4]]")
	public IOSElement neighborhoodClassLevel;
	
	//REPAIRS DASH/LEVEL
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@x>'81' and @x < '244' and preceding::XCUIElementTypeCell[5]]")
	public IOSElement repairsAmount;
	
	//PHOTOS DASH/COUNT
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@x>'78' and @x < '244' and preceding::XCUIElementTypeCell[6]]")
	public IOSElement photosCount;
	
	//MESSAGE DASH
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@x>'95' and @x < '244' and preceding::XCUIElementTypeCell[7]]")
	public IOSElement messageDash;
	
	//MESSAGE COUNT
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeCell[7]]")
	public IOSElement messagesCount;
	
	//OFFLINE MESSAGE
	@iOSXCUITFindBy(accessibility="You are currently working offline. Your work will be saved after you connect to the internet.")
	public IOSElement offlineMessage;
	
/****************************************************************************ACTIONS***************************************************************************************/	
	/*METHODS COUNT : 4
	 * 1. clickMenuItem(IOSElement element)
	 * 2. ifContainsPhoto()
	 * 3. checkStatusOfMenuItems(IOSElement element)
	 * 4. checkSelection(IOSElement element)
	 */
/************************************/
	
	/*Method to click left bar menu item.
	 * Parameters : IOSElement(element) 
	 * Returns : true if operation completed and false if not.
	 */
	public boolean clickMenuItem(IOSElement element){
		try{
			if((element.equals(loanText))||(element.equals(loanCell))){
				IOSTouchAction ob = new IOSTouchAction(driver);
				ob.press(0,messagesCell.getLocation().getY()).waitAction(Duration.ofMillis(2)).moveTo(0, photosCell.getLocation().getY()).perform();
				element.click();
				return true;
			}
			else{
				element.click();
				return true;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_Menu, in method - clickMenuItem : "+e);
			return false;
		}
	}
	
	/*Method to check if property contains an image or not.
	 * Parameters : null 
	 * Returns : true if contains a photo and false if not.
	 * NOTE: it does not compares an image, it just checks whether the placeholder consist of any image or not.
	 */
	public boolean ifContainsPhoto(){
		try{
			if(propertyImage.getAttribute("name").equals("emptyStateinLeftBar")){
				return false;
			}
			else{
				return true;
			}
		}
		catch(Exception e){
			System.err.println("");
			return false;
		}
	}
	
	/*Method to check the attribute of valid menu items.
	 * Parameters : IOSElement(element) 
	 * Returns : Integer(Integer for count, -1 for dash, -2 for tick, -3 for wrong input and -4 for exception)
	 */
	public int checkStatusOfMenuItems(IOSElement element){
		try{
			if((element.equals(houseDetailsText))||(element.equals(houseDetailsCell))){
				try{
					if(houseDetailsDash.isDisplayed()){
						return -1;
					}
				}
				catch(Exception e){
					return -2;
				}
			}
			else if((element.equals(comparablesCell))||(element.equals(comparablesText))){
					if(comparablesAmount.getAttribute("name").toString().equals("-")){
						return -1;
					}
					else{
						String amt = comparablesAmount.getAttribute("name").toString();
						int amount = Integer.parseInt(amt);
						return amount;
					}
				}
			else if((element.equals(neighbourhoodClassCell))||(element.equals(neighbourhoodClassText))){
				if(neighborhoodClassLevel.getAttribute("name").toString().equals("-")){
					return -1;
				}
				else{
					String amt = neighborhoodClassLevel.getAttribute("name").toString();
					int amount = Integer.parseInt(amt);
					return amount;
				}
			}
			else if((element.equals(repairsCell))||(element.equals(repairsText))){
				if(repairsAmount.getAttribute("name").toString().equals("-")){
					return -1;
				}
				else{
					String amt = repairsAmount.getAttribute("name").toString();
					amt = amt.substring(1);
					int amount = Integer.parseInt(amt);
					return amount;
				}
			}
			else if((element.equals(photosCell))||(element.equals(photosText))){
				if(photosCount.getAttribute("name").toString().equals("-")){
					return -1;
				}
				else{
					String amt = photosCount.getAttribute("name").toString();
					int amount = Integer.parseInt(amt);
					return amount;
				}
			}
			else if((element.equals(messagesText))||(element.equals(messagesCell))){
				try{
					if(messageDash.isDisplayed()){
						return -1;
					}
				}
				catch(Exception e){
					int amount = Integer.parseInt(messagesCount.getAttribute("name").toString());
					return amount;
				}
			}
				return -3;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_Menu, in method - checkStatusOfMenuItems : "+e);
			return -4;
		}
	}
	
	/*Method to check whether an item is selected or not.
	 * Parameters : IOSElement(element) 
	 * Returns : true if selected and false if not.
	 * NOTE: In this method a screenshot is compared with newly taken one, need to update if there is some sort of changes in UI.
	 */
	public boolean checkSelection(IOSElement element){
		try{
			ExtraFunctionalityCheck.getScreenshots(element);
			String path = "/Users/kiwitech/Desktop/screenshots/";
			if((element.equals(sellerCell))||(element.equals(sellerText))){
				if(ImageClass.image(path+"screenshot.png", path+"PROPERTY MENU/SELECTED/sellerSelected.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"PROPERTY MENU/UNSELECTED/seller.png")==0){
					return false;
				}
			}
			
			else if((element.equals(houseDetailsCell))||(element.equals(houseDetailsText))){
				if(ImageClass.image(path+"screenshot.png", path+"PROPERTY MENU/SELECTED/houseDetailsSelected.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"PROPERTY MENU/UNSELECTED/houseDetails.png")==0){
					return false;
				}
			}
			else if((element.equals(comparablesCell))||(element.equals(comparablesText))){
				if(ImageClass.image(path+"screenshot.png", path+"PROPERTY MENU/SELECTED/comparablesSelected.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"PROPERTY MENU/UNSELECTED/comparables.png")==0){
					return false;
				}
			}
			else if((element.equals(comparablesMapCell))||(element.equals(comparablesMapText))){
				if(ImageClass.image(path+"screenshot.png", path+"PROPERTY MENU/SELECTED/comparablesMapSelected.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"PROPERTY MENU/UNSELECTED/comparablesMap.png")==0){
					return false;
				}
			}
			else if((element.equals(neighbourhoodClassCell))||(element.equals(neighbourhoodClassText))){
				if(ImageClass.image(path+"screenshot.png", path+"PROPERTY MENU/UNSELECTED/neighbourhoodClass.png")==0){
					return false;
				}
			}
			else if((element.equals(repairsCell))||(element.equals(repairsText))){
				if(ImageClass.image(path+"screenshot.png", path+"PROPERTY MENU/SELECTED/repairsSelected.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"PROPERTY MENU/UNSELECTED/repairs.png")==0){
					return false;
				}
			}
			else if((element.equals(photosCell))||(element.equals(photosText))){
				if(ImageClass.image(path+"screenshot.png", path+"PROPERTY MENU/SELECTED/photosSelected.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"PROPERTY MENU/UNSELECTED/photos.png")==0){
					return false;
				}
			}
			else if((element.equals(messagesCell))||(element.equals(messagesText))){
				if(ImageClass.image(path+"screenshot.png", path+"PROPERTY MENU/SELECTED/messagesSelected.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"PROPERTY MENU/UNSELECTED/messages.png")==0){
					return false;
				}
			}
			else if((element.equals(propertyAnalysisReportCell))||(element.equals(propertyAnalysisReportText))){
				if(ImageClass.image(path+"screenshot.png", path+"PROPERTY MENU/SELECTED/propertyAnalysisReportSelected.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"PROPERTY MENU/UNSELECTED/propertyAnalysisReport.png")==0){
					return false;
				}
			}
			else if((element.equals(loanCell))||(element.equals(loanText))){
				if(ImageClass.image(path+"screenshot.png", path+"PROPERTY MENU/SELECTED/loanSelected.png")==0){
					return true;
				}
				else if(ImageClass.image(path+"screenshot.png", path+"PROPERTY MENU/UNSELECTED/loan.png")==0){
					return false;
				}
			}
			throw new Exception("EXCEPTION - NO SCREENSHOT");
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_Menu, in method - checkSelection : "+e);
			return false;
		}
	}
	
}
