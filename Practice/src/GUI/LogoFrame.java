package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

class logo extends Frame
{
	
	logo()
	{
		this.setVisible(true);
		this.setTitle("LOgo");
		this.setSize(1100, 400);
		this.setBackground(Color.blue);
		
	}
	
	public void print(Graphics g)
	{
		Font f = new Font("arial",Font.ITALIC,26);
		this.setForeground(Color.white);
		g.setFont(f);
		g.drawString("NIKASH", 10,10);
		
	}
}



public class LogoFrame 
{
	public static void main(String[] args) 
	{
		logo l = new logo();
		
	}

}
