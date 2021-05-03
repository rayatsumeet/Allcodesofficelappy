package newp;

public class StringQ101 {

	public static void main(String[] args) {
	  String a = "131231231231231231231231231212312312";
	  
	boolean flag= false;
	   for(int i=0;i<=a.length()-1;i++)
	   {
		   
		 if(a.charAt(i)>=97 && a.charAt(i)<=122)
		 {
			//System.out.println("xharacter is "+" "+a.charAt(i));
			flag= false;
		 }
		 else
		 {
			 flag= true;
		 }
	   }
	   System.out.println(flag);
	  
	  

	}

}
