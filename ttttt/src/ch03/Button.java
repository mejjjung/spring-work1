package ch03;

public class Button extends Components implements ClickEvent{

	@Override
	public void click() {
		System.out.println("Button을 클릭하였습니다");
	}

}
