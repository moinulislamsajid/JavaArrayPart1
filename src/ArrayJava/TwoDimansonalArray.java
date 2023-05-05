package ArrayJava;

public class TwoDimansonalArray {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaring two dimensional array
		
		int[][] number = new int [2] [3]; // here 10 row and 12 column
		
		// two D array initlization 
		number[0][0]=10;
		number[0][1]=20;
		number[0][2]=30;
		number[1][0] =50;
		number[1][1]=60;
		number[1][2]=70;
		System.out.println(number[0][2]);
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(" "+number[i][j]);
			}
			System.out.println();
		}
		
		

	}

}
