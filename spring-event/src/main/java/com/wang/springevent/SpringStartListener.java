package com.wang.springevent;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

/**
 * @author 王
 * @version 1.0
 * @create 2020/3/1 23:50
 */
@Component
public class SpringStartListener implements ApplicationListener<ContextStartedEvent> {
	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("start");
	}
}
