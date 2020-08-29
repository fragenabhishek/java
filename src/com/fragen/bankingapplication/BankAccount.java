package com.fragen.bankingapplication;

import java.util.Scanner;
////class for acccount details
public class BankAccount {
	int balance;
	int previousTranction;
	String CustomerName;
	String CustomerId;
	
	BankAccount(String name,String Id,int bal){
		CustomerName=name;
		CustomerId=Id;
		balance=bal;
	}
	
	void deposit(int amount) {
		if(amount!=0) {
			balance=balance+amount;
				previousTranction=amount;
		}
	}
	
	void withdraw(int amount) {
		if(amount>0) {
			balance=balance-amount;
			previousTranction=-amount;
		}
	}
	
	void previous() {
		if(previousTranction>0) {
			System.out.println("Deposite: "+previousTranction);
		}else if(previousTranction<0) {
			System.out.println("Withdraw: "+Math.abs(previousTranction));
		}else {
			System.out.println("no tranction");
		}
	}
	
	void show() {
		char option='\0';
		
		System.out.println("Welcome "+CustomerName);
		System.out.println("your id: "+CustomerId);
		System.out.println("==========================================");
		
		System.out.println("A for balance check");
		System.out.println("B for withdraw");
		System.out.println("C for deposit");
		System.out.println("D for previous tranction");
		System.out.println("E for exit");
		
		System.out.println("==========================================");
		do {
			System.out.println("Enter your options");
			Scanner sc =new Scanner(System.in);
			 option=sc.next().charAt(0);
			switch(option) {
			
			case 'A':
				System.out.println("==========================================");
				System.out.println("balance :"+balance);
				System.out.println("==========================================");
				break;
				
			case 'B':
				System.out.println("enter amount to withdraw");
				System.out.println("==========================================");
				int amount1=sc.nextInt();
				withdraw(amount1);
				System.out.println("==========================================");
				System.out.println("balance :"+balance);
				break;
			case 'C':
				System.out.println("Enter amount to deposit");
				int amount2=sc.nextInt();
				deposit(amount2);
				System.out.println("==========================================");
				System.out.println("balance :"+balance);
				break;
			case 'D':
				previous();
				break;
				
			case 'E':
				System.out.println("EXIT");
				System.out.println("==========================================");
				System.out.println("==========================================");
				break;
				default:
					System.out.println("invalid option,please enter again");
					System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					break;		
			
			}
		}
		while(option!='E');
		System.out.println("==========================================");
		System.out.println("Thank you for banking");
		System.out.println("==========================================");
		
	}
}
