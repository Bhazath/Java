package com;

public class AccountHolder implements HDFCBank {
	
	@Override
	public void withdraw()
	{
		System.out.println("Withdraw");
	}
	
	@Override
	public void deposit()
	{
		System.out.println("Depsoited");
	}
	
	public static void main(String[] args) {
		AccountHolder acc = new AccountHolder();
	
		acc.deposit();
		acc.withdraw();
	}
}
