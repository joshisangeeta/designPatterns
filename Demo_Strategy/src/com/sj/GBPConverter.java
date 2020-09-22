/**
 * 
 */
package com.sj;

/**
 * @author sangeeta
 *
 */
public class GBPConverter implements CurrencyConverter {

	/* (non-Javadoc)
	 * @see com.sj.CurrencyConverter#convertToINR()
	 */
	@Override
	public double convertToINR(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Converting pounds to INR");
		return  amt*92;
	}

}
