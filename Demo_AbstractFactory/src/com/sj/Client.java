/**
 * 
 */
package com.sj;

/**
 * @author sangeeta
 *
 */
public class Client {

	Button button;
	
	//String os;
	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GUIFactory factory =  Configuration.configure();
		factory.createButton().paint();
		
	}
	
		

}
