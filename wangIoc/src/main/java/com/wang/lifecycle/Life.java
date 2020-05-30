package com.wang.lifecycle;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @description: 容器的生命周期回调方法
 * @author: Mr.Wang
 * @create: 2020-05-25 22:50
 **/
@Component
public class Life implements SmartLifecycle {
	boolean flag=false;

	@Override
	public boolean isAutoStartup() {
		return true;
	}

	@Override
	public void stop(Runnable callback) {
		System.out.println("stop2");
		callback.run();
	}

	@Override
	public void start() {
		System.out.println("start");
		flag=true;
	}

	@Override
	public void stop() {
		System.out.println("stop1");
		flag=false;
	}

	@Override
	public boolean isRunning() {
		return flag;
	}

	@Override
	public int getPhase() {
		return 0;
	}
}
