package com.qa.java1;

import java.util.*;

public class Exercise2 {
	
	public static void main(String[] args) {
		
		int num1 =0;
		int num2=0;
		char operator;
		int answer = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		num1 = s.nextInt();
		System.out.println("Enter second number: ");
		num2 = s.nextInt();
		System.out.println("Pick an operation to apply addition, subtract, multiplication or divide: " );
		operator = s.next().charAt(0);
		
		switch (operator) {
		case 'a': answer = num1 + num2;
				break;
		case 's': answer = num1 - num2;
				break;
		case 'm': answer = num1 * num2;
				break;
		case 'd': answer = num1 / num2;
				break;
		}
		
		System.out.println(answer);
		}
		
	}
