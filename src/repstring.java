import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class repstring {

	public static void main(String[] args) {
		String a = "sumeet";
		
	char b[]=	a.toCharArray();
	List<Object> l = new ArrayList<>();
       //  l= Arrays.asList(b);
       for(int i=0;i<=b.length-1;i++)
       {
    	if(l.contains(b[i]))
    	{
    		System.out.println("contain" + " "+ b[i]);
    	}
    	else
    	{
    		l.add(b[i]);	
    	}
    	
    	
       }
       for(Object ll:l)
       {
    	   System.out.println(ll);
       }
         
       

	}

}
