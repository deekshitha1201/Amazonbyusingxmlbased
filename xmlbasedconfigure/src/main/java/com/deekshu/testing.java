package com.deekshu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testing {
	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("bean.xml");
		c.getBean("ama",Amazon.class);
	}

}
