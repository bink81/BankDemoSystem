package com.marzeta.bank.dao;

import com.marzeta.bank.model.AccountHistory;

public class AccountHistoryDaoJpa extends CommonDaoJpa<AccountHistory, Long> implements AccountHistoryDao {
		public AccountHistoryDaoJpa() {
			super(AccountHistory.class);
		}
	}
