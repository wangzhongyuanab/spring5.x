package com.luban.app;

import com.luban.anno.EnableWang;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


/**
 * @author 王
 * @version 1.0
 * @create 2020/2/20 13:34
 */

@ComponentScan("com.luban")
@EnableWang
public class AppConfig {
}
