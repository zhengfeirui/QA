

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
@Test(dataProvider = "regData")

public void registerForm(String userName,String passWord,int age,String city){
	System.out.println(userName+" "+passWord+" "+age+" "+city);
}

@DataProvider
public Object[][]  regData()
{
	Object [][] data = new Object[3][4]; //can include diff types as it is object collection
	data[0][0] = "usr1";
	data[0][1] = "pwd1";
	data[0][2] = 18;
	data[0][3] = "duluth";
	
	data[1][0] = "usr2";
	data[1][1] = "pwd2";
	data[1][2] = 19;
	data[1][3] = "fremont";
	
	data[2][0] = "usr3";
	data[2][1] = "pwd3";
	data[2][2] = 20;
	data[2][3] = "logan";

	return data;
	


	}

}
