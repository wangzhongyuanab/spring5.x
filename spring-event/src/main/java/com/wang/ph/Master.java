package com.wang.ph;

/**
 * @author 王
 * @version 1.0
 * @create 2020/3/1 22:35
 */
public class Master implements MovieListener{

	public void update(MovieEvent movieEvent){
		if (movieEvent.getType()==1){
			System.out.println("smile");
		}
	}
}
