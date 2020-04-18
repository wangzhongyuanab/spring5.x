package com.wang.observer;

import java.util.Observable;

/**
 * @author 王
 * @version 1.0
 * @create 2020/3/1 22:59
 */
//被观察者
public class Movie4JDK extends Observable {

	public void move(){
		setChanged();
		notifyObservers();
	}
}
