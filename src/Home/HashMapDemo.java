package Home;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo 
{
	
	public static void main(String[] args) 
	{
		
		Hashtable<String, String> studDetials=new Hashtable<>();
		
		studDetials.put("4", "jobito");
		studDetials.put("5", "india");
		studDetials.put("6", "pune");
		studDetials.put("1", "rushi");  // Entry
		studDetials.put("2", "hi");
		studDetials.put("3", "hello");
		studDetials.put("1", "abhishek"); 
		studDetials.put("1", "lahu"); 
//		studDetials.put(null, "huhiuh"); 
//		for(int i:CollectionName)
		
		for(Map.Entry<String, String> st:studDetials.entrySet()) 
		{
//			System.out.println(st);
			System.out.println(st.getKey()+ " "+st.getValue());
		}
		
		
	}

}
