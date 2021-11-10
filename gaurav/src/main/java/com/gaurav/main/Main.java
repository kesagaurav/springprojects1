package com.gaurav.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gaurav.Gaurav;


public class Main {

	public static void main(String[] args) {

		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		
		Gaurav g1=(Gaurav) context.getBean("g1");
		System.out.println(g1);
		
		Gaurav g2=(Gaurav) context.getBean("g2");
		System.out.println(g2);
	
	}

}
