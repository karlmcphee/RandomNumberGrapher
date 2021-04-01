package randGrapher;

import java.awt.Graphics;

/**
 * The DecoratedPlot class serves as the parents of the graph classes and sets them up to use
 * components to combine graphical operations.
 *
 */

public class DecoratedPlot implements Drawable {
	
	protected Drawable component;
	
	/**
	 * Sets the component for a graphical object.
	 * 
	 * @param component
	 */
	public void setComponent(Drawable component) {
		this.component = component;
	}
	
	/**
	 * Performs the operation for the set component, allowing the operations of multiple objects to be
	 * executed at once.
	 */
	@Override
	public void operation(Graphics g) {
		  if(component!= null) {
			  component.operation(g);
		  }
	  }

}
