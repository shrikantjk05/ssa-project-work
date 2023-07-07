package com.ssa.practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Welcome to Banking Application");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you Name : ");
		String name = sc.nextLine();
		System.out.println("Enter ID Number : ");
		String Id = sc.nextLine();
		System.out.println("Enter Customer account number : ");
		String accountNumber = sc.nextLine();

		String[] a = { "Deposit       Press A : ", "Withdrawl     Press B : ", 
				       "Transfer      Press c : ","View Balance  Press D : ",
				       "Exit          Press E : " };
		
		for (int i = 0; i <a.length; i++) {
			System.out.println(a[i]);
		}
		/*
		 * System.out.println("Deposit       Press A : ");
		 * System.out.println("Withdrawl     Press B : ");
		 * System.out.println("Transfer      Press c : ");
		 * System.out.println("View Balance  Press D : ");
		 * System.out.println("Exit          Press E : ");
		 */
		Banking D=new Banking(name, accountNumber, 10, 0, Id, sc);
		System.out.println("Press : ");
		String press = sc.next();
		switch (press) {
		case "A":
			
			D.Deposit();
			break;
		case "B":
			System.out.println("Withdrawl     Press B : ");
			break;
		case "C":
			System.out.println("Transfer      Press c : ");
			break;
		case "D":
			System.out.println("View Balance  Press D : ");
			break;
		case "E":
			System.out.println("Exit          Press E : ");
			break;
		}

	}
}
