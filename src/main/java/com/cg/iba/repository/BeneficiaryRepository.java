package com.cg.iba.repository;

import java.util.Set;

import org.springframework.stereotype.Repository;

import com.cg.iba.entities.Beneficiary;
import com.cg.iba.exception.DetailsNotFoundException;
import com.cg.iba.exception.EmptyListException;
import com.cg.iba.exception.InvalidAccountException;
import com.cg.iba.exception.InvalidDetailsException;

@Repository
public class BeneficiaryRepository implements IBeneficiaryRepository{

	@Override
	public Beneficiary addBeneficiary(Beneficiary beneficiary) throws InvalidDetailsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Beneficiary updateBeneficiary(Beneficiary beneficiary) throws InvalidDetailsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBeneficiary(long beneficiaryId) throws DetailsNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Beneficiary findBeneficiaryById(long beneficiaryId) throws DetailsNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Beneficiary> listAllBeneficiaries(long accountid) throws InvalidAccountException, EmptyListException {
		// TODO Auto-generated method stub
		return null;
	}

}
