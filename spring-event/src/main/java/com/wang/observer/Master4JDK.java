package com.wang.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author 王
 * @version 1.0
 * @create 2020/3/1 22:57
 */
//观察者
public class Master4JDK implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Observer---------master");
	}
}
