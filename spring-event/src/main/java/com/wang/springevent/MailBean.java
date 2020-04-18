package com.wang.springevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author 王
 * @version 1.0
 * @create 2020/3/1 23:49
 */
@Component
public class MailBean {
	@Autowired
	ApplicationContext applicationContext;

	public void sendMail(){
		//触发邮件事件
		applicationContext.publishEvent(new SpringMailEvent(applicationContext));
	}
}
