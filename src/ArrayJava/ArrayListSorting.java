package ArrayJava;

import java.util.Collections;
import java.util.collections;

public class ArrayListSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array List Sorting
		ArrayList<Integer> number = new ArrayList<>();
		
		number.add(10);
		number.add(-3);
		number.add(18);
		number.add(92);
		number.add(0);
		number.add(2);


		
		System.out.print("Before Sorting : "+number);
		
		// ArrayList Sorting
		
	
		collections.sort(number); // when small to big collections
		System.out.print("After Sorting asending : "+number);
		
		// when sorting big to small
		
		collections.sort(number,Collections.reverseOrder());
		System.out.print("After Sorting descending : "+number);
		
	

		
		


		

		
	}

}
