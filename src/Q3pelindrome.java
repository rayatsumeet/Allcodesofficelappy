
public class Q3pelindrome {
	

	 int num = 121;
		
	static	 int rev=0;
		public void  pelinddrome()
		{
         
		while(num>0)
		{
			
		num = num %10;
		System.out.println(num);
		rev = rev *10 + num;
		
		num = num/10;
	
		}
	
		
		}

		
		public static void main(String ar[])
		{
			
		//	System.out.println("rev is "+rev);
			Q3pelindrome ob = new Q3pelindrome();
			
			ob.pelinddrome();
			System.out.println("rev is "+rev);
		}

}
