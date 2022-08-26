package com.bank;

import java.util.Scanner;

public class BankInfo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int operation;
		String stayInMenu = "yes";
		
		System.out.println("\n * * * Welcome To our Banking System * * * ");
		System.out.println("==================================================");
		
		SavingAccount sa = new SavingAccount(1000,5);
		
		while(stayInMenu.equalsIgnoreCase("yes")) {
			System.out.println("\nMenu : ");
			
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit Amount");
			System.out.println("3. Withdraw Amount");
			
			System.out.println("\nChoose the Operation : ");
			operation = sc.nextInt(); 
			
			switch(operation) {
			case 1 : sa.balanceCheck();
			break;
			
			case 2 : double depositAmount;
				System.out.println("\nEnter the amount to deposit : ");
				depositAmount = sc.nextDouble(); 
				sa.deposit(depositAmount);
				sa.balanceCheck();
			break;
			
			case 3 : double withdrawAmount;
				System.out.println("\nEnter the amount to withdraw : ");
				withdrawAmount = sc.nextDouble(); 
				sa.withdraw(withdrawAmount);
				sa.balanceCheck();
			break;
			
			default: System.out.println("Wroung Operation...");
			break;
			}
			
			System.out.println("\nDo you want to stay in menu : ");
			stayInMenu = sc.next();
			
		}
		
		
	}

}
