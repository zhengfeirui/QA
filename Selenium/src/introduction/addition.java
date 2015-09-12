package introduction;

import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in); //scanner takes the keyboard input. input is an object of scanner.
		
		int number1;
		int number2;
		int sum;
		System.out.println("Enter first number");
		number1=input.nextInt();
		
	    System.out.println("Enter second number");
	    number2=input.nextInt();
	    
	    sum=number1 + number2;
	    System.out.println("sum is "+ sum);
	    System.out.printf("sum is %d\n", sum);

	}

}
