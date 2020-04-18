package com.wang.ph;

/**
 * @author 王
 * @version 1.0
 * @create 2020/3/1 21:29
 */
public class Test {
	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.addListener(new Master());
		movie.addListener(new FatTiger());
		Thread threadm=new Thread(movie);
		threadm.start();
	}
}
