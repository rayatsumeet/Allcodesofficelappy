
public class Q6maxarray {
	


		
		public static void main(String ar[])
		{
			
			int a[]= {1,2,3,4,5,67,7,8,9,0,0,100};
			
		int	max= a[0];
			for(int i=0;i<a.length;i++)
			{
				if(a[i]>max)
				{
					max= a[i];
					
					
				}
				
			}
			
			System.out.println(max);
		}
	}




