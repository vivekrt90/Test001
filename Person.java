package Package1;

import java.util.Scanner;

public class Person {
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter your age: ");
		int initialAge=scan.nextInt();
	if(initialAge<0)
	{
		initialAge=0;
		System.out.println("Age is not valid, setting age to 0");
	}
	
	if(initialAge<13)
	{System.out.println("You are Young");

	}
	else if(initialAge>=13 && initialAge<19)
	{
		System.out.println("You are a Teenager");
	}
	else {System.out.println("You are old");
	}
}
}
