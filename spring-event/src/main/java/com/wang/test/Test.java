package com.wang.test;

import com.wang.app.Appconfig;
import com.wang.springevent.MailBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 王
 * @version 1.0
 * @create 2020/3/1 23:47
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				=new AnnotationConfigApplicationContext(Appconfig.class);
		//触发ContextStartedEvent
		//annotationConfigApplicationContext.start();
		annotationConfigApplicationContext.getBean(MailBean.class).sendMail();
	}
}
