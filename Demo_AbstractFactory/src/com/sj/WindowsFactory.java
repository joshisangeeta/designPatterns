/**
 * 
 */
package com.sj;

/**
 * @author sangeeta
 *
 */
public class WindowsFactory  implements GUIFactory { 

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}

}
