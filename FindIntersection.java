package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FindIntersection {
	
	
	public static void main(String[] args) {
		  //int[] arr1 = {3,2,11,4,6,7};
		  //int[] arr2 = {1,2,8,4,9,7};               //o/p = {2,4,7}
		  
		  List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		  List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(3,2,8,4,11,7));
		  List<Integer> list3 = new ArrayList<Integer>();
		  
		  for (int i = 0; i < list1.size() ; i++) 
		  {
			  for (int j= 0 ; j< list2.size(); j++)
			  {
				  if(list1.get(i) == list2.get(j))		
				  {
					  list3.add(list1.get(i));			 		 
			  }
				  }
		
		  }
		  
		  System.out.println(list3);
				  }

	
	
	

}
