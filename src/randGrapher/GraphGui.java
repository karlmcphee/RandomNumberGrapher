package randGrapher;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * The GraphGui class sets up a panel where three plots are drawn when the button on the
 * of the screen are clicked.  Each plot is the same graph, but the second has its points
 * as large squares and the third has both this feature and bars drawn under each graph.
 * Each plot is redrawn with a new random value at the end every second. 
 * 
 * @author Karl McPhee
 *
 */
public class GraphGui extends JFrame {
	
	/**
	 * Constructor for the main panel.  Sets up all the subpanels, the button and the observer
	 * relationships.
	 */
	
	public GraphGui () {
		
        super();
        JPanel contentPane = new JPanel(new GridLayout(4, 1));
		setSize(600, 600);
		PlotPanel item1 = new PlotPanel(1);
		contentPane.add(item1);
		PlotPanel item2 = new PlotPanel(2);
		contentPane.add(item2);
		PlotPanel item3 = new PlotPanel(3);
		contentPane.add(item3);
		JButton button1 = new JButton("Run");
		button1.addActionListener(new ActionListener() {

	            @Override
				public void actionPerformed(ActionEvent e) {
	            	Source source = new Source();
	            	source.addObserver(item1);
	            	source.addObserver(item2);
	            	source.addObserver(item3);

	}
		});
		
		contentPane.add(button1);
		add(contentPane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/**
	 * Creates the main panel.
	 * @param args
	 */
	public static void main(String args[])  {
		GraphGui gui = new GraphGui();
		gui.setSize(500, 500);
		gui.setVisible(true);
	}

}
