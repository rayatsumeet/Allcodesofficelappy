
public class DString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		String a = "qwrrereee";
		outerloop:
		for(int i=0;i<a.length();i++)
		{
			for(int j=i+1;j<a.length();j++)
			{
			
				if(a.charAt(i)==a.charAt(j))
				{
					count++;
					System.out.println(a.charAt(j));
				}
			}
			
		}

	}

}
