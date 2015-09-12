package introduction;

import java.util.ArrayList;

public class arraylistassign 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	ArrayList<String>mylist=new ArrayList<String>();
	
	mylist.add("John");
	mylist.add("joe");
	mylist.add("harry");
    mylist.add("joe");
    
    String sname1="";
    String sname2="";
    int x=0;
    
    for(int i=0;i<mylist.size();i++)
    {
    	sname1=mylist.get(i);
    	System.out.println("sname1"+ sname1);
    	sname2=sname1;
    	x++;
    }
    	
    	System.out.println("name is"+sname2+x);
    	
    	
    	
    	
    }
	
	

	}

