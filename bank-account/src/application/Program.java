package application;

import java.util.Scanner;
import entities.Account;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of the account: ");
		int number = Integer.parseInt(sc.nextLine());

		System.out.print("Enter holder name: ");
		String holder = sc.nextLine();

		System.out.print("Enter password: ");
		String password = sc.nextLine();
<<<<<<< HEAD
		// Object
		Account a = new Account(number, holder, password);
		// Deposit
		System.out.print("Is there an initial deposit? (yes/no): ");		
		String answer = sc.nextLine();
		if (answer.equals("yes")) {
			System.out.print("Please insert the deposit value (USD): ");
			a.deposit(Float.parseFloat(sc.nextLine()));
		} else {
			System.out.println("No deposit.");
		}
		// Withdraw
		System.out.print("Please insert password: ");
		String pass = sc.nextLine();
		if (a.checkPassword(pass) == true) {
			System.out.println("Please insert the withdraw value (USD): ");
			a.withdraw(sc.nextInt());
		} else {
			System.out.println("Wrong password.\nProgram finished.");
		}
=======

		System.out.print("Is there an initial deposit? (y/n): ");		
		boolean answer;
		switch (sc.next()) {
			case "y":
				answer = true;
				break;
			case "n":
				answer = false;
				break;
			default:
				break;
		}
		if (answer = true) {
			System.out.print("Please insert the deposit value (USD): ");
			float deposit = sc.nextFloat();
			final Account a = new Account(number, holder, deposit, password);
			a.getData();
		} else {
			final Account a = new Account(number, holder, password);
			System.out.println("No deposit.");
			a.getData();
		}
		System.out.println("Please insert the deposit value: ");
		a.deposit(sc.nextInt());
		
>>>>>>> parent of 22f8ab9 (Simpler code.)
		sc.close();
	}
}