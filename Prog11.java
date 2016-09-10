package APPLET;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Prog11 extends Frame 
{
	private static final long serialVersionUID = 1L;
	Prog11()
	{
		setSize(300,300);
		setTitle("First Frame");
		setVisible(true);
		addWindowListener( new WindowAdapter()
		{
			public void windowClosing(WindowEvent windowEvent)
			{
			System.exit(0);
			}
		});
	}
	 public static void main(String args[])
	 {
		new Prog11();
	 }
	
}
