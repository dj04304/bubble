package bubble.test.ex01;

import javax.swing.JFrame;

//1. JFrame은 윈도우 창이 된다고 생각하면 됨
// 2. 윈도우 창은 내부에 패널을 하나 가지고 있다.

// eclipse market -> window builder
public class BubbleFrame extends JFrame{
	
	public BubbleFrame() {
		setSize(1000, 640);
		setVisible(true); // 그림을 그려라는 뜻
	}

	public static void main(String[] args) {
		new BubbleFrame();
	}
}
