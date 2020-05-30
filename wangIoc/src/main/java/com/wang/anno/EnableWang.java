package com.wang.anno;

import com.wang.importselect.MyImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author 王
 * @version 1.0
 * @create 2020/2/22 17:26
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(MyImportSelector.class)
@Documented
public @interface EnableWang {
}
