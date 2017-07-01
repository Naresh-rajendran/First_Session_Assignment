import java.util.Scanner;
public class Assignment_2_Main {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Write a program to print the sum of two numbers without using + operator. Other operators have to be used.
		 Note: Take care of CamelCase naming conventions.
		 */
		int number_1 = 0 , number_2 =0, sum = 0;
		Scanner in = new Scanner(System.in);
		Add num = new Add();
		System.out.println("Please Enter Two Number for addition");
		number_1 = in.nextInt();
		number_2 = in.nextInt();
		System.out.println("The numbers you have entered are "+ +number_1 +" and "+  +number_2 );
		
		sum = num.addition(number_1, number_2);
		
		System.out.println("The Sum of two numbers"+" "+ +number_1 +" and "+  +number_2 + " is " +sum);
		
		in.close();	 
	}
	
}
class Add
{
	//The BitWise XOR and looping till the Number is not equal to Zero , so it will perform Addition 
	int addition(int number1 ,int number2)
	{
		int carry = 0;
		
		while (number2 != 0)
		{
			
		carry = number1 & number2 ; 
		
		number1 ^= number2; 
		
		number2 = carry << 1;
		}
		
		return number1;
	}
}
/*

Output : 

Please Enter Two Number for addition
1
7
The numbers you have entered are 1 and 7
The Sum of two numbers 1 and 7 is 8

*/