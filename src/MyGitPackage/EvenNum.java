package MyGitPackage;

import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int i =sc.nextInt();
		if(i%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}

	}

}
