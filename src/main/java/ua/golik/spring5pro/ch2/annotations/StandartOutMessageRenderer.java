package ua.golik.spring5pro.ch2.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.golik.spring5pro.ch2.xml.MessageProvider;
import ua.golik.spring5pro.ch2.xml.MessageRenderer;

@Service("renderer")
public class StandartOutMessageRenderer implements MessageRenderer {
	
	private MessageProvider messageProvider;

	public void render() {
		if (messageProvider == null) {
			throw new RuntimeException(
			"You must set the property messageProvider of class:"
			+ StandartOutMessageRenderer.class.getName());
			}	
		System.out.println(messageProvider.getMessage());
	}
	
	@Autowired
	public void setMessageProvider(MessageProvider provider) {
		this.messageProvider = provider;

	}

	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}

}
