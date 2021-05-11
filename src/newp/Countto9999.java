package newp;

public class Countto9999 {

	public static void main(String[] args) {

         int count=0;
		for(int i=1;i<=100;i++)
		{
			Integer n = new Integer(i);
		String num= 	 String.valueOf(n);
		
		if(num.contains("9"))
		{
			for(int j=0;j<=num.length()-1;j++)
			{
				if(num.charAt(j)=='9')
				{
					count++;
				}
				
			}
			
		}
			
			
			
		}
		
		System.out.print(count);
		
		
		

	}

}
