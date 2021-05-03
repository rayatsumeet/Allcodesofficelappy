
public class stringreverse {

	
	
	public static void main(String ar[])
	{
		
		
		int n = 12345;
		int rev =0;
		int o=0;
		while(n>0)
		{
			
			
			o=n%10;
			rev = (rev *10) + o;
			n=n/10;
		
			
			
		}
		
		System.out.println(rev);	
		
	}
}
