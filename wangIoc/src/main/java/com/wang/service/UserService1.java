package com.wang.service;

import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @description:
 * @author: Mr.Wang
 * @create: 2020-05-25 14:04
 **/
@Component
public class UserService1 implements UserService {
	public UserService1(){
		System.out.println(" userservice start");
	}
}
