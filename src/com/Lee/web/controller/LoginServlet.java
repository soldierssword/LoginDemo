package com.Lee.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.Lee.biz.impl.UserServiceImpl;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		
		String username = req.getParameter("username");
		String password=req.getParameter("password");
		System.out.println(username+"  "+password);
		UserServiceImpl userServiceImpl=new UserServiceImpl();
		
		if(userServiceImpl.loginUser(username, password)==null){
			req.getSession().setAttribute("msg", "用户名或密码错误");
			RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
			dispatcher.forward(req, resp);
			return;
		}else{
			req.getSession().setAttribute("msg",username+"登录成功");
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/success.jsp");
			dispatcher.forward(req, resp);
			return;
		}
		
	}

}
