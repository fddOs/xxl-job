package com.xxl.job.executor.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

@Configuration
public class DruidConfigution {

	@Bean
	public DataSource dataSource() {
		return DruidDataSourceBuilder.create().build();
	}

}
