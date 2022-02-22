package com.bridgelab.banking;

public class TestSaving {

	public static void main(String[] args) {
		SavingsAccount savingAccount1 = new SavingsAccount(2000.0);
		SavingsAccount.setAnnualInterestRate(4.0);
		savingAccount1.calculateMonthlyInterest();
		System.out.println("First saver: saving balance is- " +savingAccount1.getSavingsBalance()+
				"\nAnnual interest is- " +SavingsAccount.getAnnualInterestRate()+
				"\nMonthly Interest- " +savingAccount1.calculateMonthlyInterest());
		
		SavingsAccount savingAccount2 = new SavingsAccount(3000.0);
		SavingsAccount.setAnnualInterestRate(5.0);
		savingAccount2.calculateMonthlyInterest();
		System.out.println("Second saver: saving balance is- " +savingAccount2.getSavingsBalance()+
				"\nAnnual interest is- " +SavingsAccount.getAnnualInterestRate()+
				"\nMonthly Interest- " +savingAccount2.calculateMonthlyInterest());

	}

}
