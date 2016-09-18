package com.Lee.Dao;

import com.Lee.entity.User;

public interface IUserDao {
	public Boolean add(User user);
	public void delete(User user);
	public User findUserByName(String name);
	public Boolean find(User user);
	
}
