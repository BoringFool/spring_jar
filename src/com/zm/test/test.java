package com.zm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zm.mode.User;
import com.zm.service.IUserService;
import com.zm.service.impl.UserService;

public class test {

	public static void main(String[] args) {
		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
		IUserService service = context.getBean("UserService", UserService.class);
		User u=context.getBean("User", User.class);
		u.setName("zmz");
		service.act(u);

	}

}
