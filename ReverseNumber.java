package day6;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// This project reverses a number eg 654 to 456
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number here: ");
		int num = scanner.nextInt();
		int newNum = 0;
		while(num > 0) {
			int removedNum = num%10;
			
			newNum = newNum * 10 + removedNum;
			num = num/10;
			
		}
		System.out.println("The reverse of the number is: "  + newNum);
		scanner.close();

	}

}
