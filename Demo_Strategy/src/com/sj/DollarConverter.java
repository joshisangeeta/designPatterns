/**
 * 
 */
package com.sj;

/**
 * @author sangeeta
 *
 */
public class DollarConverter implements CurrencyConverter {

	/* (non-Javadoc)
	 * @see com.sj.CurrencyConverter#convertToINR(double)
	 */
	@Override
	public double convertToINR(double amt) {
		// TODO Auto-generated method stub

		System.out.println("Converting dollars to INR");
              return amt*72;
	}

}
