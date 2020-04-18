package com.luban.dao;

import com.luban.importselect.MyInvocationHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;

/**
 * @author 王
 * @version 1.0
 * @create 2020/2/22 17:20
 */
public class IndexDao1 implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("indexDao")){
			bean  = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{dao.class}, new MyInvocationHandler(bean));
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}
}
