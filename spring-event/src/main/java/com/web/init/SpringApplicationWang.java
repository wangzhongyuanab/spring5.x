package com.web.init;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

/**
 * @program: spring
 * @description:
 * @author: Mr.Wang
 * @create: 2020-04-30 09:55
 **/
public class SpringApplicationWang {
	public static void main(String[] args) throws LifecycleException {
		AnnotationConfigWebApplicationContext aacw
				=new AnnotationConfigWebApplicationContext();
		aacw.register(Appconfig.class);
		aacw.refresh();

		File base=new File(System.getProperty("java.io.tmpdir"));
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);
		Context rootCtx = tomcat.addContext("/", base.getAbsolutePath());
		DispatcherServlet dispatcherServlet = new DispatcherServlet(aacw);
		tomcat.addServlet(rootCtx,"wang",dispatcherServlet).setLoadOnStartup(1);
		rootCtx.addServletMapping("/","wang");
		tomcat.start();
		tomcat.getServer().await();
	}
}
