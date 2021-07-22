package com.cg.iba.entities;


import java.time.LocalDate;
import java.util.Set;

public class Account {
	private long accountId; 
    private double interestRate;
    private double balance;
    private AccountType accountType;
    private LocalDate  dateOfOpening;
    private Set<Customer> customers;
    private Set<Nominee> nominees;
    private Set<Beneficiary> beneficiaries;
    /**
	 * 
	 */
	public Account() {
		super();
		// TODO Auto-generated constructor stub
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
	public Account(long accountId, double interestRate, double balance, AccountType accountType,
			LocalDate dateOfOpening, Set<Customer> customers, Set<Nominee> nominees, Set<Beneficiary> beneficiaries) {
		super();
		this.accountId = accountId;
		this.interestRate = interestRate;
		this.balance = balance;
		this.accountType = accountType;
		this.dateOfOpening = dateOfOpening;
		this.customers = customers;
		this.nominees = nominees;
		this.beneficiaries = beneficiaries;
	}

	/**
	 * @return the accountId
	 */
	public long getAccountId() {
		return accountId;
	}
	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	/**
	 * @return the interestRate
	 */
	public double getInterestRate() {
		return interestRate;
	}
	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	/**
	 * @return the dateOfOpening
	 */
	public LocalDate getDateOfOpening() {
		return dateOfOpening;
	}
	/**
	 * @param dateOfOpening the dateOfOpening to set
	 */
	public void setDateOfOpening(LocalDate dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}
	/**
	 * @return the customers
	 */
	public Set<Customer> getCustomers() {
		return customers;
	}
	/**
	 * @param customers the customers to set
	 */
	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}
	/**
	 * @return the nominees
	 */
	public Set<Nominee> getNominees() {
		return nominees;
	}
	/**
	 * @param nominees the nominees to set
	 */
	public void setNominees(Set<Nominee> nominees) {
		this.nominees = nominees;
	}
	/**
	 * @return the beneficiaries
	 */
	public Set<Beneficiary> getBeneficiaries() {
		return beneficiaries;
	}
	/**
	 * @param beneficiaries the beneficiaries to set
	 */
	public void setBeneficiaries(Set<Beneficiary> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (accountId ^ (accountId >>> 32));
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((beneficiaries == null) ? 0 : beneficiaries.hashCode());
		result = prime * result + ((customers == null) ? 0 : customers.hashCode());
		result = prime * result + ((dateOfOpening == null) ? 0 : dateOfOpening.hashCode());
		temp = Double.doubleToLongBits(interestRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nominees == null) ? 0 : nominees.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountId != other.accountId)
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (beneficiaries == null) {
			if (other.beneficiaries != null)
				return false;
		} else if (!beneficiaries.equals(other.beneficiaries))
			return false;
		if (customers == null) {
			if (other.customers != null)
				return false;
		} else if (!customers.equals(other.customers))
			return false;
		if (dateOfOpening == null) {
			if (other.dateOfOpening != null)
				return false;
		} else if (!dateOfOpening.equals(other.dateOfOpening))
			return false;
		if (Double.doubleToLongBits(interestRate) != Double.doubleToLongBits(other.interestRate))
			return false;
		if (nominees == null) {
			if (other.nominees != null)
				return false;
		} else if (!nominees.equals(other.nominees))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", interestRate=" + interestRate + ", balance=" + balance
				+ ", dateOfOpening=" + dateOfOpening + ", customers=" + customers + ", nominees=" + nominees
				+ ", beneficiaries=" + beneficiaries + "]";
	}
    
    
 }
