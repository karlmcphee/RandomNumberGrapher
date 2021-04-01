package randGrapher;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;


/**
 * The BarPlot class is responsible for drawing a plot of a random selection of y-values, updated
 * every second.  The points are illustrated as squares and vertical bars are drawn under each point.
 *
 */
public class BarPlot extends DecoratedPlot {
	
	private Vector<Integer> nums;
	
	/**
	 * Creates the bar graph.
	 * @param nums
	 */
	public BarPlot( Vector<Integer > nums) {
        this.nums = nums;
	}
	
	/** 
	 * Updates the graph with new points.
	 * @param g
	 */
	@Override
	public void operation(Graphics g) {
		  super.operation(g);
		  
		  int n = Math.max(0, nums.size()-10);

		  
	      for (int i = 1; i < Math.min(nums.size(), 10); i++) {
	    	  g.setColor(Color.black);
	    	  g.fillRect(i*40-5, 2*(nums.get(n+i))+5, 10, 200-(2*nums.get(n+1)));
	      }
	  }

}
