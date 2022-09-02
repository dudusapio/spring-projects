package application;

import java.util.Locale;
import java.util.Scanner;

import model.entites.Account;
import model.exceptions.AmountExceedWithdrawLimit;
import model.exceptions.NotEnoughBalance;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data:");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial Balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			System.out.println();
			
			Account a = new Account(number,holder,balance,withdrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			a.withdraw(amount);
			
			System.out.println("New Balance: " + String.format("%.2f", a.getBalance()));
			
			sc.close();
		}
		catch (AmountExceedWithdrawLimit e ) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch (NotEnoughBalance e ) {
			System.out.println(e.getMessage());
		}

	}

}
