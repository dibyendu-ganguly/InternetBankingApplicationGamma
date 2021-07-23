package com.cg.iba.repository;

import org.springframework.stereotype.Repository;

import com.cg.iba.entities.User;
import com.cg.iba.exception.DetailsNotFoundException;
import com.cg.iba.exception.InvalidDetailsException;

@Repository
public class UserRepository implements IUserRepository {

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
