package ArrayJava;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> number1 = new ArrayList<>();
		ArrayList<Integer> number2 = new ArrayList<>();
		ArrayList<Integer> number3 = new ArrayList<>();

		number1.add(10);
		number1.add(20);
		number1.add(30);
		number1.add(40);
		System.out.println("Number 1 = "+number1);
		
		number2.add(50);
		number2.add(60);
		number2.add(70);
		number2.add(80);
		System.out.println("Number 2 = "+number2);

		
		number3.add(90);
		number3.add(100);
		number3.add(110);
		number3.add(120);
		//System.out.println("Number 3 = "+number3);
		number3.addAll(number1);
		System.out.println("Number 3 = "+number3);

		// equal list
		boolean result = number1.equals(number2);
		System.out.println("When They are true or False : "+result);
		
		
		
		






	}

}
