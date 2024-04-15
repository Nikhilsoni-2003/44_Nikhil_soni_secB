package MyPackage;

class Rectangle1
{
	static int Length;
	static int Breath;
	Rectangle1(int l,int w)
	{
		Length = l;
		Breath = w;
	}
	static void Display()
	{
		System.out.println(Length*Breath);
	}
}
class Rectangle2
{
	int Length;
	int Breath;
	Rectangle2(int l,int w)
	{
		Length = l;
		Breath = w;
	}
	void Display()
	{
		System.out.println(Length*Breath);
	}
}
public class Demo 
{
	public static void main(String[] args) 
	{
		Rectangle1.Length = 10;
		Rectangle1.Breath = 10;
		Rectangle1.Display();
		Rectangle2 R2 = new Rectangle2(10,10);
		R2.Display();
	}
}
