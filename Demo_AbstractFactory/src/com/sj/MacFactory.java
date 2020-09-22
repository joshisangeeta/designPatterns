/**
 * 
 */
package com.sj;

/**
 * @author sangeeta
 *
 */
public class MacFactory implements GUIFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}
	

}
