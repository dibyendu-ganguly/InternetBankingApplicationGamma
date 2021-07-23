package com.cg.iba.repository;

import java.time.LocalDate;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.cg.iba.entities.Transaction;
import com.cg.iba.exception.DetailsNotFoundException;
import com.cg.iba.exception.EmptyListException;
import com.cg.iba.exception.InvalidAccountException;
import com.cg.iba.exception.InvalidDetailsException;

@Repository
public class TransactionRepository implements ITransactionRepository {

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
	public Set<Transaction> listAllTransactions(LocalDate from, LocalDate to) throws EmptyListException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Transaction> getAllMyAccTransactions(int account_id) throws InvalidAccountException, EmptyListException {
		// TODO Auto-generated method stub
		return null;
	}

}
