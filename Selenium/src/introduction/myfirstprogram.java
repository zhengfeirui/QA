package introduction;

import java.util.Scanner;

public class myfirstprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		String name1;
		String name2;
		int age;
		System.out.println("Enter first name");
		name1=input.nextLine();
		
		System.out.println("enter last name");
		name2=input.nextLine();
		
		System.out.println("Enter age");
		age=input.nextInt();
		
		System.out.println("the age of " + name1 +" "+ name2 +" is " +age+ " years");
		
		
		

	}

}
