package APPLET;
import java.awt.*;
import java.awt.event.*;
public class Shipment  extends Frame implements ActionListener,WindowListener,ItemListener
{

	private static final long serialVersionUID = 1L;
	Panel p1,p2,p3;
	Label l1,l2,l3;
	TextField t1,t2;
	Checkbox checkDiscount,checkWholesaler,checkRetailer;
	Button btncal;
	CheckboxGroup cbg;
	double cost=0.0,temp=0.0;
	Shipment()
	{
		FlowLayout l=new FlowLayout();
		setLayout(l);
		setTitle("ASUSTek");
		setSize(500,200);
		l1=new Label("Unit Odered");
		l2=new Label("Coustmer Type");
		l3=new Label("Total Cost",Label.RIGHT);
		t1=new TextField(20);
		t2=new TextField(20);
		t2.setEditable(false);
		cbg=new CheckboxGroup();
		checkDiscount= new Checkbox("Special Discount");
		checkWholesaler=new Checkbox("Wholesaler",cbg,true);
		checkRetailer=new Checkbox("Retailer",cbg,false);
		btncal=new Button("CalCost");
		p1=new Panel(new GridLayout(3,1));
		p2=new Panel(new GridLayout(3,1));
		p3=new Panel(new GridLayout(1,3));
		p1.add(l1);
		p1.add(t1);
		p1.add(checkDiscount);
		p2.add(l2);
		p2.add(checkWholesaler);
		p2.add(checkRetailer);
		p3.add(btncal);
		p3.add(l3);
		p3.add(t2);
		add(p1);
		add(p2);
		add(p3);
		btncal.addActionListener(this);
		checkDiscount.addItemListener(this);
		checkWholesaler.addItemListener(this);
		checkRetailer.addItemListener(this);
		setResizable(false);
		addWindowListener(this);
		setVisible(true);
	} 
	void display()
	{
		
	}
	public static void main(String args[])
	{
		Shipment s=new Shipment();
		s.display();
	}
		@Override
	public void windowOpened(WindowEvent e) 
	{
		
	}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		System.exit(0);		
	}
	@Override
	public void windowClosed(WindowEvent e) 
	{
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		int i=Integer.parseInt(t1.getText());
		if(i>0&&i<=15)
		{
			if(checkWholesaler.getState())
			{
				cost=50*i;
			}
			else
			{
				cost=60*i;
			}
		}
		if(i>15&&i<=20)
		{
			if(checkWholesaler.getState())
			{
				cost=45*i;
			}
			else
			{
				cost=55*i;
			}
		}
		if(i>20&&i<=30)
		{
			if(checkWholesaler.getState())
			{
				cost=40*i;
			}
			else
			{
				cost=50*i;
			}
		}
		if(i>30&&i<=50)
		{
			if(checkWholesaler.getState())
			{
				cost=35*i;
			}
			else
			{
				cost=45*i;
			}
		}
		if(i>50)
		{
			if(checkWholesaler.getState())
			{
				cost=30*i;
			}
			else
			{
				cost=40*i;
			}
		}
		t2.setText(cost+"");
		temp=cost;
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
	if(checkDiscount.getState())
		{
			cost=cost-(cost*0.1);
		}
		else
		{
			cost=temp;
		}
		t2.setText(cost+"");
	}
	
}
