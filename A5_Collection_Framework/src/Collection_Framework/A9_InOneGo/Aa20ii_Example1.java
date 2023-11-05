package Collection_Framework.A9_InOneGo;

import java.util.HashMap;
import java.util.Map;

public class Aa20ii_Example1 {

	public static void main(String args[])
	{
		
		Map m = new HashMap();
		m.put(101, "abc");
		m.put(102, "pqr");
		m.put(103, "xyz");
		
		m.put(101, "jkl"); // Duplicate Key is not allowed
		                   // but if you try to do it 
						   // then the old Key value will be 
						   // updated with the new Key value
		//m.clear();
		
		System.out.println(m);
		
		Map m2 = new HashMap();
		m2.put("Name","Swapnil");
		m2.put("City","Mumbra");
		m2.put("Pincode","400612");
		m2.put("Name2", "Swapnil");
		m2.put(null,null);
		m2.put(null,"aaa"); // multiple null values are not allowed
		m2.putAll(m);
		
		System.out.println(m2);
		
		System.out.println(m2.containsKey(103));
		
		System.out.println(m2.containsValue("Mumbra"));
		
		System.out.println(m.get(102));
		
		System.out.println(m2.isEmpty());
		
		m2.remove("Name2");
		
		System.out.println(m2);
		
		m2.replace("Pincode", "123456");
		
		System.out.println(m2);
		
		System.out.println(m2.size());
		
		
		
		
		
		
		
	}
}
