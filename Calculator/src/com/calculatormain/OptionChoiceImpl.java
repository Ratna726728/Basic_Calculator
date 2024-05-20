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
		switch(num) {
		case 1:
			ActualCalculationImpl actualCalc = new ActualCalculationImpl();
			actualCalc.addition();
			break;
		case 2:
			System.out.println("subtraction");
			break;
		case 3:
			System.out.println("multiplication");
			break;
		case 4:
			System.out.println("division");
			break;
		case 5:
			System.out.println("modulus");
			break;
		case 6:
			System.out.println("square");
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
