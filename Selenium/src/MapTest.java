import java.util.*;

public class MapTest {
	
	//static HashMap<String,String> hm = new HashMap<String, String>();

	// Create the HashMap
	public static void main(String[] args){
	//HashMap<String,String> hm = new HashMap<String, String>(); //在当前或者全局静态的
	TreeMap<String,String> hm = new TreeMap<String, String>();//输出结果是sorted

	HashMap<String,Double> hmd = new HashMap<String, Double>(); 
	
	HashMap hmt = new HashMap();  	
	hmt.put(1, 2);
	hmt.put("a","b");
	System.out.println(hmt.get(1));
	System.out.println(hmt.get("a"));
//不需要限定类型  hashmap只是体现一一对应的关系
	System.out.println("***************");
	
	// Put data
	hm.put("Katie","Android, WordPress");
	hm.put("Magda", "Facebook");
	hm.put("Vanessa", "Tools");
	hm.put("Ania", "Java");
	hm.put("Ania", "JEE");  // !! Put another data under the same key, old value is overridden
	hm.put("Jeff", "");
	//hm.put("", "");
	hm.put("", new String("99"));


	// HashMap iteration from key to value
	for (String key: hm.keySet())
	    System.out.println(key);
	System.out.println("***************");
	
	for (String val: hm.values())
	    System.out.println(val+":"+hm.get(val));
	
	System.out.println("***************");

	if (hm.containsKey("Katie"))
	    System.out.println("HashMap contains key 'Katie'");
	     
	if (hm.containsValue("Cooking"))
	    System.out.println("HashMap contains value 'Cooking'");
	else
	    System.out.println("HashMap DOESN't contain value 'Cooking'"); 
}
}
