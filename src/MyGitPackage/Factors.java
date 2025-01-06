package MyGitPackage;

import java.util.Scanner;

public class Factors {
	public static void main(String args[])
	{
		int fact = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int x=sc.nextInt();
		for(int i=x; i>0;i--)
		{
		  fact=fact*i;
		}
		System.out.println("Factorial of number: "+fact);
	}

}
