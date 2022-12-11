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
		sc.close();
	}
}