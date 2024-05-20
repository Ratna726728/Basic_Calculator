package com.calculatormain;

import java.util.Scanner;

public class ApplicationFront extends OptionChoiceImpl{
	
	
	public static void startPage() {
		System.out.println("Welcome to console based Calculator Application");
		System.out.println();
		System.out.println("Please choose option numbers to perform calculation on the method which you desired!!");
		System.out.println();
		optionList();
	}
	public static void optionList() {
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulus");
		System.out.println("6. Square");
		System.out.println("7. Cube");
		System.out.println("8. Average");
		System.out.println("9. Factors");
		System.out.println("10. Find out the given number is even or odd");
		System.out.println();
	}

}
