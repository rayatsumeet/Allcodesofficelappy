
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Object> ob = new ArrayList<Object>();
		
		ob.add("sumeet");
     	ob.add(1);
		
	Object a=	ob.get(1);
	
//	System.out.println(ob);
	
  
	Iterator it = ob.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	HashSet obb = new HashSet();
	
	obb.add("22");
	obb.add("2");
	obb.add("sumeet");
	obb.add("sumeet");
	obb.add("ra");
	obb.add(null);
	obb.add(null);

	System.out.println(obb);
	Hashtable h = new Hashtable();
	
	h.put("1", null);
	//h.put(null,"rayat");

	System.out.println(h);	

	}
	

	

}
