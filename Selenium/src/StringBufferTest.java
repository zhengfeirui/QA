

public class StringBufferTest {
	
	public static void main(String[] args){
		
		StringBuffer b = new StringBuffer("haha wo hao xiang nv ren,wo hen se?");
		b.append(" whats up");
		System.out.println(b);
		
		b.deleteCharAt(0);
		System.out.println(b);
		
		b.delete(0, 3);
		System.out.println(b);
		
		StringBuffer d = new StringBuffer("haha wo hao xiang nv ren,wo hen se?");
		char[] arr =new char[6];
		d.getChars(18, 24, arr, 0);
		for(int i=0;i<arr.length;i++){
	    System.out.println(arr[i]);
		}
		
		
		StringBuffer c = new StringBuffer("haha wo hao xiang nv ren,wo hen se?");
		c.insert(0, "hi");
		System.out.println(c);
		c.setCharAt(0,'H');
		System.out.println(c);
		c.setLength(5);
		System.out.println(c);
		c.reverse();
		System.out.println(c);
		c.replace(0, 5, "HAHAH");
		System.out.println(c);
		





		
	}

}
