package bubble.test.ex03;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame{

	private JLabel backgroundMap;
	private Player player;
	
	public BubbleFrame() {
		initObject();
		initSetting();
		initListner();
		setVisible(true);
	}
	
	private void initObject() {
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png")); //이미지를 가져옴
		// JPane과 JLabel을 합쳐준다(굳이 따로 쓸 필요가 없기 때문이다.)
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
	
	//이벤트 리스너
	private void initListner() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//어떤 키가 눌렸는지 알 수 있음
				System.out.println(e.getKeyCode());
				
				//좌: 37 우: 39 위: 38 아래: 40
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					player.left();
					break;
				case KeyEvent.VK_RIGHT:
					player.right();
					break;
				case KeyEvent.VK_UP:
					player.up();
					break;

				default:
					break;
				}
			}
		});
	}
	
	public static void main(String[] args) {
		
		new BubbleFrame();
	}
}
