package com.marzeta.bank.dao;

import com.marzeta.bank.model.Customer;

public class CustomerDaoJpa extends CommonDaoJpa<Customer, Long> implements CustomerDao {
	public CustomerDaoJpa() {
		super(Customer.class);
	}
}
