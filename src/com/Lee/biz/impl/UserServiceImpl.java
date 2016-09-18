package com.Lee.biz.impl;

import com.Lee.Dao.impl.UserDaoImpl;
import com.Lee.Exception.UserExistException;
import com.Lee.biz.IUserService;
import com.Lee.entity.User;

public class UserServiceImpl implements IUserService {
	UserDaoImpl dao;
	public UserServiceImpl(){
		dao=new UserDaoImpl();
	}
	@Override
	public void registerUser(User user) throws UserExistException {
		// TODO Auto-generated method stub
		if(dao.add(user)==false){
			throw new UserExistException(user.getName()+"ÒÑ´æÔÚ");
		}
	}

	@Override
	public User loginUser(String userName, String userPwd) {
		// TODO Auto-generated method stub
		User user =new User(userName,userPwd);
		if(dao.find(user)==true){
			return user;
		}
		return null;
	}

}
