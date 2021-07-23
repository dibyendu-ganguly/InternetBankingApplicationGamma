package com.cg.iba.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="nominee")
public class Nominee {
	@Column(name="nomineeId")
    private long nomineeId;
	@Column(name="name")
    private String name;
	@Column(name="govtId")
    private String govtId; 
	@Column(name="govtIdType")
    private String govtIdType;
	@Column(name="phoneNo")
    private String phoneNo;
	@Column(name="relation")
    private Relation relation;
    
	/**
	 * 
	 */
	public Nominee() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param nomineeId
	 * @param name
	 * @param govtId
	 * @param govtIdType
	 * @param phoneNo
	 * @param relation
	 */
	public Nominee(long nomineeId, String name, String govtId, String govtIdType, String phoneNo, Relation relation) {
		super();
		this.nomineeId = nomineeId;
		this.name = name;
		this.govtId = govtId;
		this.govtIdType = govtIdType;
		this.phoneNo = phoneNo;
		this.relation = relation;
	}
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((govtId == null) ? 0 : govtId.hashCode());
		result = prime * result + ((govtIdType == null) ? 0 : govtIdType.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (nomineeId ^ (nomineeId >>> 32));
		result = prime * result + ((phoneNo == null) ? 0 : phoneNo.hashCode());
		result = prime * result + ((relation == null) ? 0 : relation.hashCode());
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
		Nominee other = (Nominee) obj;
		if (govtId == null) {
			if (other.govtId != null)
				return false;
		} else if (!govtId.equals(other.govtId))
			return false;
		if (govtIdType == null) {
			if (other.govtIdType != null)
				return false;
		} else if (!govtIdType.equals(other.govtIdType))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nomineeId != other.nomineeId)
			return false;
		if (phoneNo == null) {
			if (other.phoneNo != null)
				return false;
		} else if (!phoneNo.equals(other.phoneNo))
			return false;
		if (relation != other.relation)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Nominee [nomineeId=" + nomineeId + ", name=" + name + ", govtId=" + govtId + ", govtIdType="
				+ govtIdType + ", phoneNo=" + phoneNo + ", relation=" + relation + "]";
	}
    
    
 }
