package com.cg.iba.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iba.entities.Customer;
import com.cg.iba.exception.DetailsNotFoundException;
import com.cg.iba.exception.EmptyListException;
import com.cg.iba.exception.InvalidAccountException;
import com.cg.iba.exception.InvalidDetailsException;
import com.cg.iba.repository.ICustomerRepository;

@Service
public class CustomerService implements ICustomerService {
	
	@Autowired
	private ICustomerRepository customerRepository;
	
	@Override
	public Customer addCustomer(Customer customer) throws InvalidDetailsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(Customer customer) throws InvalidDetailsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCustomer(long customer_id) throws DetailsNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Customer> listAllCustomers(double minBalance) throws EmptyListException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer viewCustomerDetails(long account_id) throws InvalidAccountException, DetailsNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findCustomerById(long customer_id) throws DetailsNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
