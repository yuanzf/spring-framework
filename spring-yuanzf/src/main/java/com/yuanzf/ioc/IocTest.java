package com.yuanzf.ioc;

import com.yuanzf.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: yzf
 * @Date: 2020/2/19 11:12
 * @Desoription:
 */
public class IocTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Object normalBean = annotationConfigApplicationContext.getBean("iocBean");
		System.out.println(normalBean);

	}
}
