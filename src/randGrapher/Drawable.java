package randGrapher;

import java.awt.Graphics;

/**
 * This class acts as an interface for the Decorator pattern implemented in this project.
 *
 */
public interface Drawable {
	
	/**
	 * Method for setting decorated components to be inherited.
	 * 
	 * @param g
	 */
	  default void operation(Graphics g) {
		  
	  }

}
