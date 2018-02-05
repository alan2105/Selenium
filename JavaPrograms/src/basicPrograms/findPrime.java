package basicPrograms;

import java.util.Scanner;

//import java.io.InputStream;


public class findPrime {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int input = scan.nextInt();
		scan.close();
		if(checkprime(input))
		{
			System.out.println("Input value " + input + " is a prime number");
		}
		else
		{
			System.out.println("Input value " + input + " is a not prime number");
		}
	}

	

	public static boolean checkprime(int n) {
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i< Math.sqrt(n);i++)
		{
			if(n%1 == 0)
				
				
			{
				return false;
			}
		}
		return true;
	}
	
	 
}

