package com.cg.iba.entities;


import java.time.LocalDate;
import java.util.Set;

public class Account {
    /**
	 * 
	 */
	public Account() {
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
	public Account(long accounId, double interestRate, double balance, LocalDate dateOfOpening, Set<Customer> customers,
			Set<Nominee> nominees, Set<Beneficiary> beneficiaries) {
		super();
		this.accounId = accounId;
		this.interestRate = interestRate;
		this.balance = balance;
		this.dateOfOpening = dateOfOpening;
		this.customers = customers;
		this.nominees = nominees;
		this.beneficiaries = beneficiaries;
	}
	private long accounId; 
    private double interestRate;
    private double balance;
    private LocalDate  dateOfOpening;
    private Set<Customer> customers;
    private Set<Nominee> nominees;
    private Set<Beneficiary> beneficiaries;
	/**
	 * @return the accounId
	 */
	public long getAccounId() {
		return accounId;
	}
	/**
	 * @param accounId the accounId to set
	 */
	public void setAccounId(long accounId) {
		this.accounId = accounId;
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
    
    
 }
