package utility;
import java.io.File;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import io.appium.java_client.MobileElement;



public class ExtraFunctionalityCheck {
	
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

}
