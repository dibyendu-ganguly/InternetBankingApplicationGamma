package com.cg.iba.entities;

public class TermAccount extends Account{

    private double amount;
    private int months; 
    private double penaltyAmount;
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
