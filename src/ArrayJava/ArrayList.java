package ArrayJava;

import java.util.Iterator;

public class ArrayList {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Array and Array List Deference
		
		// Array NOt resizeable
		
		// Array list resizeable
		
		
		// Array List
		
		// Declaring Array List
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		// Length of ArrayList
		System.out.println("Size of Array : "+number.size());
		
		// Adding Element
		number.add(20);
		number.add(30);
		number.add(50);
		
		// Adding ELement with index number
		number.add(0,70);
		number.add(1,700);
		number.add(2,070);
		number.add(3,710);
		System.out.print(number);
		System.out.println("Size of array : "+number.size);
		
		// printing with for each loop 
		for(int x : number) {
			System.out.print(" "+x);
		}
		
		// Iterator with printing
		
		Iterator itr = number.iterator;
		while(itr.hasNext()) {  // has next when value are one
			System.out.print(" "+itr.next());
		}
		// Removing ELement
		number.remove(2);
		System.out.println("After Remeove : "+number);
		
		// when remove all element
		
		number.removeAll(number);
		System.out.println(number);
		
		
		// when use clear
		
		number.clear();
		System.out.println("After Clearing : "+number);

		// when list empty than return true
		boolean check = number.isEmpty();
		System.out.println("Than Return : "+check);

		// element retain in list or not this also return true or false
		
		boolean also_Try = 		number.contains(30);
		System.out.println("After Remeove : "+also_Try);  // return true or false when element are retain in list than return true either false
		
		
	// when see any element list but given the index number
		
		int position = number.indexof(40);
		System.out.println("The Index of 40 is : "+position);

		// any element replace for list
		number.set(2,30);
		System.out.println("The Replace value  : "+number);
		
		// to show index number value
		number.get(0);
		System.out.println("Find the value of index (0): "+number);


		


		
		

	}

}
