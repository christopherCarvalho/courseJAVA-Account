package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc;

		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter account holder: ");
		String name = sc.nextLine();

		System.out.print("Is there a initial deposit (y/n) ?");
		char response = sc.next().charAt(0);

		if (response == 'y') 
		{
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			acc = new Account(name, account, initialDeposit);
		}
		else 
		{
			acc = new Account(name, account);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(acc.toString());
		
		System.out.println();
		System.out.print("Enter deposit value: ");
		double deposit = sc.nextDouble();
		acc.deposit(deposit);
		System.out.println("Update account data: ");
		System.out.println(acc.toString());		
		
		System.out.println();		
		System.out.print("Enter withdraw value: ");
		double withdraw = sc.nextDouble();
		acc.withdraw(withdraw);
		System.out.println("Update account data: ");
		System.out.println(acc.toString());
		
		sc.close();
	}

}
