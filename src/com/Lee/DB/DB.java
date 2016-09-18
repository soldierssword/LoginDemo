package com.Lee.DB;

import java.util.ArrayList;
import java.util.List;
import com.Lee.entity.User;

public class DB {
	static private List<User> list;
	static{
		list=new ArrayList<User>();
		list.add(new User("aaa","123"));
	}
	private DB(){
		
	}
	public static List<User> getDB() {
		return list;
		
	}
	
}
