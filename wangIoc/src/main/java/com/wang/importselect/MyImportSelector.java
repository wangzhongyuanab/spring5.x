package com.wang.importselect;


import com.wang.dao.IndexDao1;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author 王
 * @version 1.0
 * @create 2020/2/22 17:16
 */
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{IndexDao1.class.getName()};
	}
}
