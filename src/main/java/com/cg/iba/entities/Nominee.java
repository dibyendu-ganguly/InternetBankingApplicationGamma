package com.cg.iba.entities;

 
public class Nominee {

    private long nomineeId;
    private String name;
    private String govtId; 
    private String govtIdType; 
    private String phoneNo;
    private Relation relation;
	/**
	 * @return the nomineeId
	 */
	public long getNomineeId() {
		return nomineeId;
	}
	/**
	 * @param nomineeId the nomineeId to set
	 */
	public void setNomineeId(long nomineeId) {
		this.nomineeId = nomineeId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the govtId
	 */
	public String getGovtId() {
		return govtId;
	}
	/**
	 * @param govtId the govtId to set
	 */
	public void setGovtId(String govtId) {
		this.govtId = govtId;
	}
	/**
	 * @return the govtIdType
	 */
	public String getGovtIdType() {
		return govtIdType;
	}
	/**
	 * @param govtIdType the govtIdType to set
	 */
	public void setGovtIdType(String govtIdType) {
		this.govtIdType = govtIdType;
	}
	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}
	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	/**
	 * @return the relation
	 */
	public Relation getRelation() {
		return relation;
	}
	/**
	 * @param relation the relation to set
	 */
	public void setRelation(Relation relation) {
		this.relation = relation;
	}
    
    
 }
