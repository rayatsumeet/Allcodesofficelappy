
public class duplicatestring {

	public static void main(String[] args) {
//count duplicates in string
         String a = "sumeet";
         int count =0;
         char b ='0';
         int i,j;
         for( i=0;i<a.length()-1;i++)
         {
            for( j=i+1;j<a.length()-1;j++)
            {
            String aa=	String.valueOf(a.charAt(i));
           String bb= 	String.valueOf(a.charAt(j));
            	
            	if(aa.equals(bb))
            	{
            		count++;
            		System.out.println(aa);
            
            	}
            }
        	 
         }
System.out.println(count);
//System.out.println(b);
	}

}
