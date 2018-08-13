package com.bank.dao;

import java.util.List;

import com.bank.pojo.Customer;


public interface BankDao {
 public long withdraw(int id,int amount);
 public long deposit(int amount);

public List<Customer> viewAll();
 
}
