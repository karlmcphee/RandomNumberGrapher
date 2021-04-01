package randGrapher;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 * The PlotPanel class is the panel used to hold an individual graph.  The painting function
 * is regularly updated and passed on to the three plot classes for individual paint operations.
 * 
 */
public class PlotPanel extends JPanel implements Observer {

	private int type;
	private Vector<Integer> nums;
	
	
	/**
	 * Constructor for the graph panels.
	 * @param type
	 */
    public PlotPanel(int type) {
        setBorder(BorderFactory.createLineBorder(Color.black));
        this.setBackground(Color.white);
        this.type = type;
        nums = new Vector<Integer>();
        for(int i = 0; i < 10; i++) {
        	nums.add(0);
        } 
    }
    
    /**
     * The function which paints the graphs of the three plots.  The painting operation is
     * passed to each plot class. 
     */
    protected void paintComponent(Graphics g) {
	      super.paintComponent(g);
	      if(type == 2) {
	    	  setBackground(Color.lightGray);
	    	  MarkedPlot markedPlot = new MarkedPlot(nums);
	    	  SimplePlot plot = new SimplePlot(nums);
	    	  markedPlot.setComponent(plot);
	    	  if(nums.get(0)!= 0) {
	    	  markedPlot.operation(g);
	    	  }
	      } else if(type == 1) {
	    	  BarPlot barPlot = new BarPlot(nums);
	    	  setBackground(Color.white);
	    	  MarkedPlot markedPlot = new MarkedPlot(nums);
	    	  SimplePlot plot = new SimplePlot(nums);
	    	  markedPlot.setComponent(plot);
	    	  barPlot.setComponent(markedPlot);
	    	  if(nums.get(0)!= 0) {
	    	  barPlot.operation(g);
	    	  }
	      }
	      else {
	    	  setBackground(Color.gray);
	    	  SimplePlot plot = new SimplePlot(nums);
	    	  plot.operation(g);
	      	}
    }
	      
    /**
     * Updates the graphs when notified that a new number has been generated.
     */
	  	public void update(Observable o, Object arg) {
			nums = ((Source)o).getNumbers();
			repaint();
		}     
	      
    }
