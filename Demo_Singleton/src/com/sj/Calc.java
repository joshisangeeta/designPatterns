/**
 * 
 */
package com.sj;

/**
 * @author sangeeta
 *
 */
public class Calc {

	static Calc calc;
	static int ctr;
	private Calc() {
		super();
		// TODO Auto-generated constructor stub
		ctr++;
	}
	

     public static Calc getCalc(){
    	 
        if (calc== null)       
        	
        	calc =new Calc();
              
          return calc;
        
     }
     
     public static void showCount(){
    	 System.out.println("Number of objects created:"+ctr);
     }
      
  }
