package com.cg.iba.service;

import java.time.LocalDate;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iba.entities.Transaction;
import com.cg.iba.exception.DetailsNotFoundException;
import com.cg.iba.exception.EmptyListException;
import com.cg.iba.exception.InvalidAccountException;
import com.cg.iba.exception.InvalidDetailsException;
import com.cg.iba.repository.ITransactionRepository;

@Service
public class TransactionService implements ITransactionService{
	
	@Autowired
	private ITransactionRepository transactionRepository;
	
	@Override
	public Transaction createTransaction(Transaction transaction) throws InvalidDetailsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction viewTransaction(long transaction_id) throws DetailsNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction findTransactionById(long transaction_id) throws DetailsNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Transaction> listAllTransactions(long accountId, LocalDate from, LocalDate to)
			throws InvalidAccountException, EmptyListException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Transaction> getAllMyAccTransactions(int account_id) throws InvalidAccountException, EmptyListException {
		// TODO Auto-generated method stub
		return null;
	}

}
