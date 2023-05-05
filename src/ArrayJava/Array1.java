package ArrayJava;

public class Array1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaring and creation in 2 step
		//int[] arr;
		//arr = new int[10];
		
		// in java when use array than first time need to way declaring array than use same variable name to creation array size
		
		// declaring and creation in 1 step or 1 line
		
		int[] number = new int[5];
		
		// array initialization
		number[0]= 10;
		number[1]= 100;
		number[2]= 001;
		number[3]= 0001;
		number[4]= 1000;
		
		// Array Printing
		
		System.out.println(number[4]);
		
		// Array Length
		int len;
		len = number.length;
		System.out.print("Length of array : "+len);
		
		
		/*int length=0;
		for(int i=0;number[i]!='\0';i++) {
			length++;
			

		}
		System.out.println();
		System.out.println("Length of array : "+length);
		*/
		
		// general format of addition
		
		int sum;
		sum = number[0] + number[1] + number[2] + number[3] + number[4];
		System.out.println("\nSum of all Array : "+sum);
		
		


		


		

		
		

}
}
