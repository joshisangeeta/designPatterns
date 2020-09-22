/**
 * 
 */
package com.sj.latest;

import java.util.ArrayList;

/**
 * @author sangeeta
 *
 */
public class Drawing {
	
	 ArrayList<TwoDShape> shapes ;
	 
	 
	 
	 
	 public Drawing() {
		super();
		// TODO Auto-generated constructor stub
	    shapes = new ArrayList<>();
	 
	 }



	public void addShape(TwoDShape shape) {
		    shapes.add(shape);
      }
	
	  
	 
     public void draw(){
    	 
    	 for(TwoDShape s:shapes){
    		 s.draw();
    	 }
     }
}
