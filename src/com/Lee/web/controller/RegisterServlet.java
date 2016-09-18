package com.Lee.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Lee.Exception.UserExistException;
import com.Lee.biz.impl.UserServiceImpl;
import com.Lee.entity.User;

@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = req.getParameter("username");
		String password=req.getParameter("password");
		User user=new User(username,password);
		UserServiceImpl userServiceImpl=new UserServiceImpl();
		try{
			userServiceImpl.registerUser(user);
		}catch(UserExistException e){
			req.getSession().setAttribute("msg", "用户名已存在");
			RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
			dispatcher.forward(req, resp);
			return;
		}
		req.getSession().setAttribute("msg",username+"注册成功");
		RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/success.jsp");
		dispatcher.forward(req, resp);
		return;
	}

}
