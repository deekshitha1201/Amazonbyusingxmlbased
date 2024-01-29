package com.amazon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
		paymentprocess p=a.getBean("payment", paymentprocess.class);
		System.out.println(p.dopayment());
	}

}
