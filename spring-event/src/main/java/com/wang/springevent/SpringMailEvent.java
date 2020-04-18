package com.wang.springevent;

import org.springframework.context.ApplicationEvent;

/**
 * @author 王
 * @version 1.0
 * @create 2020/3/1 23:48
 */
public class SpringMailEvent extends ApplicationEvent {
	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public SpringMailEvent(Object source) {
		super(source);
	}
}
