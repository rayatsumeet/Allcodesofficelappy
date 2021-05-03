package newp;

public class Unique3digit {

	public static void main(String[] args) {
		
	int a = 	6789;
   int b = 6789;
	int count1=0;
   int count=0;
	//last digit
	a=a%10;
	//System.out.println(a);	
    while(b!=0)
    {
    b= b/10;
    System.out.println(b);
    count++;
    if(count==3)
    	break;
    }
	
	for(int i=b;i<=a;i++)
	{
	for(int j=b;j<=a;j++)
	{
		for(int k=b;k<=a;k++)
		{
			if(k!=j && k!=i && i!=j )
			{
				System.out.println(i+ " " +j+" "+k);
				count1++;
			}
		}
	}
		
	}
	
	System.out.println(count1);

	}

}
