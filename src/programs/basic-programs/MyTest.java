package programs;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener
{
	JButton btn=new  JButton("yellow");
	JButton btn1=new JButton("red");
    JButton btn2=new JButton("blue");
	Container c;
	MyFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);
		btn.setBounds(200,100,100,50);
		btn1.setBounds(400,100,100,50);
		btn2.setBounds(600,100,100,50);
		btn.setBackground(Color.yellow);
		btn1.setBackground(Color.red);
		btn2.setBackground(Color.blue);
		c.add(btn);
		c.add(btn1);
		c.add(btn2);
		btn.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==btn)
		{
		c.setBackground(Color.YELLOW);
		}
		 if (e.getSource()==btn1)
		 
	     c.setBackground(Color.RED);
		 //JLabel lb=new JLabel("pic");
		 //c.add(lb);
		 //lb.setBounds(400, 50, 400, 400);
	     //ImageIcon img=new ImageIcon("ac.jpg");
	     //lb.setIconImage(img.getImage());
		 
	     if (e.getSource()==btn2)
	     {
	     c.setBackground(Color.BLUE);
	     }
		//c.setBackground(Color.red);
		//c.setBackground(Color.green);
	}
}
	public class MyTest
	{
	  public static void main(String []args)
	  {
	    MyFrame f=new MyFrame();
	    f.setTitle("MyTest");
	    f.setBounds(100, 100, 1000, 600);
	    //f.setBackground(Color.gray);
	    f.setVisible(true);
	    f.setResizable(false);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
		
	}		
		
	}	
		
		
		
		
		
		
		
		
		/*JButton jbt=new JButton("submit");
	    	Container con;
	    	MyTest()
	    	{
	    	con=this.getContentPane();
	    	con.setLayout=(null);
	    	jbt.setBounds();
		    jbt.setBounds(650,360,100,50);
		    jbt.setBackground(Color.RED);
		    con.add(jbt);
		    Cursor cr=new Cursor(Cursor.HAND_CURSOR);
		    jbt.setCursor(cr);
	        }
	    	public void actionPerformed(ActionEvent e)
	    	{
	    	con.setBackground(Color.yellow);	
	    	}
}*/
