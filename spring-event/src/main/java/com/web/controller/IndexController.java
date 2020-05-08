package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: spring
 * @description:
 * @author: Mr.Wang
 * @create: 2020-04-30 10:02
 **/
@Controller
public class IndexController {

	@RequestMapping("/index")
	@ResponseBody
	public Map<String,String> index(){
		System.out.println("index");
		Map<String,String> map=new HashMap<>();
		map.put("index","index");
		return map;
	}
}
