package com.gaurav.SpringBasics.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/gaurav/SpringBasics/ci/ci.xml");
		Student s1=(Student)context.getBean("student2");
		System.out.println(s1);
	}

}