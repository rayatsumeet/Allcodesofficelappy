import java.util.ArrayList;
import java.util.List;

class over


{
	
	public static void main(String ar[])
	{
		
		
		List<Integer> a = new ArrayList<Integer>();
		
		
		a.add(2);
		a.add(3);
		a.add(1);
		a.add(5);
		a.add(6);
		
		
		
		
		for(int i=0;i<a.size();i++)
		{
			
			if(a.get(i)%2==0)
			{
				a.remove(i);
				
				
			}	
			
		}
		
		for(Integer a1:a)
		{
			System.out.println(a1);
			
		}
		
		
		
		
		
		
		
	}
	
	
}
