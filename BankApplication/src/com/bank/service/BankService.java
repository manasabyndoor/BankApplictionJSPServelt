package com.bank.service;

import java.util.List;

import com.bank.pojo.Customer;

public interface BankService {
	public long withdraw(int id, int amount2);
	 public long deposit(int amount);
	
	public List<Customer> viewAll();
}
