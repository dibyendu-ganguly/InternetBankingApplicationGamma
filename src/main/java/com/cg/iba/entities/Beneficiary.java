package com.cg.iba.entities;

public class Beneficiary {

	private long  beneficiaryId;
	private String beneficiaryName;
	private long  beneficiaryAccNo;
	private String IFSC;
	private AccountType accountType;
	/**
	 * @return the beneficiaryId
	 */
	public long getBeneficiaryId() {
		return beneficiaryId;
	}
	/**
	 * @param beneficiaryId the beneficiaryId to set
	 */
	public void setBeneficiaryId(long beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}
	/**
	 * @return the beneficiaryName
	 */
	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	/**
	 * @param beneficiaryName the beneficiaryName to set
	 */
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}
	/**
	 * @return the beneficiaryAccNo
	 */
	public long getBeneficiaryAccNo() {
		return beneficiaryAccNo;
	}
	/**
	 * @param beneficiaryAccNo the beneficiaryAccNo to set
	 */
	public void setBeneficiaryAccNo(long beneficiaryAccNo) {
		this.beneficiaryAccNo = beneficiaryAccNo;
	}
	/**
	 * @return the iFSC
	 */
	public String getIFSC() {
		return IFSC;
	}
	/**
	 * @param iFSC the iFSC to set
	 */
	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}
	/**
	 * @return the accountType
	 */
	public AccountType getAccountType() {
		return accountType;
	}
	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	
	
}
