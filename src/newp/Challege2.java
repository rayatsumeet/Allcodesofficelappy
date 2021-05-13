package newp;

public class Challege2 {

	public static void main(String[] args) {
		String a = "(c(oder)) b(yte)";
		int opbrakcount=0;
		int closebrakcount=0;
		for(int i=0;i<=a.length()-1;i++)
		{
			if(a.charAt(i)==40)
			{
				opbrakcount++;
			}
			
			if(a.charAt(i)==41)
			{
				closebrakcount++;
			}
			
		}
		
		if(opbrakcount==closebrakcount)
		{
			System.out.print(true);
		}
		else
			System.out.print(false);
			

	}

}
