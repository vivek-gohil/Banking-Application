package com.borntocode.main;

import com.borntocode.main.domain.Account;

public class BankingApplicationMain {
	public static void main(String[] args) {
		System.out.println("Current Banking Application");
		Account account = new Account(104, "Test", 10000);
		if (account.withdraw(1000))
			System.out.println("Withdraw successfull!!");
		else
			System.out.println("Withdraw failed");
	}
}
