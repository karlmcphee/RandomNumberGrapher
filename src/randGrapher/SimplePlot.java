package randGrapher;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;
import javax.swing.JPanel;

/**
 * The SimplePlot graph generates the base graph for PlotPanel, based on a vector received
 * from the Source class.  These points are continuously generated and update the graph.
 *
 */

public class SimplePlot extends JPanel implements Drawable {
	
	private Vector<Integer> nums;

	/**
	 * Constructor for the graph
	 * @param nums
	 */	
	public SimplePlot( Vector<Integer > nums) {
        this.nums = nums;
	}
	
	/**
	 * Updates the graph
	 */
	public void operation(Graphics g) {
	
		  int n = Math.max(0, nums.size()-10);
	      for (int i = 1; i < Math.min(nums.size(),10); i++) {
	    	  g.setColor(Color.blue);
	    	  g.drawLine((i-1)*40, 2*(nums.get(n+i-1)), i*40, 2*(nums.get(n+i)));

	      }
	  }
	
	      
}
