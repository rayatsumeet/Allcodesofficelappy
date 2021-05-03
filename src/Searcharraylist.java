import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Searcharraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List a = new ArrayList(1);
		Random r = new Random();
		for(int i=0;i<=10;i++)
		{
		int rn=	r.nextInt(10);
		
			a.add(rn);
		}
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		Collections.sort(a);
		
		System.out.println(a);

	}

}
