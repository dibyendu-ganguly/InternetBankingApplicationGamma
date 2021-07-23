package com.cg.iba.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iba.entities.Account;
import com.cg.iba.entities.SavingsAccount;
import com.cg.iba.entities.TermAccount;
import com.cg.iba.entities.Transaction;
import com.cg.iba.exception.DetailsNotFoundException;
import com.cg.iba.exception.InvalidAccountException;
import com.cg.iba.exception.InvalidAmountException;
import com.cg.iba.exception.InvalidDetailsException;
import com.cg.iba.exception.LowBalanceException;
import com.cg.iba.repository.IAccountRepository;

@Service
public class AccountService implements IAccountService {

	@Autowired
	private IAccountRepository accountRepository;
	
	@Override
	public Transaction transferMoney(long senderAccounId, long receiverAccountId, double amount, String username,
			String password) throws LowBalanceException, InvalidAccountException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction withdraw(long accounId, String username, String password) throws LowBalanceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction deposit(long accounId, double amount) throws InvalidAccountException, InvalidAmountException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SavingsAccount addSavingsAccount(SavingsAccount saving) throws InvalidDetailsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TermAccount addTermAccount(TermAccount term) throws InvalidDetailsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SavingsAccount updateSavingsAccount(SavingsAccount saving) throws InvalidDetailsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TermAccount updateTermAccount(TermAccount term) throws InvalidDetailsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean closeSavingsAccount(SavingsAccount accountNo) throws InvalidAccountException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean closeTermAccount(TermAccount accountNo) throws InvalidAccountException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account findAccountById(int account_id) throws InvalidAccountException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Account> viewAccounts(long customerId) throws DetailsNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SavingsAccount viewSavingAcc(long customerId) throws DetailsNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TermAccount viewTermAcc(long customerId) throws DetailsNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
