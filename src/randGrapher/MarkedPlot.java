package randGrapher;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;


/**
 * The MarkedPlot class decorates the second graph on the main menu, using numbers generated
 * from a source class to draw squares around the points of the original graph made in SimplePlot.
 * 
 */
public class MarkedPlot extends DecoratedPlot {
	
	Vector<Integer> nums;
	
	
	/**
	 * Constructor for the graph decorator.
	 * 
	 * @param nums
	 */
	public MarkedPlot( Vector<Integer > nums) {
        this.nums = nums;
	}
	
	/**
	 * Updates the graph.
	 */
	@Override
	public void operation(Graphics g) {
		  super.operation(g);
		  
		  int n = Math.max(0, nums.size()-10);
	
	      for (int i = 1; i < Math.min(nums.size(), 10); i++) {
	    	  g.setColor(Color.blue);
	    	  g.fillRect((i)*40-5, 2*(nums.get(n+i))-5, 10, 10);
	      }
	  }

}
