package newp;

public class CountoccuranceofCharsequences {

	public static void main(String[] args) {
		String a = "Theisisthethesis";
		int countthe=0;
		int countis=0;
	a=	a.toLowerCase();
		
		for(int i=0;i<=a.length()-1;i++)
		{
			if(a.charAt(i)=='t' && a.charAt(i+1)=='h' &&a.charAt(i+2)=='e')
			{
				countthe++;
			}
			
			if(a.charAt(i)=='i' && a.charAt(i+1)=='s')
			{
				countis++;
			}
			
		}
		System.out.println("count of the"+" " +countthe+" "+"count of is "+" " + countis);
		
		if(countthe==countis)
		{
			System.out.println("equals");
		}
		
		else
		{
			System.out.println("not equals");
		}

	}

}
