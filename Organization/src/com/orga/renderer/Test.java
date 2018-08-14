package com.orga.renderer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orga.provider.Address;
import com.orga.provider.Organization;

public class Test {
	
	public static void main(String args[])
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("context.xml");
		
		Organization org1 = (Organization) context.getBean("orga");
		System.out.println(org1);
		
		
	}

}
