package utility;
import java.util.ArrayList;

import io.appium.java_client.MobileElement;



public class ExtraFunctionalityCheck {
	
	public static ArrayList<MobileElement> isClickable(ArrayList<MobileElement> elementList){
		ArrayList<MobileElement> notClickable = new ArrayList<MobileElement>();
		try{		
			for(int i=0; i<elementList.size();i++){
				if((elementList.get(i).getAttribute("type").equals("XCUIElementTypeImage"))||(elementList.get(i).getAttribute("type").equals("XCUIElementTypeStaticText")))
					{
						notClickable.add(elementList.get(i));
					}
				}
			}
			catch(Exception e){
				System.err.println("Exception in class - ExtraFunctionalityCheck, in method - isClickable :"+e);
			}
		return notClickable;		
	}

	public static ArrayList<MobileElement> checkElements(ArrayList<MobileElement> elementList){
		boolean check = true;
		ArrayList<MobileElement> notDisplayed = new ArrayList<MobileElement>();
		try{
			for(int i=0; i< elementList.size();i++){
				check = ((check)&&(elementList.get(i).isDisplayed()));
				if(check == false){
					notDisplayed.add(elementList.get(i));
					check = true;
				}
			}	
		}
		catch(Exception e){
			System.err.println("Exception in class - ExtraFunctionalityCheck, in method - checkElements :"+e);
		}
		return elementList;
	}
	
	public static boolean statusBarCheck(){
		
		
		return false;
	}
}
