package bubble.test.ex02;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame{

	private JLabel backgroundMap;
	private Player player;
	
	public BubbleFrame() {
		initObject();
		initSetting();
		setVisible(true);
	}
	
	private void initObject() {
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png")); //이미지를 가져옴
		// JPanel과 JLabel을 합쳐준다(굳이 따로 쓸 필요가 없기 때문이다.)
		setContentPane(backgroundMap);
		
		player = new Player();
		add(player);
		
//		backgroundMap.setLocation(300,300);
//		backgroundMap.setSize(1000, 600); //가져온 이미지의 사이즈
//		add(backgroundMap); //JFrame에 JLabel이 그려진다.
	}
	
	private void initSetting() {
		setSize(1000, 640);
		setLayout(null); // absolute 레이아웃(자유롭게 그림그리는것이 가능)
		setLocationRelativeTo(null); // JFrame이 가운데 뜸
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼으로 창을 껐을 때, JVM 같이 종료하기
		
	}
	
	public static void main(String[] args) {
		
		new BubbleFrame();
	}
}
