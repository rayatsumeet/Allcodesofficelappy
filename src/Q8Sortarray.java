
public class Q8Sortarray {
	
	public static void main(String ar[])
	{
		
		int a[] = new int[] {1,22,33,1,2,3,4};
		int c;
		for(int i =0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]>a[j])
				{
					
					c=a[i];
					a[i]=a[j];
					a[j]=c;
							
				}
			}
		}
		
		for(int i =0;i<a.length;i++)
		{
		System.out.println(a[i]);	
		}
		
	}

}
