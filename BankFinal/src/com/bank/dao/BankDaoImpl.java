package com.bank.dao;

import java.util.ArrayList;
import java.util.List;

import com.bank.pojo.Customer;

public class BankDaoImpl implements BankDao {

	static Customer customer = new Customer();

	static Customer customer1 = new Customer(123, "manasa", 435456, "mans@hd.com", "Indian", "female", 1000);
	static Customer customer2 = new Customer(124, "dghjf", 435456, "mans@hd.com", "Indian", "female", 3757);
	static Customer customer3 = new Customer(125, "dfg", 435456, "mans@hd.com", "Indian", "female", 43975);
	static Customer customer4 = new Customer(126, "rt", 435456, "mans@hd.com", "Indian", "female", 6776);

	List<Customer> list = new ArrayList<>();

	public Customer searchById(int id)
	{
		Customer c = null;
		for (Customer customer : list) {

			if (customer.getCustomerId() == id) {

				
				c = customer;
			}

		}
		return c;
	}
	@Override
	public long withdraw(int id, int amount) {

		viewAll();
		Customer c = searchById(id);
		c.setBalance(c.getBalance() - amount);

		
		System.out.println(c.getBalance());
		return c.getBalance();

	}

	@Override
	public long deposit(int id1,int amount) {
		Customer c= searchById(id1);
		c.setBalance(c.getBalance() + amount);
		System.out.println(c.getBalance());
		//System.out.println(res);
		return c.getBalance();
	}

	@Override
	public List<Customer> viewAll() {
		list.add(customer1);
		list.add(customer2);

		list.add(customer3);
		list.add(customer4);
		return list;

	}

}
