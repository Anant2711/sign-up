package com.signup.repository;

import com.signup.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<UserInfo ,Integer>{

	UserInfo findByEmail(String username);
   
}
