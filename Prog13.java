package APPLET;

import java.awt.*;
import java.awt.event.*;
public class Prog13 extends Frame
{

	private static final long serialVersionUID = 1L;
	Prog13()
	{
		setSize(300,300);
		setTitle("Third Frame");
		FlowLayout k=new FlowLayout();
		Label l=new Label("First Name");
		TextField t=new TextField(30);		
		Button b=new Button("Click");
		add(l);
		add(t);
		add(b);
		setLayout(k);
		setVisible(true);
		addWindowListener( new WindowAdapter()
		{
			public void windowClosing(WindowEvent windowEvent)
			{
			System.exit(0);
			}
		});
		
	}
	void displayGUI(){}
	 public static void main(String args[])
	 {
		 Prog13 s=new Prog13();
		 s.displayGUI();
	 }

}
