package com.wang.dao;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author 王
 * @version 1.0
 * @create 2020/2/20 13:33
 */
@Component
public class IndexDao implements ApplicationContextAware,dao {

	private ApplicationContext applicationContext;

	public IndexDao(){
		System.out.println("构造");
	}

	@PostConstruct
	public void init(){
		System.out.println("init");
	}

	public void query(){
		System.out.println("query");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext=applicationContext;
	}
}
