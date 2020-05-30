package com.wang.test;

import com.wang.app.AppConfig;
import com.wang.bean.ChilBean;
import com.wang.bean.RootBean;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring
 * @description:
 * @author: Mr.Wang
 * @create: 2020-05-09 21:22
 **/
public class Test1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=
				new AnnotationConfigApplicationContext();
		RootBeanDefinition rootBeanDefinition=new RootBeanDefinition();
		rootBeanDefinition.setBeanClass(RootBean.class);
		rootBeanDefinition.getPropertyValues().add("type","movie");
		rootBeanDefinition.getPropertyValues().add("name","image");
		ac.registerBeanDefinition("root",rootBeanDefinition);

		GenericBeanDefinition genericBeanDefinition=new GenericBeanDefinition();
		genericBeanDefinition.setParentName("root");
		genericBeanDefinition.getPropertyValues().add("name","枪火");
		genericBeanDefinition.setBeanClass(ChilBean.class);
		ac.registerBeanDefinition("chil",genericBeanDefinition);

		ac.register(AppConfig.class);
		ac.refresh();
		System.out.println(ac.getBean(ChilBean.class));
	}
}
