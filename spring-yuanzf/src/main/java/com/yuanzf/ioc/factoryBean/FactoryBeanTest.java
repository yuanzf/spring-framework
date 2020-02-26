package com.yuanzf.ioc.factoryBean;

import com.yuanzf.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: yzf
 * @Date: 2020/2/19 11:12
 * @Desoription:
 */
public class FactoryBeanTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Object factoryBean = annotationConfigApplicationContext.getBean("&iocFactoryBean");
		Object factoryBeanGetObjectMethod = annotationConfigApplicationContext.getBean("iocFactoryBean");
		Object normalBean = annotationConfigApplicationContext.getBean("iocBean");
		System.out.println(factoryBean);
		System.out.println(factoryBeanGetObjectMethod);
		System.out.println(normalBean);

	}
}
