package com.wang.anno;

import com.wang.importselect.MyImportSelector;
import org.springframework.context.annotation.Import;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author 王
 * @version 1.0
 * @create 2020/2/22 17:26
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(MyImportSelector.class)
@Documented
public @interface EnableWang {
}
