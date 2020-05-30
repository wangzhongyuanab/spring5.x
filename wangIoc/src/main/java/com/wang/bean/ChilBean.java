package com.wang.bean;

/**
 * @program: spring
 * @description:
 * @author: Mr.Wang
 * @create: 2020-05-09 21:22
 **/
public class ChilBean {
	String name;
	String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ChilBean{" +
				"name='" + name + '\'' +
				", type='" + type + '\'' +
				'}';
	}
}
