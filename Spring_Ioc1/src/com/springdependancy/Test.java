package com.springdependancy;

public class Test {
public static void main(String args[])
{
	//Demo d1=new Demo();
	Demo d=Demo.getDemo();
	System.out.println(d);
	Demo d1=Demo.getDemo();
	System.out.println(d1);
	Demo d2=Demo.getDemo();
	System.out.println(d2);
	
	
}
}
