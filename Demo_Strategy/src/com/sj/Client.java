/**
 * 
 */
package com.sj;

/**
 * @author sangeeta
 *
 */
public class Client {
    CurrencyConverter converter;
	/**
	 * @param args
	 */
    	
	
	public Client(CurrencyConverter converter) {
		super();
		this.converter = converter;
	}


	public void invokeConversion(double amt){
		
	  double amount=	converter.convertToINR(amt);
	  System.out.println("Amount in INR "+amount);
	}

}
