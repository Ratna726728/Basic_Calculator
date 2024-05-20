package com.arithmatic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ActualCalculationImpl implements ActualCalculation{

	Scanner scanner = new Scanner(System.in);
	@Override
	public void addition() {
		System.out.println("How many numbers you want to add :");
		int n = scanner.nextInt();
		HashSet<Integer> hashSet = new HashSet<>();
		System.out.println("Enter the numbers: ");
		for (int i = 1; i <= n ;i++) {
			hashSet.add(scanner.nextInt());
		}
		System.out.println(hashSet);
		int addition = 0;
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            addition += iterator.next();
        }
		System.out.println("Addition of given numbers : "+addition);
	}


	@Override
	public void subtraction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplication() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void division() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modulus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void square(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cube(int num) {
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
	public void evenOdd(int num) {
		// TODO Auto-generated method stub
		
	}

}
