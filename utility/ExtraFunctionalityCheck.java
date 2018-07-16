package utility;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;



public class ExtraFunctionalityCheck {	
/*********************************************************************METHODS**********************************************************************************************/	
	/*METHODS COUNT: 3
	 * 1. getNumberFromString(String)
	 * 2. getScreenshots(MobileElement element)
	 * 3. wait(MobileElement element, IOSDriver driver) 
	 */
/***************************************************************/	
	
	/*Method to convert a String representation of numbers into Integer.
	 * Parameters : String 
	 * Returns : Integer representation of String else 0 if there is an exception.
	 */
	
	public static int getNumberFromString(String s){
		try{
			if(s.contains(" ")){
		           s= s.substring(0, s.indexOf(" ")); 
		           return Integer.parseInt(s);
		        }    
			return Integer.parseInt(s);
		}
		catch(Exception e){
			System.err.println("Exception in class - ExtraFunctionalityCheck, in method - getNumberFromString :"+e);
			return 0;
		}
	}
	
	/*Method to get screenshot.
	 * Parameters : MobileElement 
	 * Returns : screenshot of the screen in the file destination assigned below.
	 */
	
	public static void getScreenshots(MobileElement element){
		  try{
			File screenshot = element.getScreenshotAs(OutputType.FILE);
			File screenshotLocation1 = new File("/Users/kiwitech/Desktop/screenshots/screenshot.png");
			FileUtils.copyFile(screenshot, screenshotLocation1); 
		  }
		  catch(Exception e){
			  System.err.println("Exception in class - ExtraFunctionalityCheck, in method - getScreenshots :"+e);
		  }
	}
	
	/*Method for explicit wait.
	 * Parameters : MobileElement, IOSDriver 
	 * Returns : null.
	 */
	
	public static void wait(MobileElement element, IOSDriver<MobileElement>driver){
		try{
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		catch(Exception e){
			System.err.println("Exception in class - ExtraFunctionalityCheck, in method - wait :"+e);
		}
		
		
	}

}
