package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String args[])
	{   
		Resource rs=new ClassPathResource("Bean.xml");
		BeanFactory beanFactory= new XmlBeanFactory(rs);
	Student stu=(Student)beanFactory.getBean("s");
	
	}
}
