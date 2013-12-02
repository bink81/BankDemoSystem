package com.marzeta.bank.model;

public class Account extends CommonEntity {
	private long balance;
	private Customer owner;
	private long minBalance;
	
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public Customer getOwner() {
		return owner;
	}
	public void setOwner(Customer owner) {
		this.owner = owner;
	}
	public long getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(long minBalance) {
		this.minBalance = minBalance;
	}
}
