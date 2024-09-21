package com;

public class Solution {
		
	public static void main(String[] args) {
		
		Father f =  new Son();

		if(f instanceof Son)
		{
			System.out.println("Downcasting to Son");
			Son s = (Son) f;
			System.out.println(s.x+" "+s.y);
		}
		else if(f instanceof Doughter)
		{ 
			System.out.println("Downcasting to Daughter");
			Doughter d = (Doughter) f;
			System.out.println(d.x+" "+d.z);
		}
	}
}
