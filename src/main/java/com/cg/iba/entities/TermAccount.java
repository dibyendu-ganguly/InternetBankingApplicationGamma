package com.cg.iba.entities;

import java.time.LocalDate;
import java.util.Set;

public class TermAccount extends Account{

    private double amount;
    private int months; 
    private double penaltyAmount;
    
	/**
	 * 
	 */
	public TermAccount() {
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
	public TermAccount(long accounId, double interestRate, double balance, LocalDate dateOfOpening,
			Set<Customer> customers, Set<Nominee> nominees, Set<Beneficiary> beneficiaries) {
		super(accounId, interestRate, balance, dateOfOpening, customers, nominees, beneficiaries);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	/**
	 * @return the months
	 */
	public int getMonths() {
		return months;
	}
	/**
	 * @param months the months to set
	 */
	public void setMonths(int months) {
		this.months = months;
	}
	/**
	 * @return the penaltyAmount
	 */
	public double getPenaltyAmount() {
		return penaltyAmount;
	}
	/**
	 * @param penaltyAmount the penaltyAmount to set
	 */
	public void setPenaltyAmount(double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	} 

    
}
