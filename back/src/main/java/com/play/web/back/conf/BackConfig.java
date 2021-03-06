package com.play.web.back.conf;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * Created with IntelliJ IDEA.
 * User: caizhuojie
 * Date: 2017/7/25
 * Time: 15:12
 * To change this template use File | Settings | File Templates.
 */



/**
 * 负责管理基本配置信息
 */
@Configurable
@PropertySource(value={"classpath:back.properties"})  //读取配置文件 （redis/mysql）
public class BackConfig {
	@Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }
	
	@Bean(name="schedulerFactoryBean")
	public SchedulerFactoryBean schedulerFactoryBean(){
		return new SchedulerFactoryBean();
	}

}
