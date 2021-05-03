
public class Stock {

	public static void main(String[] args) {
		int a[]= new int[]{14, 12, 70, 15, 99, 65, 21, 90};
		//
		int max=0;
		int inday=0;
		int thadaystock =0;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a.length-1;j++)
			{
				
				int bigd= a[i] - a[j];
				
			//	System.out.print(" "+bigd);
				if(bigd>max)
				{
					max=bigd;
				inday=	a[i];
				thadaystock=	a[j];
					
				}
				
			
				
				
				
			}
		}
		System.out.println("max is  "+max);
		System.out.println("sell  "+inday);
		System.out.println("buy "+thadaystock);
		
		

	}

}
