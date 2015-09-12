
public class ConvertIntString {
	
	int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b;
        String a ="100";
        int x = Integer.parseInt(a);//string转为int
        String y = String.valueOf(x);//int to string
        int z = Integer.valueOf(y);  
        
        //使用valueof method就可以了
        
       // System.out.println(b);// as b is defined in main method, it is local variable; local variable needs to initialized 
                               //before referenced;

        System.out.println(x-100);
        System.out.println(y);
        System.out.println(z-100);

        
        overloadingClass olc = new overloadingClass();
        overridingClass orc = new overridingClass();
        
        olc.M(1);
        olc.M(a);
        orc.M(1);       //overloading+overriding = polymorphism

	}

}

class overloadingClass{
	
	public static void M(int a){
        System.out.println("Overloading-Integer Method");

	}
	public static void M(String b){
        System.out.println("Overloading-String Method");//同一个class有2个同名的method 只是signature不同 叫做overloading

	}
}

class overridingClass extends overloadingClass{
	public static void M(int a){
        System.out.println("Overriding Method");//对父类的class继承后 进行method修改 叫做overriding

	}
}