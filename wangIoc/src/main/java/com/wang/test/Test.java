package com.wang.test;

import com.wang.app.AppConfig;
import com.wang.dao.dao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



/**
 * @author 王
 * @version 1.0
 * @create 2020/2/20 13:34
 */
public class Test {
	public static void main(String[] args) {
		//把spring的所有前提环境准备好
		//1.准备一个bdReader和一个scanner
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				=new AnnotationConfigApplicationContext();
		//把一个class转成bd，然后put到map
		//map位置 DefaultListableBeanFactory的属性 beanDefinitionMap
		annotationConfigApplicationContext.register(AppConfig.class);
		//此时在mybeanfactory不加@Component在这里add就是自定义的后置处理器
		//annotationConfigApplicationContext.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
		//初始化spring环境
		annotationConfigApplicationContext.refresh();
		//完成了扫描但是完成扫描工作的不是AnnotationConfigApplicationContext中的scanner
		//这个才会调用scanner
		//annotationConfigApplicationContext.scan();
		dao indexDao = (dao) annotationConfigApplicationContext.getBean("indexDao");
		indexDao.query();

//		Enhancer enhancer = new Enhancer();
//		enhancer.setSuperclass(IndexDao.class);
//		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
//		enhancer.setCallback(new TestMethodCallBack());
//		IndexDao dao =(IndexDao) enhancer.create();
//		dao.query();
	}
}
