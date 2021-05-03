
class Po
{
	private Po()
	{
		System.out.println("private");
	}
	
	private static Po  obj = new Po();
	
	public static Po getInstance()
	{
		
		return obj;
	}
	
	
}



public class pri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	p obj = new p();
Po j=		Po.getInstance();
	

	}

}
