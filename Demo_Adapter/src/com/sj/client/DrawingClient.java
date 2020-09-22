/**
 * 
 */
package com.sj.client;

import com.sj.latest.Circle;
import com.sj.latest.Drawing;
import com.sj.latest.Rectangle;



/**
 * @author sangeeta
 *
 */
public class DrawingClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawing drawing1 = new Drawing();
		drawing1.addShape(new Circle());
		drawing1.addShape(new Rectangle());
       
		drawing1.draw();
	}

}
