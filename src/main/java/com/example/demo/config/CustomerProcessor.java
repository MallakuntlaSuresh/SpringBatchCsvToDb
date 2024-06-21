package com.example.demo.config;

import org.springframework.batch.item.ItemProcessor;

import com.example.demo.entity.Customer;

// For file to DataBase
public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer customer) throws Exception {
		if (customer.getCountry().equals("United States")) {
			return customer;
		} else {
			return null;
		}
	}

}
