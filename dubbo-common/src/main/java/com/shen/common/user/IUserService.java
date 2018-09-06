package com.shen.common.user;

public interface IUserService {

	public User getUser(String name,int age);
	
	public void saveUser(User user);
	
	public User getUserLongTime(String name,int age);
}
