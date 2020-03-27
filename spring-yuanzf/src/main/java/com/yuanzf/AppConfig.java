package com.yuanzf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.PriorityOrdered;

/**
 * @Author: yzf
 * @Date: 2020/2/19 11:05
 * @Desoription:
 */

@Configuration
@ComponentScan("com.yuanzf.ioc")
public class AppConfig implements PriorityOrdered {
	@Override
	public int getOrder() {
		return 0;
	}

	/**
	 * 1.扫描多个包 @ComponentScans()
	 * 		在源码中将ComponentScans拆分为多个ComponentScan，来分别解析
	 *
	 * 2.
	 */

}
