package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class FindSecondLargest {
	
	public static void main(String[] args) {
		//int[] data = {3,2,11,4,6,7};
		
		List<Integer>  list = new ArrayList<Integer>();
		 list.add(3);
		 list.add(2);
		 list.add(11);
		 list.add(4);
		 list.add(6);
		 list.add(7);
		 Collections.sort(list);
		 System.out.println(list);
		 System.out.println(list.get(4));
		 
		 }

	
	
	

}
