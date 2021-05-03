

	public class ex
	{
	    public static void main(String[] args) 
	    {
	        method();
	        System.out.println("ggg");	    }
	     
	    public static void method( ) {
	    	
	    	try {
	        throw new NullPointerException();
	    }
	    	catch(NullPointerException r)
	    	{
	    		 System.out.println("ggg");
	    	}
	}
	}
  
