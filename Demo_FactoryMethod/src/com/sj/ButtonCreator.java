/**
 * 
 */
package com.sj;

/**
 * @author sangeeta
 *
 */
public class ButtonCreator {
	
	public static Button buttonFactory(String os){
		
	       if (os.equals("Windows"))
	    	   return new WindowsButton();
	        
	           return new MacButton();
	    	
	}

}
