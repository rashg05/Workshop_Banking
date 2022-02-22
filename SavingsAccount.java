package com.bridgelab.banking;

public class SavingsAccount {
	private static double annualInterestRate;
	
	private double savingsBalance;

	public SavingsAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}
	
	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	public void setSavingsbalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	public double calculateMonthlyInterest() {
		double monthlyInterest = savingsBalance * (annualInterestRate / 100) / 12;
		savingsBalance = (savingsBalance + monthlyInterest);
		return savingsBalance;
	}
	
	
	public void display(double interest) {
		System.out.println("Monthly interest: " + interest);
		System.out.println("Saving Balance: " + savingsBalance);
	}
	
	public static void modifyInterestRate(int newInterestRate) {
		annualInterestRate = newInterestRate;
	}
	
	
}
