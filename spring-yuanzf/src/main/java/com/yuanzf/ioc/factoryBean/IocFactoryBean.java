package com.yuanzf.ioc.factoryBean;

import com.yuanzf.ioc.priority.IocBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @Author: yzf
 * @Date: 2020/2/26 17:10
 * @Desoription:
 */
//@Component("iocFactoryBean")
public class IocFactoryBean implements FactoryBean<IocBean> {

	@Override
	public IocBean getObject() throws Exception {
		return new IocBean();
	}

	@Override
	public Class<?> getObjectType() {
		return IocBean.class;
	}


	@Override
	public String toString(){
		return "com.yuanzf.ioc.factoryBean.IocFactoryBean";
	}
}
