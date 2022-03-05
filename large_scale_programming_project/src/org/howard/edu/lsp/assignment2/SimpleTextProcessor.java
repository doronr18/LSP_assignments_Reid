package org.howard.edu.lsp.assignment2;

import java.util.Scanner;

public class SimpleTextProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * This method takes in a user input as a string then converts this string of numbers into integers where
		 * it they will be added up to print out the sums and multiple them to print out the product.
		 * @author doron.r
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("String?");
		String a = scan.nextLine();
//		boolean run = true;
		
		
		while (!(a.equals("Goodbye"))) {
			int sum = 0;
			int product = 1;
			String[] tokens = a.split(" ");
			System.out.println("Tokens:");
			
			
			for(String i : tokens){
				System.out.println(i);
				sum = sum + Integer.parseInt(i);
				product = product * Integer.parseInt(i);
			}
			
			System.out.println("Sum: " + sum);
			System.out.println("Product: " + product);
			System.out.println("String?");
			a = scan.nextLine();

		}
		scan.close();
		
		}
		
		
		
		// TODO Auto-generated method stub

	}
