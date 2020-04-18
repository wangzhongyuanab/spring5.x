package com.luban.importselect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 王
 * @version 1.0
 * @create 2020/2/22 17:24
 */
public class MyInvocationHandler implements InvocationHandler {
	Object target;
	public MyInvocationHandler(Object target){
		this.target=target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("我是代理方法");
		return method.invoke(target,args);
	}
}
