
public class Q1Reverse {
	
	String  a = "sumeet";
	public void  rev()
	{
		
		for(int i= a.length()-1;i>=0;i--)
		{
			System.out.println(a.charAt(i));
		}
		
	}

	
	public static void main(String ar[])
	{
		
		
		Q1Reverse ob = new Q1Reverse();
		
		ob.rev();
	}
}
