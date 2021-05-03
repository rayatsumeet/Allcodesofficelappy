
public class Arrayman {

	public static void main(String[] args) {
		int a[]= new int[]{ 2, 3, 5, 7, -7, 5, 8, -5 };
		int maxmul=0;
		int num1=0;
		int num2=0;
	
		for( int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				
			if(	a[i]*a[j]>maxmul)
			{
				maxmul=a[i]*a[j];
			num1=	a[i];
			num2=	a[j];
				
			}
			
			
			}
		}
		
    	System.out.println(num1+ " " + num2);
		System.out.println(maxmul);
	}

}
