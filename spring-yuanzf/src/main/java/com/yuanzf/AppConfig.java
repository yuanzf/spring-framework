package com.yuanzf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yzf
 * @Date: 2020/2/19 11:05
 * @Desoription:
 */

@Configuration
@ComponentScan("com.yuanzf.ioc")

public class AppConfig {

	/**
	 * 1.扫描多个包 @ComponentScans()
	 * 		在源码中将ComponentScans拆分为多个ComponentScan，来分别解析
	 *
	 * 2.
	 */
}
