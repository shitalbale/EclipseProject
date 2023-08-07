package com.springdependancy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
public static void main (String args[])
{
	ApplicationContext apc=new ClassPathXmlApplicationContext("bean1.xml");
	Student stu=(Student) apc.getBean("s");

	System.out.println(stu.getRollno());
	System.out.println(stu.getName());
	System.out.println(stu.getAdr().getCityname());
	System.out.println(stu.getAdr().getAreaname());
}
}
