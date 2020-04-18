package com.wang.ph;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王
 * @version 1.0
 * @create 2020/3/1 21:25
 */
public class Movie implements Runnable {


	List<MovieListener> movieListeners=new ArrayList<>();

	public void addListener(MovieListener movieListener){
		movieListeners.add(movieListener);
	}

	public void play() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MovieEvent movieEvent=new MovieEvent();
		movieEvent.setContext("only");
		movieEvent.setType(1);
		for (MovieListener movieListener : movieListeners) {
			movieListener.update(movieEvent);
		}
	}

	@Override
	public void run() {
		play();
	}
}
