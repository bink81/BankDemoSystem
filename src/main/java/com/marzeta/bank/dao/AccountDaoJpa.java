package com.marzeta.bank.dao;

import com.marzeta.bank.model.Account;

public class AccountDaoJpa extends CommonDaoJpa<Account, Long> implements AccountDao {
	public AccountDaoJpa() {
		super(Account.class);
	}
}
