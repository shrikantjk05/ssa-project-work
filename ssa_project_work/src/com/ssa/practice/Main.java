package com.ssa.practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Banking Application");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter you Name : ");
		String name = sc.nextLine();
  		System.out.println("Enter Customer account number : ");
    	String accountNumber = sc.nextLine();
    	System.out.println("Enter Debitcard number : ");
        String debitcardnumber= sc.nextLine();
	}
}
