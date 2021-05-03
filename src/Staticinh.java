
class one
{
	public final void geta()
	{
		System.out.println("from class A");
	}
	
}


class sec extends one
{
	public void getb()
	{
		System.out.println("from class B");
	}
	
}




public class Staticinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sec ob = new sec();
		ob.geta();
		ob.getb();
		

	}

}
