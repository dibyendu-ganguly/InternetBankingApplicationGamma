package com.cg.iba.repository;

import java.util.Set;

import org.springframework.stereotype.Repository;

import com.cg.iba.entities.Nominee;
import com.cg.iba.exception.DetailsNotFoundException;
import com.cg.iba.exception.EmptyListException;
import com.cg.iba.exception.InvalidAccountException;
import com.cg.iba.exception.InvalidDetailsException;

@Repository
public class NomineeRepository implements INomineeRepository {

	@Override
	public Nominee addNominee(Nominee nominee) throws InvalidDetailsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Nominee updateNominee(Nominee nominee) throws InvalidDetailsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteNominee(long nomineeId) throws DetailsNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Nominee findNomineeById(long nomineeId) throws DetailsNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Nominee> listAllNominees(long accountid) throws InvalidAccountException, EmptyListException {
		// TODO Auto-generated method stub
		return null;
	}

}
