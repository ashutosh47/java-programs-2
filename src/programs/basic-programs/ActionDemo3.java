package programs;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;

public class ActionDemo3 {
static Container c;
	public static void main(String[] args) {
		JFrame j=new JFrame("my first application");
		j.setVisible(true);
		j.setBounds(100, 50, 800, 600);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     c=j.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.BLACK);
         JButton jb1=new JButton("red");
         jb1.setBounds(100, 50, 100, 30);
         jb1.setBackground(Color.CYAN);
         c.add(jb1);
         Click1ListenerClass clickListener=new Click1ListenerClass();
         jb1.addActionListener(clickListener);
         
         JButton jb2=new JButton("yellow");
         jb2.setBounds(200, 50, 100, 30);
         jb2.setBackground(Color.CYAN);
         c.add(jb2);
         Click2ActionListener click2=new Click2ActionListener();
         jb2.addActionListener(click2);
         
         
         JButton jb3=new JButton("green");
         jb3.setBounds(300, 50, 100, 30);
         jb3.setBackground(Color.CYAN);
         c.add(jb3);
         GreenActionListener green=new GreenActionListener();
         jb3.addActionListener(green);
         
         JButton jb4=new JButton("blue");
         jb4.setBounds(400, 50, 100, 30);
         jb4.setBackground(Color.CYAN);
         c.add(jb4);
         
         BlueActionListener blue=new BlueActionListener();
         jb4.addActionListener(blue);
         

         JButton jb5=new JButton("black");
         jb5.setBounds(500, 50, 100, 30);
         jb5.setBackground(Color.cyan);
         c.add(jb5);
         
         BlackActionListener black=new BlackActionListener();
         jb5.addActionListener(black);
         
         JButton jb6=new JButton("orange");
         jb6.setBounds(500, 50, 100, 30);
         jb6.setBackground(Color.CYAN);
         c.add(jb6);
         
         OrangeActionListener orange=new OrangeActionListener();
         jb6.addActionListener(orange);
         
         
         JButton jb7=new JButton("gray");
         jb7.setBounds(600, 50, 100, 30);
         jb7.setBackground(Color.CYAN);
         c.add(jb7);
         
         GrayActionListener gray=new GrayActionListener();
         jb7.addActionListener(gray);
         
         
         JButton jb8=new JButton("white");
         jb8.setBounds(100, 80, 100, 30);
         jb8.setBackground(Color.CYAN);
         c.add(jb8);
         
         WhiteActionListener white=new WhiteActionListener();
         jb8.addActionListener(white);
         
         JButton jb9=new JButton("pink");
         jb9.setBounds(200, 80, 100, 30);
         jb9.setBackground(Color.CYAN);
         c.add(jb9);
         
         PinkActionListener pink=new PinkActionListener();
         jb9.addActionListener(pink);
         
         JButton jb10=new JButton("cyan");
         jb10.setBounds(300, 80, 100, 30);
         jb10.setBackground(Color.CYAN);
         c.add(jb10);
         
         CyanActionListener Cyan=new CyanActionListener();
         jb10.addActionListener(Cyan);
         
         JButton jb11=new JButton("darkgray");
         jb11.setBounds(400, 80, 100, 30);
         jb11.setBackground(Color.CYAN);
         c.add(jb11);
         
         DarkGrayActionListener darkgray=new DarkGrayActionListener();
         jb11.addActionListener(darkgray);
         
         JButton jb12=new JButton("light gray");
         jb12.setBounds(500, 80, 100, 30);
         jb12.setBackground(Color.CYAN);
         c.add(jb12);
         
         LightGrayActionListener lgray=new LightGrayActionListener();
         jb12.addActionListener(lgray);
         
         JButton jb13=new JButton("magenta");
         jb13.setBounds(600, 80, 100, 30);
         jb13.setBackground(Color.CYAN);
         c.add(jb13);
         
         MagentaActionListener magenta=new MagentaActionListener();
         jb13.addActionListener(magenta);
         
        /* JButton jb14=new JButton("whit");
         jb14.setBounds(700, 80, 100, 30);
         jb14.setBackground(Color.CYAN);
         c.add(jb14);
         
         WhitActionListener Whit=new WhitActionListener();
         jb14.addActionListener(Whit);
         */
	}

}
    class Click1ListenerClass implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		ActionDemo3.c.setBackground(Color.RED);
    		
    	}
	
	}
    class Click2ActionListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		ActionDemo3.c.setBackground(Color.yellow);
    	}
    }
    class GreenActionListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		ActionDemo3.c.setBackground(Color.green);
    	}
    }
    class BlueActionListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		ActionDemo3.c.setBackground(Color.blue);
    	}
    }
    class OrangeActionListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		ActionDemo3.c.setBackground(Color.orange);
    	}
    }
    class BlackActionListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		ActionDemo3.c.setBackground(Color.black);
    	}
    }

    class GrayActionListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		ActionDemo3.c.setBackground(Color.gray);
    	}
    }

    class WhiteActionListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		ActionDemo3.c.setBackground(Color.white);
    	}
    }
    class CyanActionListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		ActionDemo3.c.setBackground(Color.cyan);
    	}
    }
    class PinkActionListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		ActionDemo3.c.setBackground(Color.pink);
    	}
    }
    class DarkGrayActionListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		ActionDemo3.c.setBackground(Color.DARK_GRAY);
    	}
    }

    class LightGrayActionListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		ActionDemo3.c.setBackground(Color.LIGHT_GRAY);
    	}
    }
    class MagentaActionListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		ActionDemo3.c.setBackground(Color.MAGENTA);
    	}
    }
    /*class WhitActionListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		ActionDemo3.c.setBackground(Color.white);
    	}
    }*/


