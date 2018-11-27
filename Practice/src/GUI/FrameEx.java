package GUI;

import java.awt.Color;
import java.awt.Frame;
class MyFrame extends Frame 
{
	MyFrame()
	{
	this.setVisible(true);
	this.setTitle("Myframe");
	this.setSize(400, 400);
	this.setBackground(Color.blue);
	}


}
public class FrameEx
{
	
	
	public static void main(String[] args) 
	{
		MyFrame f = new MyFrame();
	
		/*Frame f = new Frame();
		//f.show();
		f.setVisible(true);
		f.setSize(600,600 );
		f.setTitle("hello");
		f.setBackground(Color.blue);*/
		
	}

}
