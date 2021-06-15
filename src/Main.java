import java.util.*;
/*
 * Implement a loop that will call the "fifo" method you created 100 iterations 
 * and pass it an integer random number in the range from 0 to 9, inclusive, as arguments. 
 * The "fifo" method must implement adding items to a buffer with a length of 8 items. 
 * When the buffer length reaches the specified value, the new numbers should replace 
 * the oldest numbers. After each call to the "fifo" method, it is required to print on one 
 * line the current contents of the buffer, the contents sorted in ascending order, and the median value.
 * Expected output in console:
  	[2, 5, 1, 4, 8, 3, 2, 5]-->[1, 2, 2, 3, 4, 5, 5, 8]-->3.5
	[5, 1, 4, 8, 3, 2, 5, 2]-->[1, 2, 2, 3, 4, 5, 5, 8]-->3.5
	[1, 4, 8, 3, 2, 5, 2, 2]-->[1, 2, 2, 2, 3, 4, 5, 8]-->2.5
	[4, 8, 3, 2, 5, 2, 2, 8]-->[2, 2, 2, 3, 4, 5, 8, 8]-->3.5
	[8, 3, 2, 5, 2, 2, 8, 2]-->[2, 2, 2, 2, 3, 5, 8, 8]-->2.5
	[3, 2, 5, 2, 2, 8, 2, 2]-->[2, 2, 2, 2, 2, 3, 5, 8]-->2.0
	[2, 5, 2, 2, 8, 2, 2, 8]-->[2, 2, 2, 2, 2, 5, 8, 8]-->2.0
 * */

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		MyFifo fifoList = new MyFifo(list);
		for (int i = 0; i < 99; i++) {
			fifoList.fifo(fifoList.getRandomNum(0, 10));
		}
		}

}
