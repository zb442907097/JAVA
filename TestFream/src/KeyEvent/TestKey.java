package KeyEvent;

import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TestKey {

	public static void main(String[] args) {
		new KeyFrame().launchFrame();
	}
}

class KeyFrame extends Frame{
	public void launchFrame(){
		setSize(200,200);
		setLocation(300,300);
		addKeyListener(new MyKeyMoniter());
		setVisible(true);
	}
	class MyKeyMoniter extends KeyAdapter{
		
		public void keyPressed(KeyEvent e){
			int keyCode = e.getKeyCode();
			if(keyCode == KeyEvent.VK_UP){
				System.out.println("UP");
			}
		}
	}
}
