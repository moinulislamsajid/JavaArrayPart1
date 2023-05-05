package ArrayJava;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this each type of loop use loop type conversion
		
		// String 	type array declaring
		String[] names = new String[5];
		names[0] = "Ayman Sajid";
		names[1] = "Samiur Rahman Sakib";
		names[2] = "Mujibur Rahman";
		names[3] = "Rebeka Sultana Pakhi";
		names[4] = "Turhan Ahmad Tarin";
		for(int i =0; i<5;i++) {
			System.out.println(names[i]);
		}
		System.out.print("\n\n");
		String[] family = {"Ayman Sajid","Samiur Rahman Sakib","Mujibur Rahman","Rebeka Sultana Pakhi","Turhan Ahmad Tarin"};
		// for each loop
		for(String hey : family) {
			System.out.println(hey);
		}
		
		// for each loop for integer type
		System.out.print("\n\n");
		int sum=0;
		int[] number = {10,20,30,40};
		for(int num : number) {
			sum = sum + num;
			System.out.println(num);

		}
		System.out.println("Sum of all array character : "+sum);



	}

}
