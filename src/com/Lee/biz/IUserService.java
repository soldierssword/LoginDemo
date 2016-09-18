package com.Lee.biz;

import com.Lee.Exception.UserExistException;
import com.Lee.entity.User;

public interface IUserService {
	/**
	* �ṩע�����
	* @param user
	* @throws UserExistException
	*/
	void registerUser(User user) throws UserExistException;
	
	/**
	* �ṩ��¼����
	* @param userName
	* @param userPwd
	* @return
	*/
	User loginUser(String userName, String userPwd);

}
