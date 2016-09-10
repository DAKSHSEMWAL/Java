package APPLET;

import java.awt.*;
import java.awt.event.*;
public class CounterDemo extends Frame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	Label l;
	Button b;
	TextField t;
	private int count=0;
	CounterDemo()
	{
		setSize(250,100);
		setTitle("Counter");
		FlowLayout k=new FlowLayout();
		l=new Label("Counter",Label.LEFT);
		t=new TextField("0",10);	
		t.setEditable(false);
		b=new Button("COUNT");
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
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) 
	{
		++count;
		t.setText(count +"");
	} 
	void displayGUI(){}
	 public static void main(String args[])
	 {
		 CounterDemo s=new CounterDemo();
		 s.displayGUI();
	 }
	
}
