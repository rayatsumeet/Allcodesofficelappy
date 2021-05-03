import java.util.ArrayList;
import java.util.List;

public class removecharfromstring {

	public static void main(String[] args) {
		String a= "abrambabasac";
		char b[]=a.toCharArray();
		List<Object> l= new ArrayList<>();
		
		for(int i=0;i<=b.length-1;i++)
		{
			if(b[i]=='b' || (b[i]=='a' && b[i+1]=='c'))
			{
				
			}
			else
			{
				l.add(b[i]);
			}
		}
		
		for(Object ll:l)
		{
			System.out.print(ll);
		}

	}

}
