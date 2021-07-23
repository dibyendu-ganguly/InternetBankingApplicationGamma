package com.cg.iba.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
	
	@Id
	@Column(name="admin_id")
	private Long admin_id;
	
	@OneToOne
	@MapsId
	@JoinColumn(name="admin_id")
	User user;
	
	@Column(name="admin_name")
	private String adminName;
	
	@Column(name="admin_contact")
	private String adminContact;
	
	@Column(name="admin_email_id")
	private String adminEmailId;

	/**
	 * 
	 * @param admin_id
	 * @param adminName
	 * @param adminContact
	 * @param adminEmailId
	 */
	
	public Admin(Long admin_id, String adminName, String adminContact, String adminEmailId) {
		super();
		this.admin_id = admin_id;
		this.adminName = adminName;
		this.adminContact = adminContact;
		this.adminEmailId = adminEmailId;
	}

	public Admin() {
		super();
	}

	/**
	 * 
	 * @return admin_id
	 */
	public Long getAdmin_id() {
		return admin_id;
	}

	/**
	 * 
	 * @param admin_id
	 */
	public void setAdmin_id(Long admin_id) {
		this.admin_id = admin_id;
	}
	/**
	 * 
	 * @return adminName
	 */
	public String getAdminName() {
		return adminName;
	}

	/**
	 * 
	 * @param adminName
	 */
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
	/**
	 *
	 * @return adminContact
	 */
	public String getAdminContact() {
		return adminContact;
	}

	/**
	 * 
	 * @param adminContact
	 */
	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}

	/**
	 * 
	 * @return adminEmailId
	 */
	public String getAdminEmailId() {
		return adminEmailId;
	}

	/**
	 * 
	 * @param adminEmailId
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
		result = prime * result + ((admin_id == null) ? 0 : admin_id.hashCode());
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
		if (admin_id == null) {
			if (other.admin_id != null)
				return false;
		} else if (!admin_id.equals(other.admin_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", adminName=" + adminName + ", adminContact=" + adminContact
				+ ", adminEmailId=" + adminEmailId + "]";
	}
	
	
}
