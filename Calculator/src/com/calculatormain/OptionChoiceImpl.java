package com.calculatormain;

import java.util.Scanner;

import com.arithmatic.ActualCalculationImpl;

public class OptionChoiceImpl implements OptionChoice {

	@Override
	public void selectOption() {
		System.out.print("Enter the option number : ");
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		optionNum(scanner.nextInt());
	}

	@Override
	public void optionNum(int num) {
		ActualCalculationImpl actualCalc = new ActualCalculationImpl();
		switch(num) {
		case 1:
			
			actualCalc.addition();
			break;
		case 2:
			actualCalc.subtraction();
			break;
		case 3:
			actualCalc.multiplication();
			break;
		case 4:
			actualCalc.division();
			break;
		case 5:
			actualCalc.modulus();
			break;
		case 6:
			actualCalc.square();
			break;
		case 7:
			System.out.println("cube");
			break;
		case 8:
			System.out.println("average");
			break;
		case 9:
			System.out.println("factors");
			break;
		case 10:
			System.out.println("even or odd");
			break;
		}
	}

}
