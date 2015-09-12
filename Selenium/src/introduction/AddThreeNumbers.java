package introduction;
import org.junit.Assert;
import org.junit.Test;

public class AddThreeNumbers {
    static int sum =0; //在class里面直接定义static，那么所有class里面的都可以直接用
                      //如果是直接在static main函数里面定义的variable的话，那么只能在此函数里面直接使用，但是出了这个函数就不行了
                     //程序中得static main，类似于在class里面直接定义的static 变量， 因此可以是属于主入口
                     //程序中得static sum函数的话，类似于在class里面直接定义的static 变量，因此可以随意使用 不需要定义object
	public static void main(String[] args) {

		int num1 =11;
        int num2 =22;
        int num3 =33;
        
       // AddThreeNumbers a = new AddThreeNumbers();
        //sum = a.sum(num1,num2,num3);
        sum = sum(num1,num2,num3);
        System.out.println("The sum is "+sum);
	}
	
/*
	public int sum(int x,int y,int z){ 
		//如果sum前面没有static 就说明sum这个函数不是全局的，你不能直接调用，必须新建class里面的一个类来调用
		//如果sum前面有static，那就说明是全局的 直接拿来可以用，不需要新建一个object
		int sumThree =x+y+z;
		return sumThree;
	}
*/
	
public static int sum(int x, int y, int z){
	int sum = x+y+z;
	return sum;
}
	


@Test

public void testsum(){
	Assert.assertEquals(66, sum);
}

}
