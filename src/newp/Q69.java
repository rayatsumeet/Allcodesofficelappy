package newp;

import java.util.ArrayList;

public class Q69 {

	public static void main(String[] args) {
		String a = "sweetmytoastahhhtoastlasttoasttoast";
		int count=0;
		String m="";
	
          
	
			System.out.println(a.indexOf("toast"));
			System.out.println(a.lastIndexOf("toast"));
			
			int startindex= a.indexOf("toast");
			int endinex= a.lastIndexOf("toast");
			
			for(int i=startindex+5;i<=endinex-1;i++)
			{
			 m= m + String.valueOf(a.charAt(i));	
			 
			}
		
              System.out.print(m);
		
	}

}
