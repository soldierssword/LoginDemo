package com.Lee.biz;

import com.Lee.Exception.UserExistException;
import com.Lee.entity.User;

public interface IUserService {
	/**
	* 提供注册服务
	* @param user
	* @throws UserExistException
	*/
	void registerUser(User user) throws UserExistException;
	
	/**
	* 提供登录服务
	* @param userName
	* @param userPwd
	* @return
	*/
	User loginUser(String userName, String userPwd);

}
