package ArrayJava;

import java.util.Scanner;

public class ArrayUseingLOOP {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num;
		System.out.print("How Many Size : ");
		num = input.nextInt();
		double[] number = new double[10];
		for(int i=0;i<=num;i++) {
			number[i] = input.nextDouble();
		}
		double sum=0;
		double avg=0;
		for(int i=0;i<=number[i];i++) {
			sum = sum + number[i];
			avg = sum/number[i];
		}
		System.out.println("The Sum of Arrays : "+sum);
		System.out.println("The Sum of Arrays : "+avg);

		

	}

}
