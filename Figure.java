
abstract class Shape 
{
	abstract void draw();
	abstract void erase();
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing A Circle");	
	}
	void erase()
	{
		System.out.println("Erasing A Circle");
	}	
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("Drawing A Square");	
	}
	void erase()
	{
		System.out.println("Erasing A Square");
	}	
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing A Triangle");	
	}
	void erase()
	{
		System.out.println("Erasing A Triangle");
	}	
}
public class Figure
{
	public static void main(String args[])
	{
		System.out.println("Demonstration OF Run Time Polymorphism");
		Circle ob1=new Circle();
		System.out.println("Implementation Of Circle");
		ob1.draw();
		ob1.erase();
		System.out.println();
		Square ob2=new Square();
		System.out.println("Implementation Of Square");
		ob2.draw();
		ob2.erase();
		System.out.println();
		Triangle ob3=new Triangle();
		System.out.println("Implementation Of Triangle");
		ob3.draw();
		ob3.erase();
	}
}

