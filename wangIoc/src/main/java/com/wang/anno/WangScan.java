package com.wang.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: spring
 * @description: 自定义扫描的一个注解
 * @author: Mr.Wang
 * @create: 2020-05-27 19:27
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface WangScan {
}
