package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int hiddenNumber = random.nextInt(100) + 1;
		int guess;
	
		for (guess = 1; guess < 6; guess++) {
			System.out.println("Pick a number between 1 and 100: ");
			int player = scanner.nextInt();
			
			if (player == hiddenNumber) {
				System.out.println("You win!");
				break;
			}
			else if (player < 1 || player > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again");
				guess--;
			}
			else if (player < hiddenNumber) {
				System.out.println("Please pick a higher number");
			}
			else if (player > hiddenNumber) {
				System.out.println("Please pick a lower number");
			}
			
			if ( guess == 5) {
			System.out.println("You lose, the number to guess was " + hiddenNumber);
			}
		
		}
		scanner.close();
		
	}
}