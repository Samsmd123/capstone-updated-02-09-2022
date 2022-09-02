package com.mpokketapp.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpokketapp.model.User;
import com.mpokketapp.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {
	
	IUserRepository userRepository;
	@Autowired
	public void setUserRepository(IUserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void updateUser(User user) {
		 userRepository.save(user);
		
	}

	@Override
	public void deleteUser(int userId) {
		 userRepository.deleteById(userId);
		
	}

	@Override
	public List<User> getAll() {
		
		return userRepository.findAll();
	}

	@Override
	public List<User> getByUserType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByID(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getByLoanTypeAndUserType(String loanType, String userType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getByUserNameAndDob(String userName, LocalDate dob) {
		// TODO Auto-generated method stub
		return null;
	}

}
