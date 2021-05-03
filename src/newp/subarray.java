package newp;

import java.util.ArrayList;

public class subarray {

	public static void main(String[] args) {
		int a[]= new int[] {1, 2, -2, 3, 4, 5, 6};
		ArrayList<Integer> list = new ArrayList<>();
	//int sum=0;
		outer:
		for(int i=0;i<=a.length-1;i++)
		{
			int sum=0;
			list.removeAll(list);
			for(int j=0;j<=a.length-1;j++)
			{
				
				sum= sum+a[j];
				list.add(a[j]);
				if(sum==0)
				{
				
					System.out.print(list.toString());
				//	break outer;
				}
				
				
			}
		
		}
		
		for(int h=0;h<=list.size()-1;h++)
		{
		//	System.out.print("" +"  " + list.get(h));
		}

	}

}
