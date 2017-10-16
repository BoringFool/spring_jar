package com.zm.DAO.impl;

import com.zm.DAO.IUserDAO;
import com.zm.mode.User;

public class UserDAO implements IUserDAO{

	@Override
	public void talk(User u) {
		System.out.println(u.getName()+"说话！！！");
		
	}

	@Override
	public void eat(User u) {
		System.out.println(u.getName()+"吃东西！！！");
		
	}

}
