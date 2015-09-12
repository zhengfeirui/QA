
public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		age ageNum = new age();
		ageNum.set(5);
		System.out.println(ageNum.get());
		
		//A a = new A(); //abstract class cannot be instanced
		B b = new B();
		b.callme();
		
		d D  = new d();
		System.out.println(d.y);
		System.out.println(d.x);
		System.out.println(D.y);
		System.out.println(D.x);
		D.show(5,9);
		D.result(4,5);

	}
}

class age{
	private int p;
	public void set(int j){   //no return  void
		p =j;
	}
	public int get(){   //has return    int type
		return p;
	}
}

abstract class A{
	abstract void callme(); //use abstract 的classname是因为有abstract method的调用
	public void callmetoo(){
		System.out.println("Hello for public!");//在abstract的class里面可以定义函数
	}
}

class B extends A{
	void callme(){
		System.out.println("Hello for abstract!"); //继承A 对A中得abstract class进行initilized
	}
}

interface I1{
	int x =99;
    public void show(int k,int m);
}

interface I2{
	int y =88;
	public void result(int k,int m);
}

class d implements I1,I2{
	public void show(int k,int m){
		System.out.println(k+m);
	}
	public void result(int k,int m){
		System.out.println(k+m);
	}
}