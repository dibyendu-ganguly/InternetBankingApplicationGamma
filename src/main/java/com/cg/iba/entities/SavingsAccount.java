package com.cg.iba.entities;

import java.time.LocalDate;
import java.util.Set;

public class SavingsAccount extends Account{

    private double minBalance;
    private double fine;
    
	/**
	 * 
	 */
	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param accounId
	 * @param interestRate
	 * @param balance
	 * @param dateOfOpening
	 * @param customers
	 * @param nominees
	 * @param beneficiaries
	 */
	public SavingsAccount(long accounId, double interestRate, double balance, LocalDate dateOfOpening,
			Set<Customer> customers, Set<Nominee> nominees, Set<Beneficiary> beneficiaries) {
		super(accounId, interestRate, balance, dateOfOpening, customers, nominees, beneficiaries);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the minBalance
	 */
	public double getMinBalance() {
		return minBalance;
	}
	/**
	 * @param minBalance the minBalance to set
	 */
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	/**
	 * @return the fine
	 */
	public double getFine() {
		return fine;
	}
	/**
	 * @param fine the fine to set
	 */
	public void setFine(double fine) {
		this.fine = fine;
	} 

    
}
