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
	 * @param amount
	 * @param months
	 * @param penaltyAmount
	 */
	public TermAccount(double amount, int months, double penaltyAmount) {
		super();
		this.amount = amount;
		this.months = months;
		this.penaltyAmount = penaltyAmount;
	}

	/**
	 * @param accountId
	 * @param interestRate
	 * @param balance
	 * @param accountType
	 * @param dateOfOpening
	 * @param customers
	 * @param nominees
	 * @param beneficiaries
	 */
	public TermAccount(long accountId, double interestRate, double balance, AccountType accountType,
			LocalDate dateOfOpening, Set<Customer> customers, Set<Nominee> nominees, Set<Beneficiary> beneficiaries) {
		super(accountId, interestRate, balance, accountType, dateOfOpening, customers, nominees, beneficiaries);
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + months;
		temp = Double.doubleToLongBits(penaltyAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TermAccount other = (TermAccount) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (months != other.months)
			return false;
		if (Double.doubleToLongBits(penaltyAmount) != Double.doubleToLongBits(other.penaltyAmount))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TermAccount [amount=" + amount + ", months=" + months + ", penaltyAmount=" + penaltyAmount + "]";
	} 
	
    
}
