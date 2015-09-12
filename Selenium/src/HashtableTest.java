

import java.util.Hashtable;

public class HashtableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Hashtable <String,String> ht = new Hashtable<String,String>();   
   //Hashtable synchronized  cannot be null
   //Hashmap  unsynchronized  can be null
 
   ht.put("1", "AAA");
   ht.put("2","BBB");
   System.out.println(ht);
   System.out.println(ht.size());
   System.out.println(ht.containsKey("2"));
   System.out.println(ht.isEmpty());

	}

}
