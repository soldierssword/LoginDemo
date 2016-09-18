package com.Lee.Dao.impl;

import java.util.Iterator;
import java.util.List;

import com.Lee.DB.DB;
import com.Lee.Dao.IUserDao;
import com.Lee.entity.User;


public class UserDaoImpl implements IUserDao {
	List<User> db;
	Iterator<User> it;
	
	public UserDaoImpl() {
		db=(List<User>) DB.getDB();
		it=db.iterator();
	}
	@Override
	public Boolean add(User user) {
		// TODO Auto-generated method stub
		if(findUserByName(user.getName())==null){
			db.add(user);
			return true;
		};
		return false;
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		db.remove(user);
	}

	@Override
	public User findUserByName(String name) {
		// TODO Auto-generated method stub
		User user;
		while(it.hasNext()){
			user=it.next();
			if(user.getName().equals(name)){
				return user;
			}
		}
		return null;
	}

	@Override
	public Boolean find(User user) {
		// TODO Auto-generated method stub
		while(it.hasNext()){
			User user1;
			user1=it.next();
			if(user1.getName().equals(user.getName())&&user1.getPassword().equals(user.getPassword())){
				return true; 
			}
		}
		return false;
	}

}
