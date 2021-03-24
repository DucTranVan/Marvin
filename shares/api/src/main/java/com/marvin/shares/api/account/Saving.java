package com.marvin.shares.api.account;

import java.math.BigDecimal;

public class Saving {

	private BigDecimal amount;

	private Currency currency;

	private BigDecimal interest;

	private Boolean deposit;

	private Boolean capitalization;

	public Saving(BigDecimal amount,
				  Currency currency,
				  BigDecimal interest,
				  Boolean deposit,
				  Boolean capitalization)

	{
		this.amount = amount;
		this.currency = currency;
		this.interest = interest;
		this.deposit = deposit;
		this.capitalization = capitalization;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public BigDecimal getInterest() {
		return interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	public Boolean getDeposit() {
		return deposit;
	}

	public void setDeposit(Boolean deposit) {
		this.deposit = deposit;
	}

	public Boolean getCapitalization() {
		return capitalization;
	}

	public void setCapitalization(Boolean capitalization) {
		this.capitalization = capitalization;
	}
}
