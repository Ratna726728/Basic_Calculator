package com.arithmatic;

import java.util.Scanner;

public class ActualCalculationImpl implements ActualCalculation{

	Scanner scanner = new Scanner(System.in);
	@Override
	public void addition() {
		System.out.println("How many numbers you want to add :");
		int n = scanner.nextInt();
		//creating an array for storing user input
		int addArr[]= new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+i+" number : ");
			addArr[i]=scanner.nextInt();
		}
		// Print the elements of the array
		System.out.print("Elements in the array:");
		for (int i = 0; i < n; i++) {
			System.out.print(addArr[i] + " ");
		}
		System.out.println();
		//now let's subtract
		int addition= addArr[0];
		for(int i=1; i<n; i++) {
			addition += addArr[i];
		}
		System.out.println("Addition of the given numbers : "+addition);
	}


	@Override
	public void subtraction() {
		System.out.println("How many numbers you want to subtract :");
		int n = scanner.nextInt();
		//creating an array for storing user input
		int subArr[]= new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+i+" number : ");
			subArr[i]=scanner.nextInt();
		}
		// Print the elements of the array
		System.out.print("Elements in the array:");
		for (int i = 0; i < n; i++) {
			System.out.print(subArr[i] + " ");
		}
		System.out.println();
		//now let's subtract
		int subtract= subArr[0];
		for(int i=1;i<n;i++) {
			subtract -= subArr[i];
		}
		System.out.println("Subtraction of the given numbers : "+subtract);
	}

	@Override
	public void multiplication() {
		System.out.println("How many numbers you want to multiply :");
		int n = scanner.nextInt();
		//creating an array for storing user input
		int multArr[]= new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+i+" number : ");
			multArr[i]=scanner.nextInt();
		}
		// Print the elements of the array
		System.out.print("Elements in the array:");
		for (int i = 0; i < n; i++) {
			System.out.print(multArr[i] + " ");
		}
		System.out.println();
		//now let's multiply
		int multiplication= multArr[0];
		for(int i=1; i<n; i++) {
			multiplication *= multArr[i];
		}
		System.out.println("Multiplication of the given numbers : "+multiplication);

	}

	@Override
	public void division() {
		System.out.println("How many numbers you want to division :");
		int n = scanner.nextInt();
		//creating an array for storing user input
		int divArr[]= new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+i+" number : ");
			divArr[i]=scanner.nextInt();
		}
		// Print the elements of the array
		System.out.print("Elements in the array:");
		for (int i = 0; i < n; i++) {
			System.out.print(divArr[i] + " ");
		}
		System.out.println();
		//now let's divide
		int division = divArr[0];
		for(int i=1; i<n; i++) {
			division /= divArr[i];
		}
		System.out.println("division of the given numbers : "+division);

	}

	@Override
	public void modulus() {
		System.out.println("Enter the number for finding the modulus :");
		int n = scanner.nextInt();
		//creating an array for storing user input
		int modArr[]= new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+i+" number : ");
			modArr[i]=scanner.nextInt();
		}
		// Print the elements of the array
		System.out.print("Elements in the array:");
		for (int i = 0; i < n; i++) {
			System.out.print(modArr[i] + " ");
		}
		System.out.println();
		//now let's find modulus
		int modulus = modArr[0];
		for(int i=1; i<n; i++) {
			modulus %= modArr[i];
		}
		System.out.println("modulus of the given numbers : "+modulus);

	}

	@Override
	public void square() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cube() {
		// TODO Auto-generated method stub

	}

	@Override
	public void average() {
		// TODO Auto-generated method stub

	}

	@Override
	public void factors() {
		// TODO Auto-generated method stub

	}

	@Override
	public void evenOdd() {
		// TODO Auto-generated method stub

	}

}
