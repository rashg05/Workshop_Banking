package com.bridgelab.banking;

public class TestSaving {

	public static void main(String[] args) {
		double interest;
		SavingsAccount savingAccount1 = new SavingsAccount(2000.0);
		SavingsAccount savingAccount2 = new SavingsAccount(3000.0);
		SavingsAccount.setAnnualInterestRate(4.0);
		interest = savingAccount1.calculateMonthlyInterest();
		savingAccount1.display(interest);
		
		SavingsAccount.setAnnualInterestRate(5.0);
		interest = savingAccount2.calculateMonthlyInterest();
		savingAccount2.display(interest);
	}

}
