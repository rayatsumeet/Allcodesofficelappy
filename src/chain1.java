
 class A {
String a ;
	public A(String a)
	{
	//	this();
	this.a=a;
	System.out.println(a);
	}
	
	public A()
	{
		System.out.println("a");
	}
}
	
 class B extends A
{
	public B()
	{
	   //  super();
		super("parametrized");
		System.out.println(":insideb");
	}
}
	

public class chain1
{
	public static void main(String args[])
	{
		B obj= new B();
	}
}

