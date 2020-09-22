/**
 * 
 */
package com.sj;

/**
 * @author sangeeta
 *
 */
public class Client {

	//String os;
	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button button;
		 if(args.length>0)
	     button  =	ButtonCreator.buttonFactory(args[0]);
		 else
		 button = ButtonCreator.buttonFactory("Windows");
		
		 button.paint();
	
	}
	
	
	/*public Client(String os) {
		super();
		this.os = os;
	}*/


}
