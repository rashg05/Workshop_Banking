package com.bridgelab.banking;

public class TestSaving {

	public static void main(String[] args) {
		double interest;
		SavingsAccount savingAccount1 = new SavingsAccount(2000.0);
		SavingsAccount savingAccount2 = new SavingsAccount(3000.0);
		System.out.println("bank account with 4% interest: ");
		SavingsAccount.setAnnualInterestRate(4.0);
		savingAccount1.calculateMonthlyInterest();
		SavingsAccount.setAnnualInterestRate(4.0);
		savingAccount2.calculateMonthlyInterest();
		
		System.out.println("\nbank account with 5% interest: ");
		SavingsAccount.setAnnualInterestRate(5.0);
		savingAccount2.calculateMonthlyInterest();
		SavingsAccount.setAnnualInterestRate(4.0);
		savingAccount2.calculateMonthlyInterest();
	}

}
