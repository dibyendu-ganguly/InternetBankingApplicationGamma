package com.cg.iba.entities;

public class SavingsAccount extends Account{

    private double minBalance;
    private double fine;
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
