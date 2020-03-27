package com.yuanzf.ioc.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: yzf
 * @Date: 2020/3/25 22:37
 * @Desoription:
 */
public class ResourceLoadTest {
	public static void main(String[] args) {
//		Resource resource = new ClassPathResource("beanDefinition.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
		ApplicationContext factory=new ClassPathXmlApplicationContext("classpath:beanDefinition.xml");
		System.out.println(factory);
	}
}
