package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDuplicatesInArray {
	
	public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,4,5,8,6,3,4,5,6,7,8));
        for (int i=0 ; i<= list.size() ; i++) {
			for (int j = i+1 ; j < list.size() ; j++) {
				if (list.get(i) == list.get(j)) {
					System.out.println(list.get(j));
				}
	}
			}
}

}
