package ch01;

public class MainTest2 {

	public static void main(String[] args) {
		
		Button2 button2 = new Button2("button2");
		
		
		button2.setIButtonListener(new IButtonListener() {
			
			@Override
			public void clickEvent(String event) {
				System.out.println("콜백콜ㄹ백" + event);
			}
		});
		
		button2.click("야ㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑㅑ");
		button2.click("호ㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗ");

	}

}
 