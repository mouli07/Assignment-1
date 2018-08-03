package com.cg.test;

import com.cg.factory.MessageFactory;
import com.cg.renderer.MessageRenderer;

public class Test {
	
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		MessageRenderer renderer = MessageFactory.getMessageRenderer();
		
		renderer.render();
	}
	
	

}
