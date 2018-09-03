package com.shen.provider.user;

import com.shen.common.user.IUserService;
import com.shen.common.user.User;

public class UserService implements IUserService {
	
	public UserService(){
		System.out.println("-------cons-----");
	}

	public User getUser(String name,int age) {
		User u = new User(name,age);
		System.out.println("getUser  1111111");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return u;
	}

	public void saveUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("saveUser  1111111");
		System.out.println(user+"  "+user.hashCode());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
