package programs;

import java.awt.Container;

import javax.swing.JFrame;

public class ActionDemo1 {
static Container c;
	public static void main(String[] args) {
		JFrame jf=new JFrame("Login page");
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(100, 20, 800, 600);
		c=jf.getContentPane();
		c.setLayout(null);
		

	}

}
