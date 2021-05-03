
public class Stringman {

	public static void main(String[] args) {
		String a = "aryanr";
		int len = a.length()-1;
		outer:
		for(int i=0;i<=a.length()-1;i++)
		{
			for(int j=i+1;j<=a.length()-1;j++)
			{
				if(a.charAt(i)!=a.charAt(j))
				{
					if(j==a.length()-1) {
						System.out.println(" non repeating" + " "  +a.charAt(i));
						break outer;
					}
					
				}
				else
				{
					break;
				}
			
				
				
					
				
			}
			
		}

	}

}
