package com.wang.test;

import com.wang.app.AppConfig;
import com.wang.scanner.CustomScanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring
 * @description: 关于自定义扫描器的测试
 * @author: Mr.Wang
 * @create: 2020-05-27 19:28
 **/
public class Test2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);
		ac.refresh();
		CustomScanner customScanner=new CustomScanner(ac);
		customScanner.addIncludeFilter(null);
		int scan = customScanner.scan("com.wang");
		System.out.println(scan);
	}
}
