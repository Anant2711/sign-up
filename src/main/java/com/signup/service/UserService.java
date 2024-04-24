package com.signup.service;


import com.signup.exceptions.UserException;
import com.signup.model.UserDTO;
import com.signup.model.UserInfo;

public interface UserService {

	public UserInfo registerUser(UserDTO user) throws UserException;
	public UserInfo loginUser()  throws UserException;
	public UserInfo findUserByEmail(String email)  throws UserException;
}
