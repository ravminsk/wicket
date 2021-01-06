package rav.wicket;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class HomePage extends WebPage {

	private static final long serialVersionUID = 1L;
	private String message = "[type your message to the world here]";
	private Component headerPanel;

	public HomePage() {

		add(new Label("msg", "hello!!!!"));
		add(headerPanel = new HeaderPanel("headerPanel"));

	
	
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}