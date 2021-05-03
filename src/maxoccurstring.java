import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class maxoccurstring {

	public static void main(String[] args) {
	String s= "test string";
	Map<Character,Integer> map = new HashMap<Character,Integer>(); 

	for (int i = 0; i < s.length(); i++) {
	  char c = s.charAt(i);
	  if (map.containsKey(c)) {
	    int cnt = map.get(c);
	   
	    map.put(c, ++cnt);
	  } else {
	    map.put(c, 1);
	  }
	}
	
	for(Map.Entry m :map.entrySet()) {
		System.out.println(m.getKey() +" " + m.getValue());
	}
	
	}

}
