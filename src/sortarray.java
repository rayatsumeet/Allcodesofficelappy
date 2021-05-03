
public class sortarray {
	
	public static void main(String arhs[])
	{
		int c;
			int a []= {1,3,44,6,7,899,1,22,0};
			int i,j;
			for( i=0;i<=a.length;i++)
			{
			
				for( j=i+1;j<a.length;j++)
					
				{
					if(a[i]>a[j])
					{
						c=a[i];
						a[i]=a[j];
						a[j]=c;
					//	System.out.println(a[i]);
						
					}
					
				}
				
			}
		//	System.out.println(a[a.length-1]);
			for( i=0;i<=a.length-1;i++)
				System.out.println(a[i]);
	}

}
