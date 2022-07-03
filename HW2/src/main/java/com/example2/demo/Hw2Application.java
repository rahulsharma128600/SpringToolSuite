package com.example2.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import study.beans.AddressBean;
import study.beans.PersonBean;
import study.config.MyJavaConfig;

@SpringBootApplication
public class Hw2Application {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyJavaConfig.class);
		
		PersonBean bean = context.getBean("detail", PersonBean.class);
		System.out.println(bean.getName()+"  "+bean.getAge());
		System.out.println("Address : "+bean.getAdress().getCity());
		
		PersonBean bean1 = context.getBean("detail", PersonBean.class);
		bean1.setName("shyam");
		bean1.setAge(25);
		System.out.println(bean1.getName()+"  "+bean1.getAge());
		System.out.println("Address : "+bean.getAdress().getCity());
	}

}
