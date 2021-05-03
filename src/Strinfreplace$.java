import java.util.ArrayList;
import java.util.List;

public class Strinfreplace$ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a = "tomorrow";
char c[]= a.toCharArray();
int count=0;
List<Object> l = new ArrayList<>();

for(int i=0;i<=c.length-1;i++)
{
	if(c[i]!='o')
	{
		l.add(c[i]);
	}
	else
	{
	
		for(int j=0;j<=count;j++)
		{
			l.add("$");
		}
		count++;
	}
}

for(int h=0;h<=l.size()-1;h++) {
	System.out.print(l.get(h));
}


	}

}
