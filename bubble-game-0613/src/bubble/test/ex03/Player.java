package bubble.test.ex03;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//플레이어 클래스

//class Player ->  new가 가능함, 게임에 존재할 수 있음 (추상 메소드를 가질 수 없다.)
public class Player extends JLabel implements Moveable {

	//위치 상태
	private int x;
	private int y;
	
	//움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	

	private ImageIcon playerR, playerL; // 플레이어의 오른쪽 면, 왼쪽 면

	public Player() {
		initObject();
		initSetting();
	}

	private void initObject() {
		playerR = new ImageIcon("image/playerR.png");
		playerL = new ImageIcon("image/playerL.png");
	}

	private void initSetting() {
		
		// 캐릭터 최초의 상태
		x = 55;
		y = 535;
		
		left = false;
		right = false;
		up = false;
		down = false;

//		this.setIcon(playerR);
		setIcon(playerR);
		setSize(50, 50);
		setLocation(x, y);
	}

	@Override
	public void left() {
		setIcon(playerL);
		x = x - 10;
		setLocation(x, y);
	}

	@Override
	public void right() {
		setIcon(playerR);
		x = x + 10;
		setLocation(x, y);
	}

	@Override
	public void up() {

	}

	@Override
	public void down() {

	}
}
