package com.cjc.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReturnHelloWordApplication {
         public static String m1()
         {
        	 return "hello";
         }
	
	
	public static void main(String[] args) {
	String aa =	m1();
	   System.out.println(aa);
	
		SpringApplication.run(ReturnHelloWordApplication.class, args);
	}

}
