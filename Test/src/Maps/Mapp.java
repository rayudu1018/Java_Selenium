package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Mapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> mymap = new HashMap<String, String>();
		mymap.put("key10", "value10");
		mymap.put("key20", "value20");
		mymap.put("key30", "value30");
		mymap.put("key40", "value40");
		Set<String> s= mymap.keySet();
		System.out.println(s);
		s= new TreeSet<>(s);
		System.out.println(s);

	}

}