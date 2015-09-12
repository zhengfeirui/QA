package introduction;

public class method 
{
       static char result;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//method a=new method();
		//int result=a.smalest(3,6,5);
		//System.out.println("smallest is"+result);
		
		
		
		

	}
	public static int largest(int x,int y) //returns largest integer
	{
		if(x>y)
		{
			return x;
		}
		else if(x==y)
		{
			return 0;
		}
		else
			return y;
		
	}
	public static int smallest(int x,int y) //returns smallest integer
	{
		if(x<y)
		{
			return x;
		}
		else if(x==y)
		{
			return 0;
		}
		else
		{
			return y;
		}
	}
	static int counter1=0;
	public static int smalest(int a,int b,int c)
	{
		if((a<b)&&(a<c))
		{
			return a;
		}
		else if((a>b)&&(b>c))
		{
		    return c;
		}
		else 
			return b;
	}
	
}
