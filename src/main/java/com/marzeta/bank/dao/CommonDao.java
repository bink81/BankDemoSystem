package com.marzeta.bank.dao;

import java.io.Serializable;

public interface CommonDao<T, ID extends Serializable> {
	T findById(ID id);
	T save(T entity);
	T update(T entity);
}
