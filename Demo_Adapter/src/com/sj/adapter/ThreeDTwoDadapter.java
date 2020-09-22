/**
 * 
 */
package com.sj.adapter;

import com.sj.existing.ThreeDShape;
import com.sj.latest.TwoDShape;

/**
 * @author sangeeta
 *
 */
public class ThreeDTwoDadapter implements TwoDShape {
 
    ThreeDShape  adaptee;
		   
	public ThreeDTwoDadapter(ThreeDShape adaptee) {
		super();
		this.adaptee = adaptee;
	}
   
    	/* (non-Javadoc)
	 * @see com.sj.latest.TwoDShape#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
           adaptee.drawShape();
	 }

}
