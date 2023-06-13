package bubble.test.ex02;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//플레이어 클래스
public class Player extends JLabel{

	private int x;
	private int y;
	
	private ImageIcon playerR, playerL; //플레이어의 오른쪽 면, 왼쪽 면
	
	public Player() {
		initObject();
		initSetting();
	}
	 
	private void initObject() {
		playerR = new ImageIcon("image/playerR.png");
		playerL = new ImageIcon("image/playerL.png");
	}
	
	private void initSetting() {
		x = 55;
		y = 535;
		
//		this.setIcon(playerR);
		setIcon(playerR);
		setSize(50, 50);
		setLocation(x, y);
	}
}
