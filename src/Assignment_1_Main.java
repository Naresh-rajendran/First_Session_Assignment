import java.util.Scanner;
public class Assignment_1_Main {
//Assignment : Hello World should be displayed on the eclipse console.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name;
		Scanner str = new Scanner(System.in);
		System.out.println("Please enter your name");
		Name = str.next();
		//This will print the Hello World 
		System.out.println("Hello World !!!");
		System.out.println("Hello"+ " " +""+Name + "!!!");
		str.close();

	}

}

/*
Output : 
Please enter your name
Johny 
Hello World !!!
Hello Johny!!!
*/