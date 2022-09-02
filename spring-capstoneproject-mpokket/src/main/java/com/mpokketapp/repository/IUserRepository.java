package com.mpokketapp.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mpokketapp.model.User;

public interface IUserRepository extends JpaRepository<User, Integer> {

	
	List<User> findAll();
	//derived Query
	List<User>findByUserType(String type);
	User findByID(int userId);
	//custom Query
	List<User>findByLoanTypeAndUserType(String loanType,String userType);
	List<User>findByUserNameAndDob(String userName,LocalDate dob);
}
