package com.xworkz.bankapp.bank;

public class BankAccount {
	
	public String name;
	public String ifscCode;
	public String branchName;
	public String accountNo;
	
	private double balance;
	
	public BankAccount()
	{
		System.out.println(" bank account object is created");
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public double withDraw(double balance)
	{
		this.balance = this.balance - balance;
		return this.balance;
		
	}
	
	public double deposit(double balance)
	{
		this.balance =this. balance + balance;
		return this.balance;
	}	
	
	
	public void transfer(double amount , BankAccount friendsAccount)
	{
	System.out.println("Transffering to friends account");
	withDraw (amount);
	friendsAccount.deposit(amount);
	System.out.println("Transffering done.....Transcation successfull");
		
	}
	

}
