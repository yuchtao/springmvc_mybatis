package com.site.domain;

import java.util.Date;

public class User {
    private Long id;
	private String account;
	private String password;
	private String name;
	private String mailbox;
	private String department;
	private String company;
	private String contact;
	private String type;
	private Date lastLogin;

	public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMailbox() {
		return mailbox;
	}
	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", account=" + account + ", password=" + password + ", name=" + name + ", mailbox="
				+ mailbox + ", department=" + department + ", company=" + company + ", contact=" + contact + ", type="
				+ type + ", lastLogin=" + lastLogin + "]";
	}

}
