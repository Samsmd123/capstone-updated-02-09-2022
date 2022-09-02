package com.mpokketapp.service;


import java.time.LocalDate;
import java.util.List;


import com.mpokketapp.model.User;

public interface IUserService {
User addUser(User user);
void updateUser(User user);
void  deleteUser(int userId);
List<User> getAll();
//derived Query
List<User>getByUserType(String type);
User getByID(int userId);
//custom Query
List<User>getByLoanTypeAndUserType(String loanType,String userType);
List<User>getByUserNameAndDob(String userName,LocalDate dob);

}
