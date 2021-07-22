package com.cg.iba.entities;

public class Beneficiary {

	private long  beneficiaryId;
	private String beneficiaryName;
	private long  beneficiaryAccNo;
	private String IFSC;
	private AccountType accountType;
	/**
	 * 
	 */
	public Beneficiary() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param beneficiaryId
	 * @param beneficiaryName
	 * @param beneficiaryAccNo
	 * @param iFSC
	 * @param accountType
	 */
	public Beneficiary(long beneficiaryId, String beneficiaryName, long beneficiaryAccNo, String iFSC,
			AccountType accountType) {
		super();
		this.beneficiaryId = beneficiaryId;
		this.beneficiaryName = beneficiaryName;
		this.beneficiaryAccNo = beneficiaryAccNo;
		IFSC = iFSC;
		this.accountType = accountType;
	}
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((IFSC == null) ? 0 : IFSC.hashCode());
		result = prime * result + ((accountType == null) ? 0 : accountType.hashCode());
		result = prime * result + (int) (beneficiaryAccNo ^ (beneficiaryAccNo >>> 32));
		result = prime * result + (int) (beneficiaryId ^ (beneficiaryId >>> 32));
		result = prime * result + ((beneficiaryName == null) ? 0 : beneficiaryName.hashCode());
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
		Beneficiary other = (Beneficiary) obj;
		if (IFSC == null) {
			if (other.IFSC != null)
				return false;
		} else if (!IFSC.equals(other.IFSC))
			return false;
		if (accountType != other.accountType)
			return false;
		if (beneficiaryAccNo != other.beneficiaryAccNo)
			return false;
		if (beneficiaryId != other.beneficiaryId)
			return false;
		if (beneficiaryName == null) {
			if (other.beneficiaryName != null)
				return false;
		} else if (!beneficiaryName.equals(other.beneficiaryName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Beneficiary [beneficiaryId=" + beneficiaryId + ", beneficiaryName=" + beneficiaryName
				+ ", beneficiaryAccNo=" + beneficiaryAccNo + ", IFSC=" + IFSC + ", accountType=" + accountType + "]";
	}
	
	
}
