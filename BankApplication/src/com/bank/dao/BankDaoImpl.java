package com.bank.dao;

import java.util.ArrayList;
import java.util.List;

import com.bank.pojo.Customer;
import com.book.dao.BookDaoImpl;
import com.book.pojo.Book;

public class BankDaoImpl implements BankDao {

	static Customer customer = new Customer();

	Customer customer1 = new Customer(123, "manasa", 435456, "mans@hd.com", "Indian", "female", 1000);
	Customer customer2 = new Customer(124, "dghjf", 435456, "mans@hd.com", "Indian", "female", 3757);
	Customer customer3 = new Customer(125, "dfg", 435456, "mans@hd.com", "Indian", "female", 43975);
	Customer customer4 = new Customer(126, "rt", 435456, "mans@hd.com", "Indian", "female", 6776);

	List<Customer> list = new ArrayList<>();

	@Override
	public void withdraw(int id,int amount) {


		boolean flag = true;
		
		for (Customer customer : list) {
			if (customer.getCustomerId() == id) {
				//customer.setBookCount(book.getBookCount() + 1);
				flag = false;
				break;
			}
		}
		if (flag)
			.stream().forEach(customer -> {
				if (customer.)
					cartItems.put(book.getBookId(), book);
			});
		
		
			
		
		

	}

	@Override
	public long deposit(int amount) {
		long res = customer1.getBalance() + amount;
		System.out.println(customer1.getBalance());
		System.out.println(res);
		return res;
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
