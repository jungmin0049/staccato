package gamewindow;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class window {
	public static void main(String[] args) {
        System.out.println("Hello World");
    }
	
	
	
	public void frame() extends JFrame implements ActionListener{
		Button b1,b2;
		JPanel p;
		public MyEvent() {
			setSize(300,200);
			setTitle("stacato - ���θŴ�");
			
			p = new JPanel();
			b1 = new JButton("�α���");
			b2 = new JButton("������Ʈ");
			b3 = new JButton("�ҷ�����");
			b4 = new JButton("��������");
			
			b1.addActionListener(this);//�̺�Ʈ�޼ҵ�ȣ��
			b2.addActionListener(this);//�̺�Ʈ�޼ҵ�ȣ��
			
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
			}
		}
		

	}
}
