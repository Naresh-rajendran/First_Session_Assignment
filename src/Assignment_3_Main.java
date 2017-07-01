import java.util.Scanner;
public class Assignment_3_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		byte number1 = 0 , number2 = 0 ;
		System.out.println("Enter two numbers either 0 or 1");
		number1 = inp.nextByte();
		number2 = inp.nextByte();
		
		/*
		 * Write a program in java to compare the truth table of Bitwise AND and Logical AND.
			Hint: - Take two-byte variables and take the input from the user(as 0 0, 0 1, 1 0, 1 1) and 
			show the result for Bitwise AND and Logical AND.
		 */
		
		//Performs the Vaildation so that it will take only 1 or 0
		if (number1 > 1)
		{
			System.out.println("Please Enter Number1 either 1 or 0");
			number1 = inp.nextByte();
		}
		if (number2 > 1)
		{
			System.out.println("Please Enter Number1 either 1 or 0");
			number2 = inp.nextByte();
		}
		//Bitwise AND Manipulation for given two numbers 
		System.out.println("Bitwise AND Operation");
		System.out.println(number1 + " " + number2 + " " +(number1 & number2));
		
		//Logical AND Manipulation for given two numbers
		System.out.println("LOgical AND Operation");
		System.out.println(number1 + " " + number2 + " " +(((number1 > 0) && (number2 > 0)) ? 1 : 0));
		
		inp.close();
		
	}

}
/*
Output : for above program

Enter two numbers either 0 or 1
1
1
Bitwise AND Operation
1 1 1
LOgical AND Operation
1 1 1
*/