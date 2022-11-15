package com.xworkz.bankapp.savings;

import com.xworkz.bankapp.bank.BankAccount;

public class SavingsAccount  extends BankAccount {
	
	public double newBalance;
	public double interestRate;
	
	/*public double periodicInterest(double amount, double interest)
	{
	this.newBalance = newBalance + (amount*interest);
	return newBalance;
	}*/
	
	/*public SavingsAccount(double interestRate)
	{
	this.interestRate = interestRate;	
	}*/
	
	public SavingsAccount()
	{
		System.out.println("savings account object is created");
	}
	
	public void periodicInterest()
	{
		double newBalance =getBalance() * interestRate/100;
		deposit(newBalance);
		
	}

}

