package rav.wicket;

public class SimpleLoginPage extends TemplatePage {
	
	private static final long serialVersionUID = 1L;

	public SimpleLoginPage() {
		 super();
         replace(new LoginPanel(CONTENT_ID));
         getMenuPanel().setVisible(false);
         

	}
}