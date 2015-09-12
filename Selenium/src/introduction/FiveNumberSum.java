package introduction;
import org.junit.Assert;
import org.junit.Test;


public class FiveNumberSum {

public static int Sum5(){
	int number1 =11;
	int number2 =22;
	int number3 =33;
	int number4 =44;
	int number5 =55;
    int sum;
    sum = number1+number2+number3+number4+number5;
    System.out.println("The sum is "+sum);
    return sum;
	
}
	
	
@Test
public void testSum(){
	int totalSum = Sum5();
	Assert.assertEquals("This is a junit test",165,totalSum);
}

}
