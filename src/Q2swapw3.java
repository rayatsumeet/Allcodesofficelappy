
public class Q2swapw3 {

	
int  a= 199;
int b = 20;
	

	public void  swap()
	{
		a= a+b;
		b= a-b;
	//	a=30,b=10;
		a= a-b;
	System.out.println("value of a is "+ a);
	System.out.println("value of b is "+ b);
	
	}

	
	public static void main(String ar[])
	{
		
		
		Q2swapw3 ob = new Q2swapw3();
		
		ob.swap();
	}


}
