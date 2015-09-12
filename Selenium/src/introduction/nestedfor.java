package introduction;

import java.util.ArrayList;

public class nestedfor {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Integer>arrlist=new ArrayList<Integer>();
		arrlist.add(10);
		arrlist.add(20);
		arrlist.add(60);
		arrlist.add(10);
		int x=0;
		int a=0;
		int b=0;
		
		
		for(int i=0;i<(arrlist.size()-1);i++)
		{
			a=arrlist.get(i);
			for(int z=1;z<(arrlist.size()-1);z++)
			{
				b=arrlist.get(z);
				
				if(b==a)
				{
					System.out.println("a"+a+"b"+b);
					x++;
				}
			}
		}
		System.out.println(b+" "+x);

	}

}
