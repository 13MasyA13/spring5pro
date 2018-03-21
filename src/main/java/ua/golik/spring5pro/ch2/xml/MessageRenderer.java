package ua.golik.spring5pro.ch2.xml;

public interface MessageRenderer {
	
	void render();
	
	void setMessageProvider(MessageProvider provider);
	
	MessageProvider getMessageProvider();
}
