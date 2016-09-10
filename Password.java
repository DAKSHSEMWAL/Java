package APPLET;

import java.awt.*;
import java.awt.event.*;

public class Password extends Frame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	Label l1,l2,l3;
	TextField t1,t2;
	Button b1;
	Panel p1,p2,p3;
	Password()
	{
		setLayout(new GridLayout(3,1));
		p1=new Panel();
		GridLayout gl= new GridLayout(2,2);
		p1.setLayout(gl);
		p2=new Panel(new FlowLayout()); 
		p3=new Panel(new FlowLayout());
		l1=new Label("UserName");
		t1=new TextField(30);
		l2=new Label("Password");
		t2=new TextField(30);
		t2.setEchoChar('*');
		b1=new Button("Log In");
		l3=new Label("                                                                                  ",Label.CENTER);
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p2.add(b1);
		p3.add(l3);
		add(p1);
		add(p2);
		add(p3);
		b1.addActionListener(this);
		setTitle("Log In");
		setSize(300,200);
		//setResizable(false);
		setVisible(true);
		addWindowListener( new WindowAdapter()
		{
			public void windowClosing(WindowEvent windowEvent)
			{
			System.exit(0);
			}
		});
	}
	public static void main(String[] args) 
	{
		new Password();

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String u1,p1;
		u1=t1.getText();
		p1=t2.getText();
		if((u1.equals("Joey"))&&(p1.equals("FRIENDS")))
		{
			l3.setText("Welcome !!! "+u1);
		}
		else
		{
			l3.setText("Please Check Your UserName or Password");
		}
	}
}
