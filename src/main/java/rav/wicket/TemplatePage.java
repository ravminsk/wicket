package rav.wicket;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class TemplatePage extends WebPage {

	public static final String CONTENT_ID = "contentComponent";

	private static final long serialVersionUID = 1L;

	private Component headerPanel;
	private Component menuPanel;
	private Component footerPanel;

	public TemplatePage() {
		add(headerPanel = new HeaderPanel("headerPanel"));
		add(menuPanel = new MenuPanel("menuPanel"));
		add(footerPanel = new FooterPanel("footerPanel"));
		add(new Label(CONTENT_ID, "Put your content here"));

	}
	public Component getMenuPanel() {
		return menuPanel;
	}

	public void setMenuPanel(Component menuPanel) {
		this.menuPanel = menuPanel;
	}

	
}
