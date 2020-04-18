package com.wang.test;



import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 王
 * @version 1.0
 * @create 2020/2/22 22:44
 */
public class TestMethodCallBack implements MethodInterceptor {

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("method----");
		return methodProxy.invokeSuper(o,objects);
	}
}
