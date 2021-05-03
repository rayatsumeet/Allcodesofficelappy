package newp;

public class Add1toarray {

	public static void main(String[] args) {
	int a[]= {9,9,9,9};
	String s = "";
	
	for(int i=0;i<=a.length-1;i++)
	{
		s= s+ String.valueOf(a[i]);
	}
	
	int v=   Integer.parseInt(s);
	v=v+1;
	System.out.println(v);

	}

}
