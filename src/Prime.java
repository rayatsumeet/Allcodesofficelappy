
public class Prime {

	public static  Prime ob;
//	int num = 11;
	int i;
	int count =0;
	public void check(int num)
	{
		
		if(num>1)
			
		{
			for( i=1;i<=num;i++)
			{
			if(num%i==0)
			{
			count++;	
			}
			
			
			}
			if(count==2)
			{
				System.out.println("prime number"+i);		
			}
			else {
				System.out.println("not a prime number"+i);	
			}
			
			
		}
		
		else
		{
			System.out.println("not a prime number"+i);
		}
		
		
	}
	
	
	public static void main(String ar[])
	{
		 ob = new Prime();
		ob.check(4);
		
	}
}
