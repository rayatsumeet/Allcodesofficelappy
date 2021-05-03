import java.util.ArrayList;

public class SubArray0 {

	public static void main(String[] args) {
		int a[]= new int[] {1,2,3,6,8};
	ArrayList<Object> e = new ArrayList<>();
	ArrayList<Object> o = new ArrayList<>();
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				e.add(a[i]);
				
			}
			
			else
			{
				System.out.println("odd"+ a[i]);
				o.add(a[i]);
			}
			
			
		}
		
	e.addAll(o);
	
	for(int i=0;i<=e.size()-1;i++)
	{
		System.out.println(e.get(i));
	}

	}

}
