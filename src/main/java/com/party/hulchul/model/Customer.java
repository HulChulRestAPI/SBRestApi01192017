package com.party.hulchul.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * <h1>Model Object that represents the customerDetails collection</h1>
 *
 * @author Soumya
 * @version 1.0
 * @since 2017-01-28
 */

@Document(collection = "CUSTOMER")
public class Customer {

	@Id
	@Field
	private Long customerId;
	@Field
	private String firstName;
	@Field
	private String lastName;
	@Field
	private String emailId;
	/*@Field
	private String phone;
	@Field
	private String billingAddress;
	@Field
	private String postalAddress;*/
	@Field
	private String notification;

	public Customer() {
	}

	@PersistenceConstructor
	public Customer(Long customerId, String firstName, String lastName, String emailId, String phone,
			String billingAddress, String postalAddress, String notification) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		/*this.phone = phone;
		this.billingAddress = billingAddress;
		this.postalAddress = postalAddress;*/
		this.notification = notification;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/*public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}*/

	public String getNotification() {
		return notification;
	}

	public void setNotification(String notification) {
		this.notification = notification;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailId=" + emailId + ", notification=" + notification + "]";
	}

}
