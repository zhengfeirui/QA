package introduction;

public class largestandsmall {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
	int numbers[]=new int[]{32,43,53,54,32,65,98,43,23};
	
	int smallest=numbers[0];//assign first element of array number to array smallest
	int largest=numbers[0];  //assign first element of array number to array largest
	
	for(int i=0;i<numbers.length;i++)
	{
		if(numbers[i]>largest)
			largest=numbers[i];
		else if(numbers[i]<=smallest)
			smallest=numbers[i];
	}
	System.out.println("largest number is "+ largest);
	System.out.println("smallest number is "+ smallest);
	
	

	}

}
