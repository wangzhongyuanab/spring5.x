package com.wang.springevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author 王
 * @version 1.0
 * @create 2020/3/1 23:48
 */
@Component
public class SpringMailListener implements ApplicationListener<SpringMailEvent> {

	@Override
	public void onApplicationEvent(SpringMailEvent event) {
		System.out.println("mail send");
	}
}
