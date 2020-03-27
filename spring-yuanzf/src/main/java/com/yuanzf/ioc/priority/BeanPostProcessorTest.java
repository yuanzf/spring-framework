package com.yuanzf.ioc.priority;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author: yzf
 * @Date: 2020/3/16 23:08
 * @Desoription:
 */
@Component
public class BeanPostProcessorTest implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization已经执行 ： " + beanName);
		System.out.println("postProcessBeforeInitialization已经执行 ： " + bean);
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization已经执行");
		return null;
	}
}
