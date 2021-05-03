package newp;

public class Fetchintfromstring {

	public static void main(String[] args) {
		String a = "it 15 is25 a 20string";
		//int b= 97;
		int sum=0;
 // char[]n= a.toCharArray();
  
  for(int i=0;i<a.length()-1;i++)
  {
	  int aa= 	 a.charAt(i);
	  
	  if(aa < 97 && aa!=32)
	  {
		System.out.print(a.charAt(i));
		

	//	sum = sum + a.charAt(i);
	  }
  }
      
//	System.out.println(sum);
    

	}

}
