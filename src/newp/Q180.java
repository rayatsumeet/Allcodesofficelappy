package newp;

public class Q180 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int temp=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(i==a.length-1)
			{
				break;
			}
		temp= a[i];
		a[i]=a[i+1];
		a[i+1]=temp;
		
		i=i+1;
			
		}
		
		for(int aa:a)
		{
			System.out.print(" "+aa);
		}
	}

}
