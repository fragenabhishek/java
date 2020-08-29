package com.fragen.userInput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		System.out.println("Enter your Roll No.");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		//System.out.println(a);
		System.out.println("Enter your Name");
		char c=sc.next().charAt(0); 	//only take first character of name
		System.out.println("Your code is :"+a+c);
		
	}

}
