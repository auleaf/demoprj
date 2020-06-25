package com.yyzq.sqlserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.yyzq.sqlserver.mapper")
@SpringBootApplication
public class demoprjApplication {

	public static void main(String[] args) {
		SpringApplication.run(demoprjApplication.class, args);
	}
}
