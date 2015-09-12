

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList <String> ll = new LinkedList <String> ();
        ll.add("Apple");
        ll.add("Boy");
        ll.add("Cat");
        ll.add("Dog");
        
        System.out.println(ll);
        
        Iterator <String> ia = ll.iterator();// iterator 是一个method 不是新建一个instance
        while(ia.hasNext()){
        	Object value = ia.next();
        	System.out.println(value);
        
        if ( value.equals("Cat") ){
        	ia.remove();
        }
        }
        
        
       for (String sl:ll){
        	
        System.out.println(sl);
        	
       }
              
       
       
	}

}
