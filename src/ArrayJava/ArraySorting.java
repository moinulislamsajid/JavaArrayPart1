package ArrayJava;

import java.util.Arrays;

public class ArraySorting {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {10,-3,18,5,25};
		Arrays.sort(number);
		for(int i =0;i<5;i++) {
			System.out.print(" "+number[i]);
		}
		System.out.print("\n");
		for(int i=4;i>=0;i--) {
			System.out.print(" "+number[i]);

		}
		// String Sorting
		
		String[] names = {"Ayman","Sajid","Mujibur","Rohman"};
		Arrays.sort(names);  // when use any type of data type to sorting need to >> Arrays.sort(variable_Name)
		for(int i =0;i<4;i++) {
			System.out.println();
			System.out.print(" "+names[i]);
		}
		for(int i =3;i>0;i--) {
			System.out.println("\n\n");
			System.out.print(" "+names[i]);
		}
		
		
	}

}
