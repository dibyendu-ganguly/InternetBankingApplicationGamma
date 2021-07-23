package com.cg.iba.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iba.entities.Admin;
import com.cg.iba.exception.DetailsNotFoundException;
import com.cg.iba.exception.EmptyListException;
import com.cg.iba.exception.InvalidDetailsException;
import com.cg.iba.repository.IAdminRepository;

@Service
public class AdminService implements IAdminService{

	@Autowired
	private IAdminRepository adminRepository;
	
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
