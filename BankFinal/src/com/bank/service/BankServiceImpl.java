package com.bank.service;

import java.util.List;

import com.bank.dao.BankDao;
import com.bank.dao.BankDaoImpl;
import com.bank.pojo.Customer;

public class BankServiceImpl implements BankService{

	BankDao dao=new BankDaoImpl();
	
	
	@Override
	public long withdraw(int id,int amount) {
		
		return dao.withdraw(id,amount);
	}

	@Override
	public long deposit(int id,int amount) {
		return dao.deposit(id,amount);
		
	}
public List<Customer> viewAll()
{
	return dao.viewAll();
	
}

	
}
