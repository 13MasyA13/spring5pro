package ua.golik.spring5pro.ch2.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("app-context-xml.xml");
		ctx.refresh();
		MessageRenderer messageRenderer = ctx.getBean("renderer",
		MessageRenderer.class);
		messageRenderer.render();
		ctx.close();
	}
}
