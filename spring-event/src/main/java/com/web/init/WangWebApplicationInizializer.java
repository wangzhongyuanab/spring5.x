package com.web.init;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletException;

/**
 * @author 王
 * @version 1.0
 * @create 2020/3/2 10:15
 */
public class WangWebApplicationInizializer implements WebApplicationInitializer {

	@Override
	public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
		//初始化spring的环境和springweb环境
		System.out.println("xxxxxxxx");
	}
}
