package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class MissingElementInanArray {
	
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,5,7,6,8));
		Collections.sort(list);
		System.out.println(list);
		for (int i = 1; i < list.size() ; i++) {
			if(i != list.get(i-1)) {
				System.out.println(i);
				break;
			}
		}
	}

	
	
	
	

}
