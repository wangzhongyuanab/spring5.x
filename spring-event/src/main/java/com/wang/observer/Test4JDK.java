package com.wang.observer;

/**
 * @author 王
 * @version 1.0
 * @create 2020/3/1 23:03
 */
public class Test4JDK {
	public static void main(String[] args) {
		Movie4JDK movie4JDK=new Movie4JDK();
		Master4JDK master4JDK=new Master4JDK();
		movie4JDK.addObserver(master4JDK);
		movie4JDK.move();
	}
}
