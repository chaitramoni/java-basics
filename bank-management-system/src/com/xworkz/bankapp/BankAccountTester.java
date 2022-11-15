package com.xworkz.bankapp;

import com.xworkz.bankapp.bank.BankAccount;
import com.xworkz.bankapp.current.CurrentAccount;
import com.xworkz.bankapp.savings.SavingsAccount;

public class BankAccountTester {
	
	public static void main(String a[])
	{
		BankAccount account = new BankAccount();
		account.deposit(5000);
		account.deposit(7000);
		account.withDraw(1000);
		System.out.println("my account balance is" + account.getBalance());
		
		
		BankAccount friendsAccount = new BankAccount();
		friendsAccount.deposit(700);
		friendsAccount.deposit(4000);
		System.out.println("The Friends account balance is" + friendsAccount.getBalance());
		
		account.transfer(500.00 , friendsAccount);
		
		System.out.println("The my account balance is" + account.getBalance());
	
		System.out.println("The Friends account balance is" + friendsAccount.getBalance());
		
		
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.deposit(3000);
		System.out.println("savingsAccount balance is" + savingsAccount.getBalance());
		savingsAccount.withDraw(1000);
		System.out.println("savingsAccount balance is" + savingsAccount.getBalance());
		
		SavingsAccount momsAccount = new SavingsAccount();
		momsAccount.deposit(1000);
		savingsAccount.transfer(500, momsAccount);
		System.out.println("savingsAccount balance is" + savingsAccount.getBalance());
		System.out.println("momsAccount balance is" + momsAccount.getBalance());
		
		
		CurrentAccount currentAccount = new CurrentAccount();
		currentAccount.deposit(3000);
		System.out.println("currentAccount balance is" + currentAccount.getBalance());
		currentAccount.withDraw(1000);
		System.out.println("currentAccount balance is" + currentAccount.getBalance());
		
		CurrentAccount dadsAccount = new CurrentAccount();
		momsAccount.deposit(1000);
		currentAccount.transfer(500, dadsAccount);
		System.out.println("currentAccount balance is" + currentAccount.getBalance());
		System.out.println("dadsAccount balance is" + dadsAccount.getBalance());

		SavingsAccount savingsAccount2 = new SavingsAccount();
		savingsAccount2.interestRate = 0.7;
		savingsAccount2.deposit(1000);
		System.out.println(savingsAccount2.getBalance());
		savingsAccount2.periodicInterest();
		System.out.println(savingsAccount2.getBalance());
		
	}

}
