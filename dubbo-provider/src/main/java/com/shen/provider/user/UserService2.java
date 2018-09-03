package com.shen.provider.user;

import com.shen.common.user.IUserService;
import com.shen.common.user.User;

public class UserService2 implements IUserService {

	public User getUser(String name, int age) {
		// TODO Auto-generated method stub
		System.out.println("getUser  2222222222");
		return new User();
	}
	
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		System.out.println( "saveUser  2222222222");
		System.out.println(user);
	}
}
