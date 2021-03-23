package com.marvin.shares.api.account;


public class AccountDto {

	private int accountId;

	private String name;

	private String userId;

	private String serviceAddress;

	public AccountDto(){}

	public AccountDto(int accountId, String name, String userId, String serviceAddress) {
		this.accountId = accountId;
		this.name = name;
		this.userId = userId;
		this.serviceAddress = serviceAddress;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServiceAddress() {
		return serviceAddress;
	}

	public void setServiceAddress(String serviceAddress) {
		this.serviceAddress = serviceAddress;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
