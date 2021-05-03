
public class Q7Duplicatearray {
	
	public static void main(String ar[])
	{
		
		int a[]= new int[]{1,2,3,4,0,4,5,7,7,1,0};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]==a[j])
				{
					System.out.println("duplicate"+a[i]);
				}
				
				else
				{
					
				}
			}
		}
		
		
	}

}
