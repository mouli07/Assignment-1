package com.cg.factory;

import java.util.ResourceBundle;

import com.cg.provider.MessageProvider;
import com.cg.renderer.MessageRenderer;

public class MessageFactory {
	
	public static MessageRenderer getMessageRenderer() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		ResourceBundle bundle=ResourceBundle.getBundle("context");
		
		String providerstr= bundle.getString("provider");
		MessageProvider provider= (MessageProvider) Class.forName(providerstr).newInstance();
		String rendererstr= bundle.getString("renderer");
		MessageRenderer renderer= (MessageRenderer) Class.forName(rendererstr).newInstance();
		
		renderer.setMessageProvider(provider);
		
		return renderer;
	}

}
