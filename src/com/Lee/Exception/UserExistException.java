package com.Lee.Exception;

public class UserExistException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public UserExistException() {
		// TODO Auto-generated constructor stub
	}
	public UserExistException(String msg){
		super(msg);
	}
}
