package APPLET;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Prog12
{
	Prog12()
	{
		Frame f= new Frame();
		f.setSize(300,300);
		f.setTitle("Second Frame");
		f.setVisible(true);
		f.addWindowListener( new WindowAdapter()
		{
			public void windowClosing(WindowEvent windowEvent)
			{
			System.exit(0);
			}
		});
	}
	 public static void main(String args[])
	 {
		 new Prog12();
	 }
	
}
