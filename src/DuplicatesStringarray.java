
public class DuplicatesStringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a[]=new String[] {"aa","rayat","raj","sumeet","raj","sumeet","rahul","aa"};
		String c[]= new String[a.length-1];
		
		int j=0;
		int k=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(i==0 && a[i].equals(a[j]) )
			{
				  c[k]	=	a[i];
				  k++;
			}
			if(a[i].equals(a[j]))
			{
				System.out.println("elements duplicate");
			}
			
			else
			{
		  c[k]	=	a[i];
		  k++;
			}
			
			a[j]=a[i];
		}
			for(int i=0;i<c.length-1;i++)
			{
				System.out.println(c[i]);
			}
		
		
		

	}

}
