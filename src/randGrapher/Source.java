package randGrapher;

import java.util.Observable;
import java.util.Random;
import java.util.Vector;


/**
 * This class generates the numbers for the program's plots.  A vector of ten numbers is sent
 * to observing classes, and repeatedly updated over time by means of a continuously running thread.
 * 
 */
public class Source extends Observable implements Runnable {
	
	private Vector<Integer> nums;
	
	/**
	 * Constructor that launches the thread.
	 */
	
	public Source() {

		    Thread thread = new Thread(this, "hello");
		    thread.start();
		
	}
	
	
	/**
	 * Returns the number array.
	 * @return 
	 */
	public Vector<Integer> getNumbers() {
		
	return nums;
	}

	/**
	 * Constantly running function that generates new random numbers.
	 */
	@Override
	public void run() {
		 Random rand = new Random();
	      nums = new Vector<Integer>();
	      nums.add(rand.nextInt(30));
	      while(1<2) {
	       try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	       nums.add(rand.nextInt(30));
	       setChanged();
	       notifyObservers();
	      }
	}
		

}
