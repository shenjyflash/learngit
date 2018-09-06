package com.shen.provider.user;

import com.shen.common.user.IUserService;
import com.shen.common.user.User;

public class UserService implements IUserService {
	
	public UserService(){
		System.out.println("-------cons-----");
	}

	public User getUser(String name,int age) {
		User u = new User(name,age);
		return u;
	}

	public void saveUser(User user) {
		System.out.println("saveUser  :"+user.toString());
	}

	public User getUserLongTime(String name,int age){
		User u = new User(name,age);
		try {
			Thread.sleep(6*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return u;
	}

}
