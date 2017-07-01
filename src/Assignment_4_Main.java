import java.util.Scanner;

public class Assignment_4_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte number_byte = 0;
		short number_short = 0;
		int number_int = 0;
		long number_long = 0 ;
		float number_float = 0; 
		double number_double = 0; 
		
		Scanner inp = new Scanner(System.in);
		/*
		 * Write a program in java to implement type casting between different variables.
		 * Take six variables as one of each byte, short, int, long, float and double.
		 * Initialize only byte and short asking the value from the user.
		 * Take byte & short variables and store their sum in the integer variable and 
		 * print the sum and then take short and int and store their addition in a long variable and now take an int and long and so on.
		 */
		System.out.println("Enter two numbers");
		number_byte = inp.nextByte();
		number_short = inp.nextShort();
		//Taking Two input in two different primitive data types and converting to another primitive data types and adding soon..
		number_int = number_byte + number_short ; 
		System.out.println("Addtion of Byte and Short numbers stored in Integer: " +number_int);
		
		number_long = number_int + number_short ;
		System.out.println("Addtion of Int and Short numbers stored in Long    : " +number_long);

		number_float = number_long + number_int ;
		System.out.println("Addtion of Int and Long numbers stored in Float    : " +number_float);
		
		number_double = number_long + number_float ;
		System.out.println("Addtion of Int and Long numbers stored in Double   : " +number_double);
		
		inp.close();
	}

}

/*
Output : 
Enter two numbers
5
4
Addtion of Byte and Short numbers stored in Integer: 9
Addtion of Int and Short numbers stored in Long    : 13
Addtion of Int and Long numbers stored in Float    : 22.0
Addtion of Int and Long numbers stored in Double   : 35.0

*/