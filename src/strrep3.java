import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class strrep3 {

	public static void main(String[] args) {
		String intial = "zcgzigandkatzjgcaketoketzvg";
	//String intial= "testatzahhhhzahhhhzahhhh";
		ArrayList<Object> aa= new ArrayList<>();
		
	//	char[] a=	intial.toCharArray();
		
	//	List<char[]> l= Arrays.asList(a);
	
		for(int i=0;i<=intial.length()-1;i++)
		{
		//	System.out.println("inside loop");
	           if(i==intial.length()) {
	        	//   System.out.println("breafk");
			break ;
			
				
	           }
	           
	           else
	           {
	        		if(intial.charAt(i)=='z' && intial.charAt(i+2)=='g')
					{
					//	System.out.println("inside if");
				//	 aa.remove(intial.charAt(i+1));
	        			aa.add(intial.charAt(i));
	        			aa.add(intial.charAt(i+2));
	        			i=i+2;
	        			
	        			
	        			
					}
					else
					{
					//	System.out.println("else if");
					aa.add(intial.charAt(i));
					}
				
			}
			
		
			
		
			
			
			
			
	
		}
		
		
		for(int i=0;i<=aa.size()-1;i++)
		{
			System.out.print(aa.get(i));
		}

	}

}
