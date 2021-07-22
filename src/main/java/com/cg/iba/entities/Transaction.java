package com.cg.iba.entities;


import java.time.LocalDateTime;
//import java.util.Set;

public class Transaction {

    private long transactionId;
    private double amount;
    private TransactionType transactionType; 
    private LocalDateTime dateTime; 
    private Account bankAccount; 
    private TransactionStatus transactionStatus;
    private String transactionRemarks;
    /**
	 * 
	 */
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param transactionId
	 * @param amount
	 * @param transactionType
	 * @param dateTime
	 * @param bankAccount
	 * @param transactionStatus
	 * @param transactionRemarks
	 */
	public Transaction(long transactionId, double amount, TransactionType transactionType, LocalDateTime dateTime,
			Account bankAccount, TransactionStatus transactionStatus, String transactionRemarks) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.transactionType = transactionType;
		this.dateTime = dateTime;
		this.bankAccount = bankAccount;
		this.transactionStatus = transactionStatus;
		this.transactionRemarks = transactionRemarks;
	}
	
	/**
	 * @return the transactionId
	 */
	public long getTransactionId() {
		return transactionId;
	}
	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
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
	 * @return the transactionType
	 */
	public TransactionType getTransactionType() {
		return transactionType;
	}
	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}
	/**
	 * @return the dateTime
	 */
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	/**
	 * @return the bankAccount
	 */
	public Account getBankAccount() {
		return bankAccount;
	}
	/**
	 * @param bankAccount the bankAccount to set
	 */
	public void setBankAccount(Account bankAccount) {
		this.bankAccount = bankAccount;
	}
	/**
	 * @return the transactionStatus
	 */
	public TransactionStatus getTransactionStatus() {
		return transactionStatus;
	}
	/**
	 * @param transactionStatus the transactionStatus to set
	 */
	public void setTransactionStatus(TransactionStatus transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	/**
	 * @return the transactionRemarks
	 */
	public String getTransactionRemarks() {
		return transactionRemarks;
	}
	/**
	 * @param transactionRemarks the transactionRemarks to set
	 */
	public void setTransactionRemarks(String transactionRemarks) {
		this.transactionRemarks = transactionRemarks;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((bankAccount == null) ? 0 : bankAccount.hashCode());
		result = prime * result + ((dateTime == null) ? 0 : dateTime.hashCode());
		result = prime * result + (int) (transactionId ^ (transactionId >>> 32));
		result = prime * result + ((transactionRemarks == null) ? 0 : transactionRemarks.hashCode());
		result = prime * result + ((transactionStatus == null) ? 0 : transactionStatus.hashCode());
		result = prime * result + ((transactionType == null) ? 0 : transactionType.hashCode());
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
		Transaction other = (Transaction) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (bankAccount == null) {
			if (other.bankAccount != null)
				return false;
		} else if (!bankAccount.equals(other.bankAccount))
			return false;
		if (dateTime == null) {
			if (other.dateTime != null)
				return false;
		} else if (!dateTime.equals(other.dateTime))
			return false;
		if (transactionId != other.transactionId)
			return false;
		if (transactionRemarks == null) {
			if (other.transactionRemarks != null)
				return false;
		} else if (!transactionRemarks.equals(other.transactionRemarks))
			return false;
		if (transactionStatus != other.transactionStatus)
			return false;
		if (transactionType != other.transactionType)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", amount=" + amount + ", transactionType="
				+ transactionType + ", dateTime=" + dateTime + ", bankAccount=" + bankAccount + ", transactionStatus="
				+ transactionStatus + ", transactionRemarks=" + transactionRemarks + "]";
	}
    
    
}
