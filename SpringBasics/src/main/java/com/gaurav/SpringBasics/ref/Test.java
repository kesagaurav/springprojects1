package com.gaurav.SpringBasics.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/gaurav/SpringBasics/ref/ref.xml");
		A a=(A)context.getBean("aref");
		System.out.println(a);
		System.out.println(a.getObj().getY());
	}

}
