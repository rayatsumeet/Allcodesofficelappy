
public class q4SpecialString {

	static String a= "123123&&*(0w-02311222";
	
	public static void main(String ar[])
	{
		
//regular expression [a-zA-Z0-9]
		
	a= 	a.replaceAll("[^a-zA-Z0-9]", "");
	
		
		System.out.println(a);
		
		
	}
}
