package ch01;

public class Button2 {

	private String name;
	private IButtonListener iButtonListener;
	
	public Button2(String name) {
		this.name = name;
	}
	
	public void setIButtonListener(IButtonListener buttonListener) {
		this.iButtonListener = buttonListener; 
	}
	
	public void click(String message) {
		if(iButtonListener != null) {
			this.iButtonListener.clickEvent(message);
		}
	}
	
	
	
	
	
	
	
	
}
