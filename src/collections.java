import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class collections {

	
	    public static void main (String[] args) 
	    { 
	        List<Integer> al = new ArrayList<Integer>(); 
	        List<Integer> all = new ArrayList<Integer>(); 
	        
	      al.add(20);
	      al.add(20);
	      al.add(30);
	  
	        	      Object a[] = al.toArray(); 
	        	      
	        	      for(Object b:a)
	        	      {
	        	    	  System.out.print(b);
	        	      }
	    }

		  int a1[]= new int[]{20,30};
	List<Integer> a3=  new ArrayList(Arrays.asList(a1));
	  
	}

