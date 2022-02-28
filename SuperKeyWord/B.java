package SuperKeyWord;

public class B extends A{
	void fun1()
	{
		super.fun();
		System.out.println("Class B");
	}
	B()
	{
		System.out.println("Class B Constructor 1 ");
	}
	
	public static void main(String[]args)
	{
		B o=new B(10,20);
		o.fun1();
	
		
		
	}
	B(int x,int y)
	{
		System.out.println("Class B Constructor 1 "+(x+y));
	}
	
}
