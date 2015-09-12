package introduction;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Integer>mylist=new ArrayList<Integer>();
		
		mylist.add(15);
		mylist.add(5);
		mylist.add(35);
		mylist.add(45);
		
		for(int i=0;i<mylist.size();i++)
		{
		 System.out.println("retrieved element is:"+mylist.get(i));
		}
		
		
		
		

	}

}
