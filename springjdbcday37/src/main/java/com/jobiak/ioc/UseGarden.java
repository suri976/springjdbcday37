package com.jobiak.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseGarden {

	public static void main(String[] args)

	{
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	      //context.registerShutdownHook();
		//System.out.println(context.containsBean("fruits"));
		Garden ref=(Garden) context.getBean("garden");
		System.out.println(ref);
		
	}
}