package programs;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionDemo {
    static Container c;
	public static void main(String[] args) {
		
		   JFrame f=new JFrame("action listener with class");
           f.setVisible(true);
           f.setBounds(100, 50, 800, 800);
           //f.setLayout(null);
           c=f.getContentPane();
           c.setLayout(null);
           
           JFrame f1=new JFrame("action listener with class");
           f1.setVisible(true);
           f1.setBounds(100, 50, 800, 800);
           //f.setLayout(null);
           c=f.getContentPane();
           c.setLayout(null);
          
          JButton jb=new JButton("red");
          jb.setBounds(100, 50, 100, 30);
          c.add(jb);
          
          
          
           
	}

}
