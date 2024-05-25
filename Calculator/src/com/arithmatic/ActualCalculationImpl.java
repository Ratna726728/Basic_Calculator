package com.arithmatic;

import java.util.Scanner;

public class ActualCalculationImpl implements ActualCalculation{

	Scanner scanner = new Scanner(System.in);
	@Override
	public void addition() {
		System.out.println("How many numbers you want to add :");
		int n = scanner.nextInt();
		//creating an array for storing user input
		float addArr[]= new float[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+i+" number : ");
			addArr[i]=scanner.nextFloat();
		}
		// Print the elements of the array
		System.out.print("Elements in the array:");
		for (int i = 0; i < n; i++) {
			System.out.print(addArr[i] + " ");
		}
		System.out.println();
		//now let's subtract
		float addition= addArr[0];
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
		float subArr[]= new float[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+i+" number : ");
			subArr[i]=scanner.nextFloat();
		}
		// Print the elements of the array
		System.out.print("Elements in the array:");
		for (int i = 0; i < n; i++) {
			System.out.print(subArr[i] + " ");
		}
		System.out.println();
		//now let's subtract
		float subtract= subArr[0];
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
		float multArr[]= new float[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+i+" number : ");
			multArr[i]=scanner.nextFloat();
		}
		// Print the elements of the array
		System.out.print("Elements in the array:");
		for (int i = 0; i < n; i++) {
			System.out.print(multArr[i] + " ");
		}
		System.out.println();
		//now let's multiply
		float multiplication= multArr[0];
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
		float divArr[]= new float[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+i+" number : ");
			divArr[i]=scanner.nextFloat();
		}
		// Print the elements of the array
		System.out.print("Elements in the array:");
		for (int i = 0; i < n; i++) {
			System.out.print(divArr[i] + " ");
		}
		System.out.println();
		//now let's divide
		float division = divArr[0];
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
		System.out.println("Enter the number for finding the Square: ");
		int n = scanner.nextInt();
		System.out.println("The square of the number : "+ (n*n));
	}

	@Override
	public void cube() {
		System.out.println("Enter the number for finding the Cube: ");
		int n = scanner.nextInt();
		System.out.println("The cube of the number : "+ (n*n*n));
	}

	@Override
	public void average() {
		System.out.println("Enter the number for finding the average :");
		int n = scanner.nextInt();
		//creating an array for storing user input
		float aveArr[]= new float[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+i+" number : ");
			aveArr[i]=scanner.nextFloat();
		}
		// Print the elements of the array
		System.out.print("Elements in the array:");
		for (int i = 0; i < n; i++) {
			System.out.print(aveArr[i] + " ");
		}
		System.out.println();
		//now let's find modulus
		float average = aveArr[0];
		for(int i=1; i<n; i++) {
			average += aveArr[i];
		}
		average=(average)/n;
		System.out.println("average of the given numbers : "+average);
	}

	@Override
	public void factors() {
		System.out.println("Enter the number for finding the factors :");
		int n = scanner.nextInt();
	    System.out.println("The number is defined as " + n);
	    System.out.print("The factors of " + n + " are: ");
	    for (int i = 1; i <= n; ++i) {
	       if (n % i == 0) {
	          System.out.print(i + " ");
	       }
	    }
	}

	@Override
	public void evenOdd() {
		System.out.println("Enter the number for finding the number is even or odd :");
		int n = scanner.nextInt();
		if(n%2==0) {
			System.out.println("The number "+n+" is a even number.");
		}
		else {
			System.out.println("The number "+n+" is a odd number.");
		}

	}

}
