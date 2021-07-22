package com.cg.iba.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	User user;
	
	@Column(name="admin_name")
	private String adminName;
	
	@Column(name="admin_contact")
	private String adminContact;
	
	@Column(name="admin_email_id")
	private String adminEmailId;
	
	/**
	 * @param adminId
	 * @param adminName
	 * @param adminContact
	 * @param adminEmailId
	 */
	public Admin(String adminName, String adminContact, String adminEmailId) {
		super();
		this.adminName = adminName;
		this.adminContact = adminContact;
		this.adminEmailId = adminEmailId;
	}
	/**
	 * 
	 */
	public Admin() {
		super();
	}
	
	/**
	 * @return the adminName
	 */
	public String getAdminName() {
		return adminName;
	}
	/**
	 * @param adminName the adminName to set
	 */
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	/**
	 * @return the adminContact
	 */
	public String getAdminContact() {
		return adminContact;
	}
	/**
	 * @param adminContact the adminContact to set
	 */
	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}
	/**
	 * @return the adminEmailId
	 */
	public String getAdminEmailId() {
		return adminEmailId;
	}
	/**
	 * @param adminEmailId the adminEmailId to set
	 */
	public void setAdminEmailId(String adminEmailId) {
		this.adminEmailId = adminEmailId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adminContact == null) ? 0 : adminContact.hashCode());
		result = prime * result + ((adminEmailId == null) ? 0 : adminEmailId.hashCode());
		result = prime * result + ((adminName == null) ? 0 : adminName.hashCode());
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
		Admin other = (Admin) obj;
		if (adminContact == null) {
			if (other.adminContact != null)
				return false;
		} else if (!adminContact.equals(other.adminContact))
			return false;
		if (adminEmailId == null) {
			if (other.adminEmailId != null)
				return false;
		} else if (!adminEmailId.equals(other.adminEmailId))
			return false;
		if (adminName == null) {
			if (other.adminName != null)
				return false;
		} else if (!adminName.equals(other.adminName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + user.getUserId() + ", adminName=" + adminName + ", adminContact=" + adminContact
				+ ", adminEmailId=" + adminEmailId + "]";
	}
	
	
}
