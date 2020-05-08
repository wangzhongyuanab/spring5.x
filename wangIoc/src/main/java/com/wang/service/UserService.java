package com.wang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @description:
 * @author: Mr.Wang
 * @create: 2020-05-08 11:30
 **/
@Component
public class UserService {
	@Autowired
	OrderService orderService;

	public UserService(){
		System.out.println(" userservice start");
	}
}
