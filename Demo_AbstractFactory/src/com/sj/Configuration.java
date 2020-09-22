/**
 * 
 */
package com.sj;

/**
 * @author sangeeta
 *
 */
public class Configuration {
	
	public static GUIFactory configure(){
		
		
		String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) 
            return new MacFactory();
            
        else 
            return new WindowsFactory();
            
        
    }
}
