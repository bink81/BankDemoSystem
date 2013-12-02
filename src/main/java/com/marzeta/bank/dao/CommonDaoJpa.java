package com.marzeta.bank.dao;

import java.io.Serializable;

public abstract class CommonDaoJpa<T, ID extends Serializable> implements CommonDao<T, ID>  {
	private Class<T> persistentClass;
	
	public CommonDaoJpa(Class<T> persistentClass) {
		this.setPersistentClass(persistentClass);
	}
	
	public T findById(ID id) {
		// TODO Auto-generated method stub
		return null;
	}

	public T save(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public T update(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	public void setPersistentClass(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

}
