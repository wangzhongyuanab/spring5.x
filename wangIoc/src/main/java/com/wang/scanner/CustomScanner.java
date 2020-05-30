package com.wang.scanner;

import com.wang.anno.WangScan;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.stereotype.Component;
import sun.reflect.annotation.AnnotationType;

/**
 * @program: spring
 * @description: 自定义实现的扫描器
 * @author: Mr.Wang
 * @create: 2020-05-27 19:22
 **/
public class CustomScanner extends ClassPathBeanDefinitionScanner {

	public CustomScanner(BeanDefinitionRegistry registry) {
		super(registry);
	}

	@Override
	protected boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
		AnnotationMetadata metadata = beanDefinition.getMetadata();
		return metadata.isInterface();
	}

	@Override
	public void addIncludeFilter(TypeFilter includeFilter) {
		super.addIncludeFilter(new AnnotationTypeFilter(WangScan.class));
	}
}
