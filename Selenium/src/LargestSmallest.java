

public class LargestSmallest {

	//Find the largest number
	public static int largest(int x, int y){
		if (x>y) {
			return x;
		}
		else if (x<y) {
			return y;	
		}
		else {
			return 0;
		}
	}
	
	//Find the smallest of the three
	public static int smallest(int x, int y,int z)
	{
		if(x<y && x<z) {
			return x;
			}
		else if(y<x && y<z) {
			return y;
			}
		else  {
			return z;
			}
		}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a object for the MethodExample class
      LargestSmallest a = new LargestSmallest();
      int result1 = a.largest(2,5);
	   System.out.println("The largest number is "+result1);
	  int result2 = a.smallest(3,2,5);
	  System.out.println("The smallest number is "+result2);

	}

}
