package ArrayJava;

import java.util.Scanner;

public class ArrayMatrix {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[][] A = new int [2][3];
		int[][] B = new int [2][3];
		int[][] Sum = new int [2][3];
		
		// user input for A Matrix
		System.out.print("Enter the value for row and column : ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				A[i][j] = input.nextInt();
			}
		}
		
		// printing A Matrix
		System.out.println("A = ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(" "+A[i][j]);
			}
			System.out.println();
		}

		// user input for B Matrix
				System.out.print("Enter the value for row and column : ");
				for(int i=0;i<2;i++) {
					for(int j=0;j<3;j++) {
						B[i][j] = input.nextInt();
					}
				}
				
				// printing B Matrix
				System.out.println("B = ");
				for(int i=0;i<2;i++) {
					for(int j=0;j<3;j++) {
						System.out.print(" "+B[i][j]);
					}
					System.out.println();
				}
				// Addition 2 matrix

				// Addition 2 matrix
						for(int i=0;i<2;i++) {
							for(int j=0;j<3;j++) {
								Sum[i][j]= A[i][j]+B[i][j];
							}
						}

						// printing Addition
								System.out.print("Sum = ");
								for(int i=0;i<2;i++) {
									for(int j=0;j<3;j++) {
										System.out.print(" "+Sum[i][j]);
									}
									System.out.println();
								}
		

	}

}
