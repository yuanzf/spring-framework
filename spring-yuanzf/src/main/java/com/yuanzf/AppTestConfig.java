package com.yuanzf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @Author: yzf
 * @Date: 2020/3/10 17:10
 * @Desoription:
 */
@Configuration
@ComponentScan("com.yuanzf.ioc.order")
public class AppTestConfig implements Ordered {
	@Override
	public int getOrder() {
		return 0;
	}
}
