package com.zm.service.impl;

import com.zm.DAO.impl.UserDAO;
import com.zm.mode.User;
import com.zm.service.IUserService;

public class UserService implements IUserService{
	private UserDAO userd;
	public UserDAO getUserd() {
		return userd;
	}
	public void setUserd(UserDAO userd) {
		this.userd = userd;
	}
	public void act(User u) {
		userd.eat(u);
		userd.talk(u);
	}
	
}
