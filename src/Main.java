import java.util.*;


public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		MyFifo fifoList = new MyFifo(list);
		for (int i = 0; i < 99; i++) {
			fifoList.fifo(fifoList.getRandomNum(0, 10));
		}
		}

}
