package primitivecasting;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter No of Elements to be Inserted:");
		int size = scan.nextInt();
		
		int[] a = new int [size];
		
		System.out.println("Enter "+size+" Elements");
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = scan.nextInt();
		}
		
		System.out.println("Array Elemnts are:");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" is present in index position "+i);
		}
		
		
	}
}