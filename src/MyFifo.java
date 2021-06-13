import java.util.*;


public class MyFifo {
	
	LinkedList<Integer> list = new LinkedList<Integer>();
	
	MyFifo(LinkedList<Integer> list){
		this.list = list;
	}
	
//----------Generate view string of Method fifo
	
	public void fifo( int element ) {
		LinkedList<Integer> sortList = new LinkedList<Integer>(List.of(0, 0, 0, 0, 0, 0, 0, 0));
		String strResult ="";
		Double dLowValue = 0.0;			//Lower Score of Median
		Double dUpValue = 0.0;			//Upper Score of Median
	 
		if ( list.size() == 8) {
			 Collections.copy(sortList, list);
			 Collections.sort(sortList);
			 strResult = list + "-->" + sortList;
			 dLowValue = sortList.get(3).doubleValue();
			 dUpValue = sortList.get(4).doubleValue();
			 if	(dUpValue==dLowValue) {
				 strResult = strResult + "-->" + Double.toString( dLowValue ) ;
			 } else {
				 strResult = strResult + "-->" + Double.toString( dLowValue+(dUpValue-dLowValue) / 2.0 );
				}
			System.out.println( strResult );
			list.removeFirst();
			list.addLast(element);
			} else	{
				list.addLast(element);
				}
	}

//----------Generate Random range
	
	public int getRandomNum(int min, int max) {
		return (int) (Math.random() * (max - min) + min);
		
	}
	
}

