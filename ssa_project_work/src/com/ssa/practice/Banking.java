package com.ssa.practice;

import java.util.Scanner;

public class Banking {
	
	String customerName;
	String accountNumber;
	double balance;
	double lastBalance;
	String identityCardNumber;
	
	Scanner sc ;
	
	public Banking(String customerName, String accountNumber, double balance, double lastBalance,
			String identityCardNumber, Scanner sc) {
		super();
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.lastBalance = lastBalance;
		this.identityCardNumber = identityCardNumber;
		this.sc = sc;
	}

	@Override
	public String toString() {
		return "\n Banking [customerName=" + customerName + ", \n accountNumber=" + accountNumber + ",\n balance=" + balance
				+ ", \n lastBalance=" + lastBalance + ",\n identityCardNumber=" + identityCardNumber + "]";
	}


	public void Deposit() {
		System.out.println("Enter Amount to deposit : ");
		double amount = sc.nextDouble();
		this.balance+=amount;
	//	System.out.println("Deposit Amount: " +amount);
	System.out.println("Customer details after deposit : \n" +this.toString());

	}
	

}
