package com;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Demo d = new Demo();
		
		for(int i=1; i<=4; i++)
		{
			System.out.println("Enter Number: ");
			int num = scan.nextInt();
			d.checkEvenOrOdd(num);
			System.out.println("--------");
		}
		scan.close();
	}

}
