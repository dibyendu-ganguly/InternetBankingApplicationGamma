package com.cg.iba.entities;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="SavingsAccount")
public class SavingsAccount extends Account{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="accountId")
	private long accountId;
	@Column(name="minBalance")
    private double minBalance;
	@Column(name="fine")
    private double fine;
    
	/**
	 * 
	 */
	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param minBalance
	 * @param fine
	 */
	public SavingsAccount(double minBalance, double fine) {
		super();
		this.minBalance = minBalance;
		this.fine = fine;
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
	public SavingsAccount(long accountId, double interestRate, double balance, AccountType accountType,
			LocalDate dateOfOpening, Set<Customer> customers, Set<Nominee> nominees, Set<Beneficiary> beneficiaries) {
		super(accountId, interestRate, balance, accountType, dateOfOpening, customers, nominees, beneficiaries);
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(fine);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(minBalance);
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
		SavingsAccount other = (SavingsAccount) obj;
		if (Double.doubleToLongBits(fine) != Double.doubleToLongBits(other.fine))
			return false;
		if (Double.doubleToLongBits(minBalance) != Double.doubleToLongBits(other.minBalance))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SavingsAccount [minBalance=" + minBalance + ", fine=" + fine + "]";
	} 

    
}