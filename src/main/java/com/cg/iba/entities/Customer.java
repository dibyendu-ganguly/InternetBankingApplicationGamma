package com.cg.iba.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Customer")
public class Customer {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    User user;
    
    @Column(name="customer_name")
    private String customerName;
    
    @Column(name="phone_no")
    private String phoneNo;
    
    @Column(name="email_id")
    private String emailId;
    
    @Column(name="age")
    private int age;
    
    @Column(name="gender")
    private Gender gender;
	
    /**
	 * 
	 */
	public Customer() {
		super();
	}
	/**
	 * @param customerId
	 * @param customerName
	 * @param phoneNo
	 * @param emailId
	 * @param age
	 * @param gender
	 */
	public Customer(String customerName, String phoneNo, String emailId, int age, Gender gender) {
		super();
		this.customerName = customerName;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.age = age;
		this.gender = gender;
	}
	/**
	 * @return the customerId
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((phoneNo == null) ? 0 : phoneNo.hashCode());
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
		Customer other = (Customer) obj;
		if (age != other.age)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (gender != other.gender)
			return false;
		if (phoneNo == null) {
			if (other.phoneNo != null)
				return false;
		} else if (!phoneNo.equals(other.phoneNo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + user.getUserId() + ", customerName=" + customerName + ", phoneNo=" + phoneNo
				+ ", emailId=" + emailId + ", age=" + age + ", gender=" + gender + "]";
	} 
   
    

}
