/**
 * 
 */
package com.sj;

/**
 * @author sangeeta
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c1 ;
		String currencyType ="GBP";
		double amount = 500;
		if(args.length>0)
		 currencyType = args[0];
		if(currencyType.equals("Dollar"))
		  c1= new Client(new DollarConverter());
		else		
		  c1 = new Client(new GBPConverter())	;
		c1.invokeConversion(amount);
	}

}
