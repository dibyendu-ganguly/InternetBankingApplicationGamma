package com.cg.iba.entities;

public class Admin {
	private long adminId;
	private String adminName;
	private String adminContact;
	private String adminEmailId;
	
	/**
	 * @param adminId
	 * @param adminName
	 * @param adminContact
	 * @param adminEmailId
	 */
	public Admin(long adminId, String adminName, String adminContact, String adminEmailId) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminContact = adminContact;
		this.adminEmailId = adminEmailId;
	}
	/**
	 * 
	 */
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the adminId
	 */
	public long getAdminId() {
		return adminId;
	}
	/**
	 * @param adminId the adminId to set
	 */
	public void setAdminId(long adminId) {
		this.adminId = adminId;
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
		result = prime * result + (int) (adminId ^ (adminId >>> 32));
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
		if (adminId != other.adminId)
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
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminContact=" + adminContact
				+ ", adminEmailId=" + adminEmailId + "]";
	}
	
	
}
