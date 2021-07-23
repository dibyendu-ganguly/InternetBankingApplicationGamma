package com.cg.iba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cg.iba.entities.User;
import com.cg.iba.exception.DetailsNotFoundException;
import com.cg.iba.exception.InvalidDetailsException;
import com.cg.iba.repository.IUserRepository;

@Service
public class UserService implements IUserService{
	
	@Autowired
	private IUserRepository Repository;
	
	@Override
	public User addNewUser(User user) throws InvalidDetailsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signIn(User user) throws InvalidDetailsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signOut(User user) throws InvalidDetailsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUserInfo(User user) throws InvalidDetailsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUserInfo(long userId) throws DetailsNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

}
