package com.wang.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;

/**
 * @author 王
 * @version 1.0
 * @create 2020/2/20 18:13
 */
//@Component
public class TestBeanPostProcessor1 implements BeanPostProcessor, PriorityOrdered {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("indexDao")) {
			System.out.println("BeforeInitialization1");
		}
		/**
		 * aop就是在此时将这个bean进行代理，产生一个代理对象返回出去
		 */
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("indexDao")) {
			System.out.println("AfterInitialization1");
		}
		/**
		 * aop就是在此时将这个bean进行代理，产生一个代理对象返回出去
		 */
		return bean;
	}

	@Override
	public int getOrder() {
		return -1;
	}
}
