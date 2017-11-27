package com.zhangxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SuppressWarnings("deprecation")
@SpringBootApplication
@EnableAspectJAutoProxy
public class ManageTheBackgroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageTheBackgroundApplication.class, args);
	}
}
