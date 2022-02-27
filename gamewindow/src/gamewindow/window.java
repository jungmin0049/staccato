

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class window {
	public static void main(String[] args) {
		//상태메세지 출력
        System.out.println("start-game");
        System.out.println("Window");
        //프레임 불러오기
        window.frame()
    }
	
	//프레임 만드는 내용 
	
	public void frame() extends JFrame implements ActionListener{
		Button b1,b2;
		JPanel p;
		public MyEvent() {
			setSize(1600,900);
			setTitle("stacato - 메인매뉴");
			
			
			p = new JPanel();
			b1 = new JButton("로그인");
			b2 = new JButton("업데이트");
			b3 = new JButton("불러오기");
			b4 = new JButton("공지사항");
			p.setBackground(Color.black)
			
			b1.addActionListener(this);//이벤트메소드호출
			b2.addActionListener(this);//이벤트메소드호출
			b3.addActionListener(this);//이벤트메소드호출
			b4.addActionListener(this);//이벤트메소드호출
			
			
			p.add(b1);
			p.add(b2);
			p.add(b3);
			p.add(b4);
			add(p);
			setVisible(true);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1) {
				p.setBackground(Color.YELLOW);
			}else if(e.getSource()==b2) {
				p.setBackground(Color.pink);
			}else if(e.getSource()==b3) {
				p.setBackground(Color.red);
			}else if(e.getSource()==b4) {
				p.setBackground(Color.green);
			}
		}
		

	}
}
