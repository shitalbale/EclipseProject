package com.springdependancy;

public class Demo {
static Demo d;
private Demo()
{
	
}
public static Demo getDemo()
{
	if(d==null)
	{
		d=new Demo();
	}
	return d;
	
}

}
