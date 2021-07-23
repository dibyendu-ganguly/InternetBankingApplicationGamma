package com.cg.iba.repository;

import java.util.Set;

import org.springframework.stereotype.Repository;

import com.cg.iba.entities.Customer;
import com.cg.iba.exception.DetailsNotFoundException;
import com.cg.iba.exception.EmptyListException;
import com.cg.iba.exception.InvalidAccountException;
import com.cg.iba.exception.InvalidDetailsException;

@Repository
public class CustomerRepository implements ICustomerRepository{

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
