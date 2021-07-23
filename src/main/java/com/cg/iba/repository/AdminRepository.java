package com.cg.iba.repository;

import java.util.Set;

import org.springframework.stereotype.Repository;

import com.cg.iba.entities.Admin;
import com.cg.iba.exception.DetailsNotFoundException;
import com.cg.iba.exception.EmptyListException;
import com.cg.iba.exception.InvalidDetailsException;

@Repository
public class AdminRepository implements IAdminRepository{

	@Override
	public Admin addAdmin(Admin admin) throws InvalidDetailsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin findAdminById(long adminId) throws DetailsNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin updateAdmin(Admin admin) throws InvalidDetailsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAdmin(long adminId) throws DetailsNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Admin> listAllAdmins() throws EmptyListException {
		// TODO Auto-generated method stub
		return null;
	}

}
